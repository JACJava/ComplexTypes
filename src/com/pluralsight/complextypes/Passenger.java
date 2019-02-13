package com.pluralsight.complextypes;

public class Passenger {

    private int checkedBags;
    private int freeBags;

    private double perBagFee;

    public int getcheckedBags() {return checkedBags;}
    public void setCheckedBags(int checkedBags) {this.checkedBags = checkedBags;}

    public int getFreeBags() {return freeBags;}
    public void setfreeBags(int freeBags) {this.freeBags = freeBags;}

    // Since perbagfee is created by this class, shouldn't be updated from outside the class
    public double getperBagFee() {return perBagFee;}

    public void figureOutBagFee(){
        perBagFee = checkedBags * 100;
        System.out.print("Checked Bags from Inside the Class:  ");
        System.out.println(this.checkedBags);

        System.out.print("Bag Fee from Inside the Class:  ");
        System.out.println(this.perBagFee);
    }


}
