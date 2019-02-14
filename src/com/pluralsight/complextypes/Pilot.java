package com.pluralsight.complextypes;

public abstract class Pilot {//if you have an abstract method, must mark class as abstract, abstract means it MUST be extended

    private Flight currentFlight;

    public void fly(Flight f) {
        if(canAccept(f))
            currentFlight = f;
        else
            handleCantAccept();
    }

    // let's leave it up to the pilot types to determine if they can accept the flight
    // abstract makes inheritance required
    public abstract boolean canAccept(Flight f);

    private void handleCantAccept(){
        System.out.println("Can't accept the flight");
    }



}
