package com.revature.day4.beans;


import com.revature.day4.beans.Employee_Beans;

public interface DataAccess {

    void save(Employee_Beans employee);

    Employee_Beans read();

    Employee_Beans update(Employee_Beans employee);

    void delete (int id);

}
