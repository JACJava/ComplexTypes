package com.pluralsight.complextypes;

public class Flight {

        // Fields store object data
        private int passengers, flightNumber, seats = 150;
        private char flightClass;
        private boolean[] isSeatAvailable;

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


        public Flight() {}

        public Flight(int flightNumber){
            this.flightNumber = flightNumber; //right hand is the parameter, left hand is the field
        }

        public Flight(char flightClass){
            this.flightClass = flightClass; //right hand is the parameter, left hand is the field
        }


        // Methods are executable code that manipulates state and performs operations
        public void add1Passenger() {
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
            System.out.print("passengers inside hasSeating:  ");
            System.out.println(passengers);
            System.out.print("seats inside hasSeating:  ");
            System.out.println(seats);
            return passengers < seats;
        }


}
