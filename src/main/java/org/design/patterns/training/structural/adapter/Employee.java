package org.design.patterns.training.structural.adapter;


public class Employee {
    private String name;
    private String surname;
    private EGender gender;

    public Employee() {
    }

    public Employee(String name,
                    String surname,
                    EGender gender) {
        this.name = name;
        this.surname = surname;
        this.gender = gender;
    }

    public static EmployeeBuilder builder() {
        return new EmployeeBuilder();
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public EGender getGender() {
        return this.gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setGender(EGender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", gender=" + gender +
                '}';
    }

    public static class EmployeeBuilder {
        private String  name;
        private String  surname;
        private EGender gender;

        EmployeeBuilder() {
        }

        public EmployeeBuilder withName(String name) {
            this.name = name;
            return this;
        }

        public EmployeeBuilder withSurname(String surname) {
            this.surname = surname;
            return this;
        }

        public EmployeeBuilder withGender(EGender gender) {
            this.gender = gender;
            return this;
        }

        public Employee build() {
            return new Employee(name,
                                surname,
                                gender);
        }

        public String toString() {
            return "Employee.EmployeeBuilder(name=" + this.name + ", surname=" + this.surname + ", gender=" + this.gender + ")";
        }
    }
}
