package com.revature.day3.day5;

import com.revature.day3.day5.beans.Employee;

import java.io.*;

public class FileReader_02 {
    public static void main(String[] args) {
        try{
            FileInputStream fileInputStream = new FileInputStream("employee.dat");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            Employee employee = (Employee)objectInputStream.readObject();
            System.out.println(employee);
        }catch(

                FileNotFoundException e){
            e.printStackTrace();
        }
        catch (IOException e){
            e.printStackTrace();
        } catch (ClassNotFoundException e){
            e.printStackTrace();
}
        System.out.println("Thank you!");
    }
}
