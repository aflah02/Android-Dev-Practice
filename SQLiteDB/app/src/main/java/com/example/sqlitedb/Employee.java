package com.example.sqlitedb;

public class Employee {
    private int sno;
    private String name;
    private double increment;

    public Employee(int i, String name, double v) {
        this.sno = i;
        this.name = name;
        this.increment = v;
    }


    public int getSno() {
        return sno;
    }

    public void setSno(int sno) {
        this.sno = sno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getIncrement() {
        return increment;
    }

    public void setIncrement(double increment) {
        this.increment = increment;
    }
}
