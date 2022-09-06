package Empoyees;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        EmployeeBook employeeBook = new EmployeeBook();

        employeeBook.addEmployee("Popov", "Ivan", "Petrovich", 1,54.500);
        employeeBook.addEmployee("Petrova", "Maria", "Victorovna", 3, 45.750);
        employeeBook.addEmployee("Prokopenko", "Aleksey", "Urevich", 4, 68.900);
        employeeBook.addEmployee("Ushakova", "Olga", "Andreevna", 2, 67.400);
        employeeBook.addEmployee("Koshukov", "Eduard", "Vitalievich", 5, 89.000);
        employeeBook.addEmployee("Smirnov", "Anatoliy", "Nicolaevich", 1, 36.790);
        employeeBook.addEmployee("Prihod'ko", "Elena", "Sergeevna", 1, 78.400);


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



    }



}
