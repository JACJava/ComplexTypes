package com.pluralsight.complextypes;

public final class Passenger { // final means you can't inherit from it

    private int checkedBags;
    private int freeBags;

    private double perBagFee;

    // constructor that doesn't take arguments to allow it to be called with no parameters
    public Passenger() {}

    // constructor that accepts number of free bags
    public Passenger (int freeBags) {
        // make call down to baggage fee constructor
        this(freeBags > 1 ? 25.0d : 50.0d);
        this.freeBags = freeBags;
    }

    // constructor that accepts number of free bags and checked bags
    public Passenger (int freeBags, int checkedBags) {
        this(freeBags); // will call into the constructor with no parameters
        //this.freeBags = freeBags; does the same thing as prior line
        this.checkedBags = checkedBags;
    }

    // constructor that allows us to identify bag fee, make this private
    private Passenger (double perBagFee) {
        this.perBagFee = perBagFee;
    }


    public int getCheckedBags() {return checkedBags;}
    public void setCheckedBags(int checkedBags) {this.checkedBags = checkedBags;}

    public int getFreeBags() {return freeBags;}
    public void setfreeBags(int freeBags) {this.freeBags = freeBags;}

    // Since perbagfee is created by this class, shouldn't be updated from outside the class
    public double getPerBagFee() {return perBagFee;}

    public void figureOutBagFee(){
        perBagFee = checkedBags * 100;
        System.out.print("Checked Bags from Inside the Class:  ");
        System.out.println(this.checkedBags);

        System.out.print("Bag Fee from Inside the Class:  ");
        System.out.println(this.perBagFee);
    }


}
