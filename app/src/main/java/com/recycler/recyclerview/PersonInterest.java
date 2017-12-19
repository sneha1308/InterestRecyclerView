package com.recycler.recyclerview;

/**
 * Created by smartron on 18/12/17.
 */


// This is a model class to declare all the contents by adding getter and setter methods

public class PersonInterest {

    /**
     * Creating a variable as private could not change the values
     * locally as we are giving security to the variables
     */
    private String name;
    private int principal;
    private int rate;
    private int time;
    private float interest;


    /**
     * By creating parametrised Constructor ONE CAN SUPPLY HIS OWN DATA TO THIS CLASS PROPERTIES INSTEAD OF DEFAULT VALUES.
     */
    public PersonInterest(String name, int principal, int rate, int time) {
        this.name = name;
        this.principal = principal;
        this.rate = rate;
        this.time = time;
    }

    /**
     * LOGIC FOR INTEREST AND WE ARE RETURNING THE VALUE
     */
    public float interestOfPerson() {
        interest = (principal * rate * time) / 100;
        return interest;
    }

    // RETURNING THE values USING GETTER METHODs
    public String getName() {
        return name;
    }

    public int getPrincipal() {
        return principal;
    }

    public int getRate() {
        return rate;
    }

    public int getTime() {
        return time;
    }

}
