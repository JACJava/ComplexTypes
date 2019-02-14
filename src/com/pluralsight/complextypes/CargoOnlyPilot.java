package com.pluralsight.complextypes;

public class CargoOnlyPilot extends Pilot {

    @Override
    public boolean canAccept(Flight f) {//cargo pilots can't fly any passengers, so if passenger count = 0, then true
        return f.getPassengers() == 0;
    }

}
