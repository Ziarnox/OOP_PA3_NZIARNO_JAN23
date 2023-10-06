package model;

import enums.Position;


public class Employee {
    private String name;
    private int id;
    private Position position;
    private double monthlySalary;

    public Employee(String name, int id, Position position, double monthlySalary) {
        this.name = name;
        this.id = id;
        this.position = position;
        this.monthlySalary = monthlySalary;
    }

    public double getMonthlySalary() {
        switch (position) {
            case SALES:
                return monthlySalary + 1750;
            case JUNIOR_OFFICE_WORKER:
                return monthlySalary + 1250;
            case SENIOR_OFFICE_WORKER:
                return monthlySalary + 1700;
            case GROUP_LEAD:
                return 1800 + (200 * id);
            default:
                return monthlySalary;
        }
    }

    public Position getPosition() {
        return position;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", position=" + position +
                ", monthlySalary=" + monthlySalary +
                '}';
    }
}

