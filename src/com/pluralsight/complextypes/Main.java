package com.pluralsight.complextypes.complextypes;

public class Main {

    public static void main(String[] args) {


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



    }


}
