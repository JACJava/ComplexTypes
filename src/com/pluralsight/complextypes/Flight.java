package com.pluralsight.complextypes;

public class Flight {

        // Fields store object data
        int passengers;
        int seats;

        // Constructors are executable code used during object creation to set the initial state
        public Flight() {
            //System.out.println("inside constructor");
            seats = 150;
            passengers = 0;
            //System.out.print("passengers inside constructor:  ");
            //System.out.println(passengers);
            //System.out.print("seats inside constructor:  ");
            //System.out.println(seats);
        }

        // Methods are executable code that manipulates state and performs operations
        void add1Passenger() {
            //System.out.print("passengers inside add1Passenger:  ");
            //System.out.println(passengers);
            //System.out.print("seats inside add1Passenger:  ");
            //System.out.println(seats);
            if (passengers < seats)
                passengers += 1;
            else
                handleTooMany();
        }

    // Methods are executable code that manipulates state and performs operations
    /*public void add1Passenger() {
        if (hasSeating())
            passengers += 1;
        else
            handleTooMany();
    }*/

        private void handleTooMany (){
            System.out.println("Too Many");
        }

        private boolean hasSeating (){
            System.out.print("passengers inside hasSeating:  ");
            System.out.println(passengers);
            System.out.print("seats inside hasSeating:  ");
            System.out.println(seats);
            return passengers < seats;
        }

        // keyword "this" is an implicit reference to the current object
        public boolean hasRoom(Flight f2){
            int total = this.passengers + f2.passengers;
            return total <= seats;
        }

        public Flight createNewWithBoth(Flight f2) {
            Flight newFlight = new Flight();
            newFlight.seats = seats;
            newFlight.passengers = passengers + f2.passengers;
            return newFlight;
        }



}
