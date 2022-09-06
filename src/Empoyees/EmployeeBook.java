package Empoyees;

public class EmployeeBook {
    private final Employee[] employees;
    private int size;

    public EmployeeBook(){
        this.employees = new Employee[10];
    }

    public void addEmployee(String surname, String name, String patronymic, int numberOfDepartment, double salary) {
        if (size >= employees.length) {
            System.out.println("Employee book is full. Adding a new employee is restricted.");
        }
        Employee newEmployee = new Employee(surname, name, patronymic, numberOfDepartment, salary);
        employees[size++] = newEmployee;
    }

    public void printAllEmployees(){
        for (int i = 0; i < employees.length; i++) {
            Employee employee = employees[i];
            System.out.println(employee.getId() + " " + employee.getSurname() +);
        }
    }
}
