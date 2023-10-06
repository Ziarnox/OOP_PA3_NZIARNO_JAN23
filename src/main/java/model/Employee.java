package model;

import enums.Position;


public class Employee {
    private String name;
    private int id;
    private Position position;
    private double monthlySalary;
    private String group;

    public Employee(String name, int id, Position position, double monthlySalary, String group) {
        this.name = name;
        this.id = id;
        this.position = position;
        this.monthlySalary = monthlySalary;
        this.group = group;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public Position getPosition() {
        return position;
    }

    public String getGroup() {
        return group;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", position=" + position +
                ", monthlySalary=" + monthlySalary +
                ", group='" + group + '\'' +
                '}';
    }
}
