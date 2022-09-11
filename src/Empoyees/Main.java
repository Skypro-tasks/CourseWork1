package Empoyees;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        EmployeeBook employeeBook = new EmployeeBook();

        //Добавить нового сотрудника (создаем объект, заполняем поля, кладем в массив).
        employeeBook.addEmployee("Popov", "Ivan", "Petrovich", 1,54_500);
        employeeBook.addEmployee("Petrova", "Maria", "Victorovna", 3, 45_750);
        employeeBook.addEmployee("Prokopenko", "Aleksey", "Urevich", 4, 68_900);
        employeeBook.addEmployee("Ushakova", "Olga", "Andreevna", 2, 67_400);
        employeeBook.addEmployee("Koshukov", "Eduard", "Vitalievich", 5, 89_000);
        employeeBook.addEmployee("Smirnov", "Anatoliy", "Nicolaevich", 1, 36_790);
        employeeBook.addEmployee("Prihod'ko", "Elena", "Sergeevna", 1, 78_400);

        //Получить список всех сотрудников со всеми имеющимися по ним данными (вывести в консоль значения всех полей (toString)).
        employeeBook.printAllEmployees();
        System.out.println();

//        //Посчитать сумму затрат на зарплаты в месяц.
//        double sum = employeeBook.findSumOfSalaryAllEmployees();
//        System.out.println(sum);
//
//        //Найти сотрудника с минимальной зарплатой.
//        //Найти сотрудника с максимальной зарплатой.
//        employeeBook.findEmployeeWithMinSalary();
//        employeeBook.findEmployeeWithMaxSalary();
//
//        //Подсчитать среднее значение зарплат (можно использовать для этого метод из пункта b).
//        double averageSalary = employeeBook.findAverageSalary();
//        System.out.println(averageSalary);
//
//        //Получить Ф. И. О. всех сотрудников (вывести в консоль).
//        employeeBook.printFullNamesAllEmployees();
//
//        //Проиндексировать зарплату (вызвать изменение зарплат у всех сотрудников на величину аргумента в %).
//        employeeBook.indexSalary(20);
//        System.out.println(employeeBook.findAverageSalary());
//
//        //Получить в качестве параметра номер отдела (1–5) и найти Сотрудника с минимальной зарплатой.
//        employeeBook.findEmployeeInDepartmentWithMinSalary(1);
//        employeeBook.findEmployeeInDepartmentWithMinSalary(5);
//
//        //Получить в качестве параметра номер отдела (1–5) и найти Сотрудника с максимальной зарплатой.
//        employeeBook.findEmployeeInDepartmentWithMaxSalary(1);
//
//        //Получить в качестве параметра номер отдела (1–5) и найти Сумму затрат на зарплату по отделу.
//        employeeBook.findSumOfSalaryAllEmployeesInDepartment(1);
//
//        //Получить в качестве параметра номер отдела (1–5) и найти Среднюю зарплату по отделу
//        employeeBook.findAverageSalaryInDepartment(1);
//
//        //Получить в качестве параметра номер отдела (1–5) и найти Проиндексировать зарплату всех сотрудников отдела на процент, который приходит в качестве параметра.
//        employeeBook.indexSalaryInDepartment(10, 1);
//
//        //Получить в качестве параметра номер отдела (1–5) Напечатать всех сотрудников отдела (все данные, кроме отдела).
//        employeeBook.printEmployeesInfoInDepartment(1);
//
//        //Получить в качестве параметра число и найти Всех сотрудников с зарплатой меньше числа (вывести id, Ф. И. О. и зарплатой в консоль).
//        employeeBook.findEmployeesWithSalaryLessLevel(50_000);
//        //Получить в качестве параметра число и найти Всех сотрудников с зарплатой больше (или равно) числа (вывести id, Ф. И. О. и зарплатой в консоль).
//        employeeBook.findEmployeesWithSalaryMoreLevel(100_000);
//
        //Удалить сотрудника (находим сотрудника по Ф. И. О. и/или id, обнуляем его ячейку в массиве).
        employeeBook.removeEmployee("Smirnov", "Anatoliy", "Nicolaevich", 6);
        employeeBook.removeEmployee(3);
        employeeBook.removeEmployee("Prihod'ko", "Elena", "Sergeevna");
        employeeBook.printAllEmployees();

//        employeeBook.addEmployee("Smirnov", "Anatoliy", "Nicolaevich", 1, 36_790);
//        employeeBook.addEmployee("Prihod'ko", "Elena", "Sergeevna", 1, 78_400);
//        employeeBook.addEmployee("Petrova", "Maria", "Victorovna", 3, 45_750);
//
//        //Изменить сотрудника (получить сотрудника по Ф. И. О., модернизировать его запись):
//        //Изменить зарплату.
//        //Изменить отдел.
//        employeeBook.changeSalaryEmployee("Popov", "Ivan", "Petrovich", 65_000);
//        employeeBook.changeNumberOfDepartmentEmployee("Popov", "Ivan", "Petrovich", 2);
//
//        //Получить Ф. И. О. всех сотрудников по отделам (напечатать список отделов и их сотрудников).
//        employeeBook.printRangeEmployee();
    }



}
