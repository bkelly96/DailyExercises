package com.revature.day4.beans;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

public class Day4Main {

    //We should not add new features into the main method, put it into the Interface
    public static void main(String[] args) {
        FileDataAccess dataAccess = new FileDataAccess();
        //DataAccess dataAccess = new DataBaseDataAccess();
        Employee_Beans employee = new Employee_Beans(01, "Kelly", "Brian", 20);
        //fileDataAccess.save(employee);
        dataAccess.save(employee);
        //dataAccess.sort();
    }
}
