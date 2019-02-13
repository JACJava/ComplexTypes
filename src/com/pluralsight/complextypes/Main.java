package com.pluralsight.complextypes;

public class Main {

    public static void main(String[] args) {

        /*
        // Class has to be in a separate tab!
        Flight flight1 = new Flight();
        Flight flight2 = new Flight();

        flight1.add1Passenger();
        flight1.add1Passenger();
        flight1.add1Passenger();
        System.out.print("Flight 1 Passenger Count is:  ");
        System.out.println(flight1.passengers);

        flight2.add1Passenger();
        System.out.print("Flight 2 Passenger Count is:  ");
        System.out.println(flight2.passengers);

        // now, point flight2 to flight1
        flight2 = flight1;
        System.out.print("Flight 2 Passenger Count is:  ");
        System.out.println(flight2.passengers);

        MyClass m = new MyClass();
        m.showSum(7.5f, 1.4f, 0);
        System.out.println("I'm back");
        */

        Flight lax1 = new Flight();
        Flight lax2 = new Flight();

        //add passengers to both flights
        lax1.add1Passenger();
        lax1.add1Passenger();
        lax1.add1Passenger();
        lax1.add1Passenger();
        lax1.add1Passenger();
        System.out.print("LAX 1 Passenger Count is:  ");
        System.out.println(lax1.passengers);

        lax2.add1Passenger();
        lax2.add1Passenger();
        lax2.add1Passenger();
        System.out.print("LAX 2 Passenger Count is:  ");
        System.out.println(lax2.passengers);
/*
        // Null is a reference literal, represents an uncreated object
        Flight lax3 = null;
        if (lax1.hasRoom(lax2)) { //calling hasRoom with lax1 object, lax2 is passed in and will be "f2"
            lax3 = lax1.createNewWithBoth(lax2);
        }

        if (lax3 != null) {
            System.out.print("LAX 3 Passenger Count is:  ");
            System.out.println(lax3.passengers);
        }

        Passenger passenger1 = new Passenger();
        int checkedBags = 1;
        passenger1.setCheckedBags(checkedBags);
        passenger1.figureOutBagFee();
        System.out.print("Checked Bags:  ");
        System.out.println(checkedBags);

        int val1 = 10;
        int val2 = 20;
        System.out.print("Val 1:  ");
        System.out.println(val1);
        System.out.print("Val 2:  ");
        System.out.println(val2);

        MyMethods.swap(val1, val2);
        System.out.print("Val 1:  ");
        System.out.println(val1);
        System.out.print("Val 2:  ");
        System.out.println(val2);

*/

    }

}
