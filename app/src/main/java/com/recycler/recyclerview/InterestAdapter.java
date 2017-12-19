package com.recycler.recyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by smartron on 18/12/17.
 */

/**
 * To get RecyclerView properties we need to extend the class with
 * RecyclerView.Adapter<ClassName.ViewHolder>.In this class we put all the data together
 * <p>
 * Extending RecyclerView overrides three methods
 */
public class InterestAdapter extends RecyclerView.Adapter<InterestAdapter.ViewHolder> {

    // Declaring Model class
    private List<PersonInterest> personInterests;

    /**
     * Declaring this constructor to supply the model class(PersonInterest.java)
     * data to current class by passing parameters in constructor
     */
    public InterestAdapter(List<PersonInterest> personInterests) {
        this.personInterests = personInterests;
    }

    /**
     * In this class we map all the model class data
     */
    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView name_tv, principal_tv, rate_tv, time_tv, interest_tv;

        public ViewHolder(View itemView) {
            super(itemView);

            name_tv = itemView.findViewById(R.id.name_tv);
            principal_tv = itemView.findViewById(R.id.principal_tv);
            rate_tv = itemView.findViewById(R.id.rate_tv);
            time_tv = itemView.findViewById(R.id.time_tv);
            interest_tv = itemView.findViewById(R.id.interest_tv);

        }
    }

    /**
     * Method 1
     * In this method we inflate the layout into view
     */

    @Override
    public InterestAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.interest_data, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    /**
     * Method 2
     * In this method we bind the data
     */
    @Override
    public void onBindViewHolder(InterestAdapter.ViewHolder holder, int position) {
        holder.name_tv.setText(personInterests.get(position).getName());
        holder.principal_tv.setText(personInterests.get(position).getPrincipal() + "");
        holder.rate_tv.setText(personInterests.get(position).getRate() + "");
        holder.time_tv.setText(personInterests.get(position).getTime() + "");
        holder.interest_tv.setText((int) personInterests.get(position).interestOfPerson() + "");
    }


    /**
     * Method 3
     * In this method we give the model class size
     */
    @Override
    public int getItemCount() {
        return personInterests.size();
    }

}
