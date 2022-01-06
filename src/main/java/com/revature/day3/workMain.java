package com.revature.day3;

public class workMain {

    public static void main(String[] args) {

        Manager m = new Manager();

        m.setId(2);
        m.setQual("Cool Dude");
        m.setName("Brian Kelly");

        System.out.println("the id for " + m.getName() + " is " + m.getId() + " and he is a " + m.getQual());

        Worker w = new Worker();
        w.setId(3);
        w.setName("Johnny");

        System.out.println("the id for " + w.getName() + " is " + w.getId());

        Employee e = new Employee();

        e.setId(1);
        e.setName("The Thing");

        System.out.println("the id for " + e.getName() + " is " + e.getId());

        Supervisor s = new Supervisor();

        s.setId(4);
        s.setName("Samantha Jones");
        s.setExperience(12);

        System.out.println("the id for " + s.getName() + " is " + s.getId() + " and has " + s.getExperience() + " years experience");



    }

}
