package daythree.models;

import java.util.Date;

public class Person {

    private String firstName;
    private String lastName;
    private String nationality;
    private String IDNumber;
    private String gender;
    private Date dateOfBirth;

    protected Person(PersonBuilder<?> builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.nationality = builder.nationality;
        this.IDNumber = builder.IDNumber;
        this.gender = builder.gender;
        this.dateOfBirth = builder.dateOfBirth;
    }
    
    public static PersonBuilder builder() {
          return new PersonBuilder() {
              @Override
              public PersonBuilder getThis() {
                  return this;
              }
          };
    }
    
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getIDNumber() {
        return IDNumber;
    }

    public void setIDNumber(String IDNumber) {
        this.IDNumber = IDNumber;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public abstract static class PersonBuilder<T extends PersonBuilder<T>> {

        private String firstName;
        private String lastName;
        private String nationality;
        private String IDNumber;
        private String gender;
        private Date dateOfBirth;
        
        public abstract T getThis();
        
        public T firstName(String firstName) {
            this.firstName = firstName;
            return this.getThis();
        }

        public T lastName(String lastName) {
            this.lastName = lastName;
            return this.getThis();
        }

        public T nationality(String nationality) {
            this.nationality = nationality;
            return this.getThis();
        }

        public T IDNumber(String IDNumber) {
            this.IDNumber = IDNumber;
            return this.getThis();
        }

        public T gender(String gender) {
            this.gender = gender;
            return this.getThis();
        }

        public T setDateOfBirth(Date dateOfBirth) {
            this.dateOfBirth = dateOfBirth;
            return this.getThis();
        }
        public Person build() {
            Person person =  new Person(this);
            return person;
        }
    }
}
