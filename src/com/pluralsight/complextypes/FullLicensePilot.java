package com.pluralsight.complextypes;

public class FullLicensePilot extends Pilot {

    @Override
    public boolean canAccept(Flight f) {//fully licensed pilots can fly any plane
        return true;
    }
}
