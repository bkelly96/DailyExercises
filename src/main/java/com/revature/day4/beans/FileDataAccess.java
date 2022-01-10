package com.revature.day4.beans;

public class FileDataAccess implements DataAccess{


    public void save(Employee_Beans employee) {
        System.out.println("Saving employee into file");
    }

    @Override
    public Employee_Beans read() {
        System.out.println("Reading and returning a single employee from File");
        return null;
    }

    @Override
    public Employee_Beans update(Employee_Beans employee) {
        System.out.println("Updating an existing employee in the file");
        return null;
    }

    @Override
    public void delete(int id) {
        System.out.println("Delete an existing employee from the file");
    }
}
