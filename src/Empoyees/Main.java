package Empoyees;

public class Main {

    public static void main(String[] args) {
        EmployeeBook employeeBook = new EmployeeBook();

        employeeBook.addEmployee("Popov", "Ivan", "Petrovich", 1,54.500);
        employeeBook.addEmployee("Petrova", "Maria", "Victorovna", 3, 45.750);
        employeeBook.addEmployee("Prokopenko", "Aleksey", "Urevich", 4, 68.900);
        employeeBook.addEmployee("Ushakova", "Olga", "Andreevna", 2, 67.400);

        employeeBook.printAllEmployees();
    }



}
