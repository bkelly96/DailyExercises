package com.revature.day3.day5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList_91 {

        public static void main(String[] args) {
            LinkedList<Integer> intList = new LinkedList<>();

            //Storing Elements into an ArrayList
            //1. Instantiate and add
            Integer myInt = new Integer(10);
            intList.add(myInt);

            //2. Instantiate + add
            intList.add(new Integer(5));

            //3. Instantiate with autoboxing and add
            //autoboxing - an value is getting adding without calling a constructor
            Integer anotherInt = 7;
            intList.add(anotherInt);

            //4. Auto-boxing + add into collections
            intList.add(9);
            intList.add(1);
            intList.add(10);
            intList.add(15);

            //Retrieve elements of  an ArrayList /

            // 1. Generic - applicable for all collections
            System.out.println("Using toString()");
            System.out.println(intList.toString()+"\n");


            //2. Positional Access - Only applicable for List implementations
            System.out.println("Positional access");
            for(int c = 0; c < intList.size() ; c++){
                System.out.println("Element at the positon " +c+ "is " + intList.get(c));
            }

            System.out.println();

            System.out.println("Adding 100 at first");
            intList.addFirst(100);

            System.out.println("Adding 99 at last");
            intList.addLast(99);

            //Exercise

            // 3. Using Iterator - applicable for all Collection implementations
            Iterator<Integer> intIterator =  intList.iterator();
            while (intIterator.hasNext()){
                int element = intIterator.next(); //Auto-unboxing - using type reference
                System.out.println(element);
            }

            //Iterator is a mechanism that will continue running
            //It will rotate as long as elements are there
        /*
        java.util.Iterator <E> (Interface)
        hasNext() - boolean
        E e next() -

        LinkedList<E>: -
            Doubly linked List backed List impl
            supports all List(I) methods + new DLinked list specific operations

        Sets:
        TreeSet <E> -
            a Binary tree backed set Implementation
            A Binary tree backed Set Implementation
            Not ordered - can't access with index
            Insertion order is not the same as retrieval order

            Binary Tree - smaller element -> left side
            greater element -> right side                  - Primitive Wrapper/String use default comparison process
                                                             What about custom object?





         */
        }
    }
