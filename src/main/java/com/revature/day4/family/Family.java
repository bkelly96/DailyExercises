package com.revature.day4.family;


import lombok.*;

//@Data
//@NoArgsConstructor
//@AllArgsConstructor
public class Family {

    String firstName;
    String lastName;
    String relationship;


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getRelationship() {
        return relationship;
    }

    public void setRelationship(String relationship) {
        this.relationship = relationship;
    }


    public Family(String firstName, String lastName, String relationship) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.relationship = relationship;



    }
}
