package com.pluralsight.complextypes;

public class CrewMember extends Person {
    private String crewMemberName;

    // constructor
    public CrewMember() {}

    public CrewMember (String crewMemberName) {
        this.crewMemberName = crewMemberName;
    }

    // getters and setters
    public String getCrewMemberName() {return crewMemberName;}
    public void setCrewMemberName(String crewMemberName) {this.crewMemberName = crewMemberName;}


}
