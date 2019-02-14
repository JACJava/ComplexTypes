package com.pluralsight.complextypes;

public class OverInitializedClass {

    private int theField = 1; //field initializers
    public int getTheField(){
        return theField;
    }

    {
        theField = 2;  // initializtion block ran after field initializers, work can get invalidated later in a constructor
    }

    public OverInitializedClass() { //add a constructor sets the field to 3
        theField = 3;
    }

}
