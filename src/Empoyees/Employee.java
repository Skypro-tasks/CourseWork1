package Empoyees;

import java.util.Objects;

public class Employee { //dataclass

    private String name;
    private String surname;
    private String patronymic;

    private int numberOfDepartment;
    private int id;
    private static int countID;

    private double salary;

    Employee(String surname, String name, String patronymic, int numberOfDepartment, double salary){
        id = ++countID;
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.numberOfDepartment = numberOfDepartment;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public int getNumberOfDepartment() {
        return numberOfDepartment;
    }

    public int getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }

    public void setNumberOfDepartment(int numberOfDepartment) {
        if(numberOfDepartment < 1 && numberOfDepartment >5) throw new IllegalArgumentException("Not valid argument. Enter number from 1 to 5.");
        this.numberOfDepartment = numberOfDepartment;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "id: " + id + ", Department number: " + numberOfDepartment + ", " +
                surname + " " + name + " " + patronymic +
                ", Salary: " + salary;
    }

    public String getFullName() {
        return surname + " " + name + " " + patronymic;
    }

}
