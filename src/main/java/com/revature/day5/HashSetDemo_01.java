package com.revature.day5;

/*
HashSet<E>
Hash table backed Set Implement

Hashing is an Algorithm that will take an object,
use an int value called HashCode - unique value for different onjects, same for a single object
 */


import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class HashSetDemo_01 {
    public static void main(String[] args) {

        Set<Integer> intSet = new HashSet<>();
        //Storing Elements into an ArrayList
        //1. Instantiate and add
        Integer myInt = new Integer(10);
        intSet.add(myInt);

        //2. Instantiate + add
        intSet.add(new Integer(5));

        //3. Instantiate with autoboxing and add
        //autoboxing - an value is getting adding without calling a constructor
        Integer anotherInt = 7;
        intSet.add(anotherInt);

        //4. Auto-boxing + add into collections
        intSet.add(9);
        intSet.add(1);
        intSet.add(10);
        intSet.add(15);

        //Retrieve elements of  an ArrayList /

        // 1. Generic - applicable for all collections
        System.out.println("Using toString()");
        System.out.println(intSet.toString()+"\n");


        //2. Positional Access - Only applicable for List implementations
//        System.out.println("Positional access");
//        for(int c = 0; c < intSet.size() ; c++){
//            System.out.println("Element at the positon " +c+ "is " + intSet.get(c));
//        }

        // 3. Using Iterator - applicable for all Collection implementations
        Iterator<Integer> intIterator =  intSet.iterator();
        while (intIterator.hasNext()){
            int element = intIterator.next(); //Auto-unboxing - using type reference
            System.out.println(element);
        }


    }
}
