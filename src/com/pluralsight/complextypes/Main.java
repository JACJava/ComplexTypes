package com.pluralsight.complextypes;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
/*
        Flight lax1 = new Flight();
        Flight lax2 = new Flight();

        //add passengers to both flights
        lax1.add1Passenger();
        lax1.add1Passenger();
        lax1.add1Passenger();
        lax1.add1Passenger();
        lax1.add1Passenger();
        System.out.print("LAX 1 Passenger Count is:  ");
        System.out.println(lax1.getPassengers()); //created a "getter" so passengers can be private

        lax2.add1Passenger();
        lax2.add1Passenger();
        lax2.add1Passenger();
        System.out.print("LAX 2 Passenger Count is:  ");
        System.out.println(lax2.getPassengers()); //created a "getter"

        // Null is a reference literal, represents an uncreated object
        Flight lax3 = null;
        if (lax1.hasRoom(lax2)) { //calling hasRoom with lax1 object, lax2 is passed in and will be "f2"
            lax3 = lax1.createNewWithBoth(lax2);
        }

        if (lax3 != null) {
            System.out.print("LAX 3 Passenger Count is:  ");
            System.out.println(lax3.getPassengers());  //created a "getter"
        }

        // 20180725 Accessors and Mutators
        Flight slcToNyc = new Flight();
        slcToNyc.setSeats(150);
        System.out.print("Seats on slcToNyc:  ");
        System.out.println(slcToNyc.getSeats());

        // 20180725 Class Initializers and Constructors Chaining Constructors
        Passenger passenger1 = new Passenger();
        int checkedBags = 5;
        passenger1.setCheckedBags(checkedBags);
        passenger1.figureOutBagFee();
        System.out.print("Checked Bags:  ");
        System.out.println(checkedBags);

        // 20180726 Parameter Immutability:  Primitive Variables
        int val1 = 10;
        int val2 = 20;
        System.out.print("Val 1:  ");
        System.out.println(val1);
        System.out.print("Val 2:  ");
        System.out.println(val2);

        MyMethods.swap(val1, val2);  //val1 and val2 are passed in as copies, so not changed outside of method
        System.out.print("Val 1:  ");
        System.out.println(val1);
        System.out.print("Val 2:  ");
        System.out.println(val2);

        OverInitializedClass c = new OverInitializedClass();
        System.out.print("The Field:  ");
        System.out.println(c.getTheField());

        // 20180726 Parameter Immutability:  Classes
        Flight valFlight1 = new Flight(10);
        Flight valFlight2 = new Flight(20);

        System.out.print("FlightVal 1:  ");
        System.out.println(valFlight1.getFlightNumber()); //need to use the getter!
        System.out.print("FlightVal 2:  ");
        System.out.println(valFlight2.getFlightNumber()); //duh, cuz not a primitive variable

        Flight.swap2(valFlight1, valFlight2);  //val1 and val2 are passed in as copies, so not changed outside of method

        System.out.print("FlightVal 1:  ");
        System.out.println(valFlight1.getFlightNumber()); //need to use the getter!
        System.out.print("FlightVal 2:  ");
        System.out.println(valFlight2.getFlightNumber()); //duh, cuz not a primitive variable


        // 20180726 Parameter Immutability:  Classe Members
        Flight valFlight3 = new Flight(30);
        Flight valFlight4 = new Flight(40);

        System.out.print("FlightVal 3:  ");
        System.out.println(valFlight3.getFlightNumber()); //need to use the getter!
        System.out.print("FlightVal 4:  ");
        System.out.println(valFlight4.getFlightNumber()); //duh, cuz not a primitive variable

        Flight.swapNumbers(valFlight3, valFlight4);  //val1 and val2 are passed in as copies, so not changed outside of method

        // because we changed the members -- the swap now sticks!!!!!!!!
        System.out.print("FlightVal 3:  ");
        System.out.println(valFlight3.getFlightNumber()); //need to use the getter!
        System.out.print("FlightVal 4:  ");
        System.out.println(valFlight4.getFlightNumber()); //duh, cuz not a primitive variable


        Passenger jane = new Passenger(2); // 2 is how many free checked bags, 3 is how many bags checking
        jane.setCheckedBags(3);

        System.out.print("Passenger jane free bags:  ");
        System.out.println(jane.getFreeBags()); //need to use the getter!
        System.out.print("Passenger jane checked bags:  ");
        System.out.println(jane.getCheckedBags()); //need to use the getter!
        System.out.print("Passenger jane per bag fee:  ");
        System.out.println(jane.getPerBagFee()); //need to use the getter!

        Passenger julie = new Passenger(0,1); // 5 is how many free checked bags, 6 is how many bags checking

        System.out.print("Passenger julie free bags:  ");
        System.out.println(julie.getFreeBags()); //need to use the getter!
        System.out.print("Passenger julie checked bags:  ");
        System.out.println(julie.getCheckedBags()); //need to use the getter!
        System.out.print("Passenger julie per bag fee:  ");
        System.out.println(julie.getPerBagFee()); //need to use the getter!

        Passenger fred = new Passenger(2); // 2 is how many free checked bags

        System.out.print("Passenger fred free bags:  ");
        System.out.println(fred.getFreeBags()); //need to use the getter!
        System.out.print("Passenger fred checked bags:  ");
        System.out.println(fred.getCheckedBags()); //need to use the getter!
        System.out.print("Passenger fred per bag fee:  ");
        System.out.println(fred.getPerBagFee()); //need to use the getter!


        // 20180726 Overloading Walkthrough
        // focus on the signatures of overloaded methods
        // public void add1Passenger()
        // public void add1Passenger(int bags)
        // public void add1Passenger(Passenger p)
        // public void add1Passenger(int bags, int carryOns)
        // public void add1Passenger(Passenger p, int carryOns)

        Flight f = new Flight();
        Passenger p1 = new Passenger(0,1); // 0 is how many free checked bags, 1 is how many bags checking
        Passenger p2 = new Passenger(0,2); // 0 is how many free checked bags, 2 is how many bags checking
        System.out.print("Passenger p1 checked bags:  ");
        System.out.println(p1.getCheckedBags()); //need to use the getter!
        System.out.print("Passenger p1 free bags:  ");
        System.out.println(p1.getFreeBags()); //need to use the getter!
        System.out.print("Passenger p1 per bag fee:  ");
        System.out.println(p1.getPerBagFee()); //need to use the getter!
        System.out.print("Pasenger p2 checked bags:  ");
        System.out.println(p2.getCheckedBags()); //duh, cuz not a primitive variable
        System.out.print("Passenger p2 free bags:  ");
        System.out.println(p2.getFreeBags()); //need to use the getter!
        System.out.print("Passenger p2 per bag fee:  ");
        System.out.println(p2.getPerBagFee()); //need to use the getter!

        // public void add1Passenger()
        f.add1Passenger();
        System.out.print("1.  Total Checked Bags:  ");
        System.out.println(f.totalCheckedBags);
        System.out.print("1.  Total Carryons:  ");
        System.out.println(f.totalCarryOns);

        // public void add1Passenger(int bags)
        f.add1Passenger(2);
        System.out.print("2.  Total Checked Bags:  ");
        System.out.println(f.totalCheckedBags);
        System.out.print("2.  Total Carryons:  ");
        System.out.println(f.totalCarryOns);

        // public void add1Passenger(Passenger p)
        f.add1Passenger(p1);
        System.out.print("3.  Total Checked Bags:  ");
        System.out.println(f.totalCheckedBags);
        System.out.print("3.  Total Carryons:  ");
        System.out.println(f.totalCarryOns);

        short threeBags = 3;

        // public void add1Passenger(int bags, int carryOns) (short is converted)
        f.add1Passenger(threeBags, 2);
        System.out.print("4.  Total Checked Bags:  ");
        System.out.println(f.totalCheckedBags);
        System.out.print("4.  Total Carryons:  ");
        System.out.println(f.totalCarryOns);

        // public void add1Passenger(Passenger p, int carryOns)
        f.add1Passenger(p2, 1);
        System.out.print("5.  Total Checked Bags:  ");
        System.out.println(f.totalCheckedBags);
        System.out.print("5.  Total Carryons:  ");
        System.out.println(f.totalCarryOns);

        Flight f2 = new Flight();

        Passenger janet = new Passenger(0,1);
        Passenger john = new Passenger(0,2);

        f2.addPassengers(janet, john);

        Passenger jim = new Passenger(0,2);
        Passenger sarah = new Passenger(0,2);
        Passenger susie = new Passenger(0,0);

        f2.addPassengers(jim, sarah, susie);

        System.out.print("Total Checked Bags:  ");
        System.out.println(f2.totalCheckedBags);
        System.out.print("Total Carryons:  ");
        System.out.println(f2.totalCarryOns);

*/
        //20180727 Class Inheritance, Cargoflight extends flight, has access to characteristics of flight
        CargoFlight cf = new CargoFlight();

        cf.add1Package(1.0f, 2.5f, 3.0f);
        System.out.print("Used cargo space:  ");
        System.out.println(cf.usedCargoSpace); //public variable so no need to use a getter

        Passenger john = new Passenger(1,3);

        //Cargoflight has access to methods in Flight -- so add a passenger to it!
        cf.add1Passenger(john);

        System.out.print("Passenger john checked bags:  ");
        System.out.println(john.getCheckedBags()); //need to use the getter!
        System.out.print("Passenger john free bags:  ");
        System.out.println(john.getFreeBags()); //need to use the getter!
        System.out.print("Total Checked Bags:  ");
        System.out.println(cf.totalCheckedBags);
        System.out.print("Total Carryons:  ");
        System.out.println(cf.totalCarryOns);

        // but just the opposite -- reference of type "Flights" don't have access to Cargoflight's extensions
        Flight f = new CargoFlight();

        Passenger jane = new Passenger(0,2);
        f.add1Passenger(jane);
        System.out.print("Passenger jane checked bags:  ");
        System.out.println(jane.getCheckedBags()); //need to use the getter!
        System.out.print("Passenger jane free bags:  ");
        System.out.println(jane.getFreeBags()); //need to use the getter!

        // a Flight does not know how to add1package -- so the following is invalid:
        //f.add1Package(1.0f, 2.5f, 3.0f);

        Flight f1 = new Flight();
        System.out.print("F1 Seats:  ");
        System.out.println(f1.getSeats());

        CargoFlight cf1 = new CargoFlight();
        System.out.print("CF1 Seats:  ");
        System.out.println(cf1.getSeats());

        Flight f2 = new CargoFlight();
        System.out.print("F2 Seats:  ");
        System.out.println(f2.getSeats()); //because the getseats from Cargo overrides the one from Flight

        // this way only allows us to add 12 passengers regardless of how the object is created with reference type
        // based on type of object created, not the type of reference used
        // method that sets a variable in the inherited class will override the method in the base class
        // variable definitions do not work this way
        f2.add1Passenger();
        f2.add1Passenger();
        f2.add1Passenger();
        f2.add1Passenger();
        f2.add1Passenger();
        f2.add1Passenger();
        f2.add1Passenger();
        f2.add1Passenger();
        f2.add1Passenger();
        f2.add1Passenger();
        f2.add1Passenger();
        f2.add1Passenger();
        f2.add1Passenger(); // too many
        f2.add1Passenger(); // too many

        // 20180727 Equality Two objects with the same flight number
        Flight f3 = new Flight(175);
        Flight f4 = new Flight(175);

        // Are the objects equal, meaning, do the object references point to the same object?
        // no, they don't
        if(f3 == f4)
            System.out.println("Objects are equal");
        else
            System.out.println("Objects are not equal");

        // Are the objects equal using an object function, meaning, do the object references point to the same object?
        // no, they don't
        // but then we redefined the method "equal" to compare the flight number and flight class
        if(f3.equals(f4))
            System.out.println("Objects are equal");
        else
            System.out.println("Objects are still not equal");

        Flight f5 = new Flight(175);
        Flight f6 = f5;

        // Are the objects equal, meaning, do the object references point to the same object?
        // no, they don't
        if(f5 == f6)
            System.out.println("Objects are equal");
        else
            System.out.println("Objects are not equal");

        // classes inherited from the pilot class
        Flight f7 = new Flight(624);
        Flight f8 = new Flight(404);

        f7.add1Passenger();
        f7.add1Passenger();
        f7.add1Passenger();
        f7.add1Passenger();
        f7.add1Passenger();

        CargoOnlyPilot prescott = new CargoOnlyPilot();
        if(prescott.canAccept(f7))
            System.out.println("Prescott can accept Flight 7");
            else
            System.out.println("Prescott cannot accept Flight 7");

        if(prescott.canAccept(f8))
            System.out.println("Prescott can accept Flight 8");
        else
            System.out.println("Prescott cannot accept Flight 8");

        FullLicensePilot dave = new FullLicensePilot();
        if(dave.canAccept(f7))
            System.out.println("Dave can accept Flight 7");
        else
            System.out.println("Dave cannot accept Flight 7");

        if(dave.canAccept(f8))
            System.out.println("Dave can accept Flight 8");
        else
            System.out.println("Dave cannot accept Flight 8");



        // 20180730 Iheritance and Constructors
        Flight f175 = new Flight(175);

        CargoFlight cf2 = new CargoFlight();

        //CargoFlight cf294 = new CargoFlight(294); //even tho the base has a constructor that takes a flight number, cargoflight does not

        CargoFlight cf294 = new CargoFlight(294);

        CargoFlight cf85 = new CargoFlight(85, 2000.0f);

        // 20180801 More About Datatypes StringBuilder

        StringBuilder sb = new StringBuilder(40);
        Flight myFlight = new Flight(175);
        String location = "Florida";

        sb.append("I flew to ");
        sb.append(location);
        sb.append(" on ");
        sb.append(myFlight); //tostring is default on classes -- we override it in the flight class

        System.out.println("My flight is " + myFlight);

        int time = 9;
        int pos = sb.length() - " on ".length() //can call object methods on strings
            - myFlight.toString().length();

        sb.insert(pos, " at ");
        sb.insert(pos + 4, time);

        String message = sb.toString();
        System.out.println(message);


        // 20180803 Exceptions and Error Handling
        Flight f9 = new Flight();
        try {
            f9.addPassengers("C:\\PassengerList.txt");
            //f9.addPassengers("C:\\PassengerList_Julie.txt"); // file not found
            System.out.print("F9 Passengers:  ");
            System.out.println(f9.getPassengers());
        } catch(FileNotFoundException e2) {
            System.out.println("File Not Found:  "+e2.getMessage());
        } catch(IOException e2) {
            System.out.println("Error Interacting with File:  " + e2.getMessage());
        }

    }


}
