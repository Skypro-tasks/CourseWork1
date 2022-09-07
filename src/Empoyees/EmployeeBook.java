package Empoyees;

public class EmployeeBook {
    private final Employee[] employees;
    private int size;

    public EmployeeBook() {
        this.employees = new Employee[10];
    }

    public void addEmployee(String surname, String name, String patronymic, int numberOfDepartment, double salary) {
        if (size >= employees.length) {
            System.out.println("Employee book is full. Adding a new employee is restricted.");
        }
        Employee newEmployee = new Employee(surname, name, patronymic, numberOfDepartment, salary);
        employees[size++] = newEmployee;
    }

    public void printAllEmployees() {
        for (int i = 0; i < size; i++) {
            System.out.println(employees[i].toString());
        }
    }

    public double findSumOfSalaryAllEmployees() {
        double sum = 0;
        for (int i = 0; i < size; i++) {
            sum = sum + employees[i].getSalary();
        }
        return sum;
    }

    public void findEmployeeWithMinSalary() {
        double min = employees[0].getSalary();
        int num = 0;
        for (int i = 0; i < size; i++) {
            if (min > employees[i].getSalary()) {
                num = i;
            }
        }
        System.out.println("Employee with minimum salary: " + employees[num].toString());
    }

    public void findEmployeeWithMaxSalary() {
        double max = employees[0].getSalary();
        int num = 0;
        for (int i = 0; i < size; i++) {
            if (max < employees[i].getSalary()) {
                num = i;
            }
        }
        System.out.println("Employee with maximum salary: " + employees[num].toString());
    }

    public double findAverageSalary() {
        return findSumOfSalaryAllEmployees() / size;
    }

    public String getFullName(Employee employee) {
        return employee.getSurname() + " " + employee.getName() + " " + employee.getPatronymic();
    }

    public void printFullNamesAllEmployees() {
        for (int i = 0; i < size; i++) {
            System.out.println(getFullName(employees[i]));
        }
    }

    public void indexSalary(int percent) {
        double coefficient = (1.0 + (double) percent / 100);
        for (int i = 0; i < size; i++) {
            double newSalary = employees[i].getSalary() * coefficient;
            employees[i].setSalary(newSalary);
        }
    }

    public Employee findFirstEmployeeInDepartment(int numberOfDepartment){
        Employee employee = null;
        for (int i = 0; i < size; i++) {
            if(employees[i].getNumberOfDepartment() == numberOfDepartment){
                employee = employees[i];
                break;
            }
        }
        return employee;
    }

    public void findEmployeeInDepartmentWithMinSalary(int numberOfDepartment){
        double min = findFirstEmployeeInDepartment(numberOfDepartment).getSalary();
        for (int i = 0; i < size; i++) {
            if(employees[i].getNumberOfDepartment() == numberOfDepartment && employees[i].getSalary() < min){
                min = employees[i].getSalary();
            }
        }
        System.out.println("Minimum salary in department " + numberOfDepartment + " is " + min);
    }

    public void findEmployeeInDepartmentWithMaxSalary(int numberOfDepartment){
        double max = findFirstEmployeeInDepartment(numberOfDepartment).getSalary();
        for (int i = 0; i < size; i++) {
            if(employees[i].getNumberOfDepartment() == numberOfDepartment && employees[i].getSalary() > max){
                max = employees[i].getSalary();
            }
        }
        System.out.println("Maximum salary in department " + numberOfDepartment + " is " + max);
    }

    public void findSumOfSalaryAllEmployeesInDepartment(int numberOfDepartment) {
        double sum = 0;
        for (int i = 0; i < size; i++) {
            if (employees[i].getNumberOfDepartment() == numberOfDepartment) {
                sum += employees[i].getSalary();
            }
        }
        System.out.println("Sum of all salaries in department " + numberOfDepartment + " is " + sum);
    }

    public void findAverageSalaryInDepartment(int numberOfDepartment){
        int count = 0;
        double averageSalary = 0;
        for (int i = 0; i < size; i++) {
            if (employees[i].getNumberOfDepartment() == numberOfDepartment) {
                averageSalary += employees[i].getSalary();
                count++;
            }
        }
        averageSalary /= count;
        System.out.println("Average salary in department " + numberOfDepartment + " is " + averageSalary);
    }

    public void indexSalaryInDepartment(int percent, int numberOfDepartment) {
        double coefficient = (1.0 + (double) percent / 100);
        for (int i = 0; i < size; i++) {
            if(employees[i].getNumberOfDepartment() == numberOfDepartment) {
                double newSalary = employees[i].getSalary() * coefficient;
                employees[i].setSalary(newSalary);
            }
        }
    }

    public void printEmployeesInfoInDepartment(int numberOfDepartment){
        System.out.println("Enployees. Department " + numberOfDepartment);
        for (int i = 0; i < size; i++) {
            if(employees[i].getNumberOfDepartment() == numberOfDepartment){
                System.out.println("id: " + employees[i].getId() + ", " + employees[i].getSurname() +
                        " " + employees[i].getName() + " " + employees[i].getPatronymic() +
                        ", Salary: " + employees[i].getSalary());
            }
        }
    }

    public void findEmployeesWithSalaryLessLevel(double level){
        System.out.println("Employees with salary less than " + level);
        for (int i = 0; i < size; i++) {
            if(employees[i].getSalary() < level){
                System.out.println("id: " + employees[i].getId() + ", " + employees[i].getSurname() +
                        " " + employees[i].getName() + " " + employees[i].getPatronymic() +
                        ", Salary: " + employees[i].getSalary());
            }
        }
    }

    public void findEmployeesWithSalaryMoreLevel(double level){
        System.out.println("Employees with salary more than " + level);
        for (int i = 0; i < size; i++) {
            if(employees[i].getSalary() >= level){
                System.out.println("id: " + employees[i].getId() + ", " + employees[i].getSurname() +
                        " " + employees[i].getName() + " " + employees[i].getPatronymic() +
                        ", Salary: " + employees[i].getSalary());
            }
        }
    }


}
