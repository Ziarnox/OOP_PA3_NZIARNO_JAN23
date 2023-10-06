package model;

import java.util.ArrayList;
import java.util.List;

public class Group {
    private String name;
    private Employee leader;
    private List<Employee> members;

    public Group(String name, Employee leader) {
        this.name = name;
        this.leader = leader;
        this.members = new ArrayList<>();
    }


    public List<Employee> getMembers() {
        return members;
    }


    public void addMember(Employee employee) {
        members.add(employee);
    }

    public String getName() {
        return name;
    }

    public Employee getLeader() {
        return leader;
    }
}
