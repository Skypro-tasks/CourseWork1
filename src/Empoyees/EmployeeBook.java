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
        for (int i = 0; i < size; i++) {
            System.out.println(employees[i].toString());
        }
    }

    public double findSumOfSalaryAllEmployees(){
        double sum = 0;
        for (int i = 0; i < size; i++) {
            Employee employee = employees[i];
            sum = sum + employee.getSalary();
        }
        return sum;
    }

    public void findEmployeeWithMinSalary(){
        double min = employees[0].getSalary();
        int num = 0;
        for (int i = 0; i < size; i++) {
            Employee employee = employees[i];
            if(min > employee.getSalary()) {
                num = i;
            }
        }
        System.out.println("Employee with minimum salary: " + employees[num].toString());
    }

    public void findEmployeeWithMaxSalary(){
        double max = employees[0].getSalary();
        int num = 0;
        for (int i = 0; i < size; i++) {
            Employee employee = employees[i];
            if(max < employee.getSalary()) {
                num = i;
            }
        }
        System.out.println("Employee with maximum salary: " + employees[num].toString());
    }

    public double findAverageSalary(){
        return findSumOfSalaryAllEmployees()/size;
    }

    public String getFullName (Employee employee){
        return employee.getSurname() + " " + employee.getName() + " " + employee.getPatronymic();
    }

    public void printFullNamesAllEmployees(){
        for (int i = 0; i < size; i++) {
            System.out.println(getFullName(employees[i]));
        }
    }

    public void indexSalary(int percent){
        double coefficient = (1.0 + (double) percent / 100);
        for (int i = 0; i < size; i++) {
            Employee employee = employees[i];
            double newSalary = employee.getSalary() * coefficient;
            employee.setSalary(newSalary);
        }
    }
}
