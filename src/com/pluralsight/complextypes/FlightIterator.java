package com.pluralsight.complextypes;

import java.util.Iterator;

public class FlightIterator implements Iterator<Person> {

    //private CrewMember[] crew;
    public Passenger[] roster;
    private int index = 0;

//    public FlightIterator (CrewMember[] crew, Passenger[] roster) {
//        this.crew = crew;
//        System.out.println("got here in FlightIterator class");
//        System.out.println("crew:  "+crew);
//        System.out.println("this.crew:  "+this.crew);
//        this.roster = roster;
//    }

    public FlightIterator (Passenger[] roster) {
        System.out.println("got here in FlightIterator class");
        this.roster = roster;
        System.out.println("roster:  "+roster);
        System.out.println("this.roster:  "+this.roster);
    }

//    public boolean hasNext() {
//        System.out.println("here in has next");
//        System.out.println("index:  "+index);
//        System.out.println("has next crew:  "+crew);
//        System.out.println("has next this.crew:  "+this.crew);
//        System.out.println("crew.length:  "+crew.length);
//        System.out.println("roster.length:  "+roster.length);
//        return index < (crew.length + roster.length);
//    }
//
//    public Person next() {
//        Person p = (index < crew.length) ? crew[index] : roster[index - crew.length];
//        index++;
//        return p;
//    }

 public boolean hasNext() {
        System.out.println("here in has next");
        System.out.println("roster:  "+roster);
        System.out.println("roster.length:  "+roster.length);
        return index < (roster.length);
}

    public Person next() {
        Person p = (roster[index]);
        index++;
        return p;
    }


}
