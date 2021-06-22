
package daythree.models;

public class Administrative extends Employee{
    private String role;

    public Administrative(Builder builder) {
        super(builder);
        this.role = builder.role;
    }
    
    public static class Builder extends Employee.EmployeeBuilder<Builder> {
    private String role;
        
        @Override
        public Builder getThis() {
            return this;
        }

        @Override
        public Administrative build() {
            return new Administrative(this);
        }
    }
}
