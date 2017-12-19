package com.recycler.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Declaring recycler view and
        RecyclerView recyclerView;
        recyclerView = findViewById(R.id.recyclerview_rv);

        // Creating model class object
        List<PersonInterest> personInterestList = new ArrayList<>();

        PersonInterest sneha = new PersonInterest("Sneha", 1000, 2, 3);
        PersonInterest sweety = new PersonInterest("sweety", 10000, 3, 2);
        personInterestList.add(sneha);
        personInterestList.add(sweety);

        // Setting layout and Adapter
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(new InterestAdapter(personInterestList));

    }


}
