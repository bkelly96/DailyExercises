package com.revature.day5;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileWrite_01 {

    public static void main(String[] args) {
        String name = "Brian Kelly";
        System.out.println("Trying to write string into file");
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("file1.dat");
            byte[] arr = name.getBytes();
            fileOutputStream.write(arr);
            fileOutputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
        System.out.println("Completed");

    }
}
