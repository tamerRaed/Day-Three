package daythree.models;

import java.util.ArrayList;

public class Developer extends Employee {

    private String technology;
    private ArrayList<Project> assignedProjects;

    public Developer(Builder builder) {
        super(builder);
        this.technology = builder.technology;
        this.assignedProjects = builder.assignedProjects;
    }
    
    public static class Builder extends Employee.EmployeeBuilder<Builder> {
        private String technology;
        private ArrayList<Project> assignedProjects;
        
        @Override
        public Builder getThis() {
            return this;
        }

        @Override
        public Developer build() {
            return new Developer(this);
        }
    }
    
}
