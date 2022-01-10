package com.revature.day3.day5;

import com.revature.day3.day5.beans.Employee;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class FileWrite_02 {
    public static void main(String[] args) {
        Employee employee = new Employee(1, "John", "Candy", "JimmyJohns@kyle.com");
                try{
                    FileOutputStream fileOutputStream = new FileOutputStream("employee.dat");
                    ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
                    objectOutputStream.writeObject(employee);
                    objectOutputStream.close();
                } catch(FileNotFoundException e){
                    e.printStackTrace();
                } catch (IOException e){
                    e.printStackTrace();
                }
    }
}
