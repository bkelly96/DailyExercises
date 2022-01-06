package com.revature.day3;

public class Supervisor extends Employee{

    int experience;

    public Supervisor() {

    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public Supervisor(int id, String name, int experience) {
        super(id, name);
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Supervisor{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", experience=" + experience +
                '}';
    }
}
