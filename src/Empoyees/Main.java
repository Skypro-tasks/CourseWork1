package Empoyees;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        EmployeeBook employeeBook = new EmployeeBook();

        employeeBook.addEmployee("Popov", "Ivan", "Petrovich", 1,54_500);
        employeeBook.addEmployee("Petrova", "Maria", "Victorovna", 3, 45_750);
        employeeBook.addEmployee("Prokopenko", "Aleksey", "Urevich", 4, 68_900);
        employeeBook.addEmployee("Ushakova", "Olga", "Andreevna", 2, 67_400);
        employeeBook.addEmployee("Koshukov", "Eduard", "Vitalievich", 5, 89_000);
        employeeBook.addEmployee("Smirnov", "Anatoliy", "Nicolaevich", 1, 36_790);
        employeeBook.addEmployee("Prihod'ko", "Elena", "Sergeevna", 1, 78_400);


        employeeBook.printAllEmployees();

        double sum = employeeBook.findSumOfSalaryAllEmployees();
        System.out.println(sum);

        employeeBook.findEmployeeWithMinSalary();
        employeeBook.findEmployeeWithMaxSalary();

        double averageSalary = employeeBook.findAverageSalary();
        System.out.println(averageSalary);

        employeeBook.printFullNamesAllEmployees();

        employeeBook.indexSalary(20);
        System.out.println(employeeBook.findAverageSalary());

        employeeBook.findEmployeeInDepartmentWithMinSalary(1);
        employeeBook.findEmployeeInDepartmentWithMinSalary(5);

        employeeBook.findEmployeeInDepartmentWithMaxSalary(1);
        employeeBook.findSumOfSalaryAllEmployeesInDepartment(1);

        employeeBook.findAverageSalaryInDepartment(1);

        employeeBook.indexSalaryInDepartment(10, 1);
        employeeBook.printEmployeesInfoInDepartment(1);

        employeeBook.findEmployeesWithSalaryLessLevel(50_000);
        employeeBook.findEmployeesWithSalaryMoreLevel(100_000);




    }



}
