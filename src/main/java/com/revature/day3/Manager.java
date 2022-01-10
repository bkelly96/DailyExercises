package com.revature.day3;


public class Manager extends Employee{

    String qual;

    public Manager() {
        super();
    }

    public String getQual() {
        return qual;
    }

    public void setQual(String qual) {
        this.qual = qual;
    }

    public Manager(int id, String name, String qual) {
        super(id, name);
        this.qual = qual;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", qual='" + qual + '\'' +
                '}';
    }
}
