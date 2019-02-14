package com.pluralsight.complextypes.complextypes;

public class Flight {

        // Fields store object data
        private int passengers, flightNumber, seats = 150;
        private char flightClass;
        private boolean[] isSeatAvailable;
        int totalCheckedBags;
        int maxCarryOns = seats * 2;
        int totalCarryOns;

        // Constructors are executable code used during object creation to set the initial state
        // 20180725 no name, just brackets = initialization block, automatically executed at the beginning of each of our constructors
        // so no chaining
        {
            isSeatAvailable = new boolean[seats];
            for(int i = 0; i < seats; i++)
                isSeatAvailable[i] = true;
        }

        // Getters and Setters so variables can be private
        public int getSeats(){
            return seats;
        }
        public void setSeats(int seats){
            this.seats = seats; //right hand is the parameter, left hand is the field
        }

        public int getPassengers(){
            return passengers;
        }

        public int getFlightNumber(){ return flightNumber; }
        public void setFlightNumber(int flightNumber){
            this.flightNumber = flightNumber; //right hand is the parameter, left hand is the field
        }

        public Flight() {} // constructor that takes no parameters

        public Flight(int flightNumber){ //constructor that takes 1 parameter, just flight number
            this.flightNumber = flightNumber; //right hand is the parameter, left hand is the field
        }

        public Flight(char flightClass){ //constructor that takes 1 parameter, just flight class
            this.flightClass = flightClass; //right hand is the parameter, left hand is the field
        }

        public void addPassengers(Passenger... list){
            if(hasSeating(list.length)){
                passengers += list.length;
                for (Passenger passenger : list)
                    totalCheckedBags += passenger.getCheckedBags();
            }
            else
                handleTooMany();
        }






        // Methods are executable code that manipulates state and performs operations
        public void add1Passenger() {
            if (hasSeating())
                passengers += 1;
            else
                handleTooMany();
        }
        // 20180726 Overloading -- same method as above with additional parameter passed in
        // it knows where to go based on the number of parameters
        public void add1Passenger(int bags) {
            if (hasSeating()) {
                add1Passenger(); //overloaded -- passed upwards, no rules about names and where it has to be in the code
                totalCheckedBags += bags;
            }
        }
        // 20180726 Overloading -- same method as above with additional parameter passed in
        // it knows where to go based on the number of parameters
        public void add1Passenger(Passenger p) {
                add1Passenger(p.getCheckedBags()); //overloaded -- passed upwards, no rules about names and where it has to be
        }

        // 20180726 Overloading -- same method as above with additional parameter passed in
        // it knows where to go based on the number of parameters
        public void add1Passenger(int bags, int carryOns) {
            if (hasSeating() && hasCarryOnSpace(carryOns)) {
                add1Passenger(bags); //overloaded -- passed upwards, no rules about names and where it has to be
                totalCarryOns += carryOns;
            }
        }

        public void add1Passenger(Passenger p, int carryOns) {
                add1Passenger(p.getCheckedBags(), carryOns); //overloaded -- passed upwards, no rules about names and where it has to be
        }

        // focus on the signatures of overloaded methods

        private void handleTooMany (){
            System.out.println("Too Many");
        }

        // keyword "this" is an implicit reference to the current object
        public boolean hasRoom(Flight f2){
            int total = this.passengers + f2.passengers;
            return total <= seats;
        }

        // returns a new instance of fligh object with new passengers, combined from other flight
        public Flight createNewWithBoth(Flight f2) {
            Flight newFlight = new Flight();
            newFlight.seats = seats;
            newFlight.passengers = passengers + f2.passengers;
            return newFlight;
        }

        private boolean hasSeating (){
            return passengers < seats;
        }

        private boolean hasSeating (int count){
          return passengers + count < seats;
        }

        private boolean hasCarryOnSpace(int carryOns){
            return totalCarryOns + carryOns <= maxCarryOns;
        }

        // 20180726 Parameter Immutability
        public static void swap2(Flight i2, Flight j2) {
            Flight k2 = i2;
            i2 = j2;
            j2 = k2;
            System.out.print("Inside Swap2 i2:  ");
            System.out.println(i2.flightNumber);
            System.out.print("Inside Swap2 j2:  ");
            System.out.println(j2.flightNumber);
        }

        public static void swapNumbers(Flight i3, Flight j3) {
            int k3 = i3.getFlightNumber();
            i3.setFlightNumber(j3.getFlightNumber());
            j3.setFlightNumber(k3);
            System.out.print("Inside SwapNumbers i3:  ");
            System.out.println(i3.flightNumber);
            System.out.print("Inside SwapNumbers j3:  ");
            System.out.println(j3.flightNumber);
        }

}
