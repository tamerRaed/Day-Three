package daythree.models;

import java.util.Date;

public class Employee extends Person {

    private final int empID;
    private final float basicSalary;
    private final float raise;
    private final Date hireDate;
    private final int contractDuration;
    private final String durationType;
    private final EmployeeCalendar calendar;
    private final String username;
    private final String password;
    private final FinancialRecord financialRecord;

    protected Employee(EmployeeBuilder<?> builder) {
        super();
        this.empID = builder.empID;
        this.basicSalary = builder.basicSalary;
        this.raise = builder.raise;
        this.hireDate = builder.hireDate;
        this.contractDuration = builder.contractDuration;
        this.durationType = builder.durationType;
        this.calendar = builder.calendar;
        this.username = builder.username;
        this.password = builder.password;
        this.financialRecord = builder.financialRecord;
    }
    
    public static EmployeeBuilder builder() {
          return new EmployeeBuilder() {
              @Override
              public EmployeeBuilder getThis() {
                  return this;
              }
          };
    }
    
    public abstract static class EmployeeBuilder<T extends EmployeeBuilder<T>> {

        private int empID;
        private float basicSalary;
        private float raise;
        private Date hireDate;
        private int contractDuration;
        private String durationType;
        private EmployeeCalendar calendar;
        private String username;
        private String password;
        private FinancialRecord financialRecord;

        public abstract T getThis();

        public T empID(int empID) {
            this.empID = empID;
            return this.getThis();
        }

        public T basicSalary(float basicSalary) {
            this.basicSalary = basicSalary;
            return this.getThis();
        }

        public T raise(float raise) {
            this.raise = raise;
            return this.getThis();
        }

        public T hireDate(Date hireDate) {
            this.hireDate = hireDate;
            return this.getThis();
        }

        public T contractDuration(int contractDuration) {
            this.contractDuration = contractDuration;
            return this.getThis();
        }

        public T durationType(String durationType) {
            this.durationType = durationType;
            return this.getThis();
        }

        public T calendar(EmployeeCalendar calendar) {
            this.calendar = calendar;
            return this.getThis();
        }

        public T username(String username) {
            this.username = username;
            return this.getThis();
        }

        public T password(String password) {
            this.password = password;
            return this.getThis();
        }

        public T financialRecord(FinancialRecord financialRecord) {
            this.financialRecord = financialRecord;
            return this.getThis();
        }
        
        public Employee build() {
            Employee employee = new Employee(this);
            return employee;
        }

    }

    public int getEmpID() {
        return empID;
    }

    public float getBasicSalary() {
        return basicSalary;
    }

    public float getRaise() {
        return raise;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public int getContractDuration() {
        return contractDuration;
    }

    public String getDurationType() {
        return durationType;
    }

    public EmployeeCalendar getCalendar() {
        return calendar;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public FinancialRecord getFinancialRecord() {
        return financialRecord;
    }

}
