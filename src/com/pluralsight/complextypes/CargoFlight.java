package com.pluralsight.complextypes;

//20180727 Class Inheritance

public class CargoFlight extends Flight {

    float maxCargoSpace = 1000.f;
    float usedCargoSpace;
    int getSeatsOnPlane() {return 12;}//this overrides the flight, used to be int seats = 12

    // constructor that accepts a flight number and refers back to the base class with "super"
    public CargoFlight (int flightNumber) {
        super(flightNumber);
    }

    public CargoFlight (int flightNumber, float maxCargoSpace) {
        this(flightNumber);
        this.maxCargoSpace = maxCargoSpace;
    }

    public CargoFlight() {};

    public CargoFlight (float maxCargoSpace) {
        this.maxCargoSpace = maxCargoSpace;
    }

    public final void add1Package(float h, float w, float d) {// can inherit from cargoflight, but can't override add1package
        double size = h * w * d;
        if (hasCargoSpace((float) size))
            usedCargoSpace += size;
        else
            handleNoSpace();
    }

    private boolean hasCargoSpace(float size){
        return usedCargoSpace + size <= maxCargoSpace;
    }

    private void handleNoSpace() {
        System.out.println("Not Enough Space");
    }





}
