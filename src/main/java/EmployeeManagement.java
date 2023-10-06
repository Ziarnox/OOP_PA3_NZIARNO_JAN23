import enums.Position;
import model.Employee;
import model.Group;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeManagement {
    public static void main(String[] args) {
        //walidacja id
        //walidacja wynagrodzenia zgodzna ze stanowiskiem
        //walidacja liderow i teamu

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Worker1", 1, Position.SALES, 1750));
        employees.add(new Employee("Worker2", 2, Position.JUNIOR_OFFICE_WORKER, 1250));
        employees.add(new Employee("Worker3", 3, Position.SENIOR_OFFICE_WORKER, 1700));
        employees.add(new Employee("Worker4", 4, Position.GROUP_LEAD, 1800));
        employees.add(new Employee("Worker5", 5, Position.GROUP_LEAD, 1800));
        employees.add(new Employee("Worker6", 6, Position.SENIOR_OFFICE_WORKER, 1700));
        employees.add(new Employee("Worker7", 7, Position.SENIOR_OFFICE_WORKER, 1700));
        employees.add(new Employee("Worker8", 8, Position.JUNIOR_OFFICE_WORKER, 1250));
        employees.add(new Employee("Worker9", 9, Position.SALES, 1750));


        List<Group> groups = new ArrayList<>();
        Group salesGroup = new Group("Sales Group", employees.get(0));
        Group officeGroup1 = new Group("Office Group 1", employees.get(3));
        Group officeGroup2 = new Group("Office Group 2", employees.get(4));
        groups.add(salesGroup);
        groups.add(officeGroup1);
        groups.add(officeGroup2);


        salesGroup.addMember(employees.get(0));
        officeGroup1.addMember(employees.get(3));
        officeGroup2.addMember(employees.get(4));

        // Task 1
        Employee highestSalaryEmployee = employees.stream()
                .max(Comparator.comparing(Employee::getMonthlySalary))
                .orElse(null);
        System.out.println("Employee with the highest salary: " + highestSalaryEmployee.getName());

        // Task 2
        double totalSalesSalaries = employees.stream()
                .filter(employee -> employee.getPosition() == Position.SALES)
                .mapToDouble(Employee::getMonthlySalary)
                .sum();
        System.out.println("Total salespeople salaries: " + totalSalesSalaries);

        // Task 3
        List<Employee> officeWorkersSortedBySalaryDescending = employees.stream()
                .filter(employee -> employee.getPosition() == Position.JUNIOR_OFFICE_WORKER || employee.getPosition() == Position.SENIOR_OFFICE_WORKER)
                .sorted(Comparator.comparing(Employee::getMonthlySalary).reversed())
                .collect(Collectors.toList());

        System.out.println("Office workers sorted by salary descending:");
        officeWorkersSortedBySalaryDescending.forEach(employee -> {
            System.out.println(employee.getName() + ": " + employee.getMonthlySalary());
        });
    }
}