package com.revature.day4.family;

public class FamilyMain {

    public static void main(String[] args) {
        FileDataAccess familyAccess = new FileDataAccess();
        Family family = new Family("Brian","Kelly", "Myself");
        familyAccess.save(family);
    }
}
