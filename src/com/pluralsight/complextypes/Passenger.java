package com.pluralsight.complextypes;

public final class Passenger extends Person implements Comparable<Passenger> { // final means you can't inherit from it, conforms to Comparable contract

    private int checkedBags;
    private int freeBags;

    private double perBagFee;

    private int memberLevel;    //3 (1st priority), 2, 1
    private int memberDays;     //how long someone has been a member

    private String memberName;

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

    // constructor that accepts number of free bags, checked bags, member level, and member days
    public Passenger (int freeBags, int checkedBags, int memberLevel, int memberDays, String memberName) {
        this(freeBags); // will call into the constructor with no parameters
        //this.freeBags = freeBags; does the same thing as prior line
        this.checkedBags = checkedBags;
        this.memberLevel = memberLevel;
        this.memberDays = memberDays;
        this.memberName = memberName;
    }

    // constructor that allows us to identify bag fee, make this private
    private Passenger (double perBagFee) {
        this.perBagFee = perBagFee;
    }


    public int getCheckedBags() {return checkedBags;}
    public void setCheckedBags(int checkedBags) {this.checkedBags = checkedBags;}

    public int getFreeBags() {return freeBags;}
    public void setfreeBags(int freeBags) {this.freeBags = freeBags;}

    public int getMemberLevel() {return memberLevel;}
    public void setMemberLevel(int memberLevel) {this.memberLevel = memberLevel;}

    public int getMemberDays() {return memberDays;}
    public void setMemberDays(int memberDays) {this.memberDays = memberDays;}

    public String getMemberName() {return memberName;}
    public void setMemberName(String memberName) {this.memberName = memberName;}

    // Since perbagfee is created by this class, shouldn't be updated from outside the class
    public double getPerBagFee() {return perBagFee;}

    public void figureOutBagFee(){
        perBagFee = checkedBags * 100;
        System.out.print("Checked Bags from Inside the Class:  ");
        System.out.println(this.checkedBags);

        System.out.print("Bag Fee from Inside the Class:  ");
        System.out.println(this.perBagFee);
    }


    // compare two passenger instances based on frequent flyer program and
    // make higher priority passengers come first

    public int compareTo(Passenger p) {     //add compareTo an interface provided by java, accepts reference to another instance/object
                                            //cast object into an instance of passenger (removed)
        if (memberLevel > p.memberLevel)    // if our member level is higher than the one that's passed in, we are higher
            return -1;                      // we should come before that one
        else
        if (memberLevel < p.memberLevel)    // if we're level 1 and they're number 2, we're first
            return 1;                       // we should come after them
        else {                              // tie -- if equal levels, then check how long we've been a member
            if (memberDays > p.memberDays)  // if our number of days is greater than number of days passed in
                return -1;                  // we come before they do
            else
            if (memberDays < p.memberDays)
                return 1;                   // they're here longer
            else
                return 0;                   // tie, zero
        }
    }

    @Override //redefining what tostring is for a passenger!
    public String toString() {
//        if(flightNumber != null)//can check to see if anything was in there
//            return "Flight Number "+ flightNumber;
//        else if (flightClass != null)
//            return "Flight Class " + flightClass;
//        else
//            return "Flight identity not set";
        //return this.getClass().getSimpleName();
        //return "Level:  " + memberLevel + " Days:  " + memberDays;
        return this.memberName;
    }


}
