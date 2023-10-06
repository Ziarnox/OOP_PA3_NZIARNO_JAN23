package model;

public class Group {
    private String name;
    private Employee leader;

    public Group(String name, Employee leader) {
        this.name = name;
        this.leader = leader;
    }

    public String getName() {
        return name;
    }

    public Employee getLeader() {
        return leader;
    }
}

