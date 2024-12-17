package service.impl;

import model.Employee;
import service.IEmployeeManager;


import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.ArrayList;

public class IEmployeeManagerImpl implements IEmployeeManager {

    Scanner sc = new Scanner(System.in);

    ArrayList<Employee> employeesList = new ArrayList<>();


    @Override
    public void addEmployee(Employee e) {
        for (Employee employee : employeesList) {
            if (employee.getUser_id().equals(e.getUser_id())) {
                System.out.println("Id is exist!");
                return;
            }
        }
        employeesList.add(e);
        System.out.println("Add succesfully!");
    }

    @Override
    public void editEmployee(Employee e) {
        boolean check = false;
        System.out.print("Enter id: ");
        String id = sc.nextLine();
        for (Employee em : employeesList) {
            if (em.getUser_id().equals(id)) {
                check = true;
                System.out.println("This is " + em.getUser_fullname() + " information.");
                em.display();
                System.out.print("Enter new name: ");
                String name = sc.nextLine();
                em.setUser_fullname(name);
                System.out.print("Enter new fullname");
                String fullName = sc.nextLine();
                em.setUser_fullname(fullName);
                System.out.print("Enter new cosalary: ");
                float cosalary = sc.nextFloat();
                sc.nextLine();
                em.setUser_cosalary(cosalary);
                System.out.print("Enter new basic salary");
                float basic_salary = sc.nextFloat();
                sc.nextLine();
                em.setEmployee_basic_salary(basic_salary);
                System.out.print("Enter new department: ");
                String department = sc.nextLine();
                em.setEmployee_department(department);
            }
        }
        if (check = false) {
            System.out.println("No information!");
        }
    }

    @Override
    public void searchEmployee(String fullName) {
        boolean found = false;
        for (Employee e : employeesList) {
            if (fullName.equalsIgnoreCase(e.getUser_fullname())) {
                found = true;
                e.display();
                return;
            }
        }
        if (found = false) {
            System.out.println("No information!");
        }
    }

    @Override
    public float getTotalSalary() {
        float totalSalary = 0;
        for (Employee e : employeesList) {
            totalSalary += e.getSalary();
        }
        return totalSalary;
    }

    public void display() {
        System.out.println("Danh sach nhan vien: ");
        for (Employee e : employeesList) {
            e.display();
        }
    }
}
