package com.revature.day4.beans;

public abstract class DataBaseDataAccess implements DataAccess{
    @Override
    public void save(Employee_Beans employee) {
        System.out.println("Saving an employee object into Database "+employee);
    }

    @Override
    public Employee_Beans read() {
        System.out.println("Reading a single employee object from DB");
        return null;
    }

    @Override
    public Employee_Beans update(Employee_Beans employee) {
        System.out.println("Updaing an employee data existing in DB");
        return null;
    }

    @Override
    public void delete(int id) {
        System.out.println("Deleting an employee data existing in DB");
    }

    public void findByFirstName(String firstName){
        System.out.println("Find by First Name");
    }

}
