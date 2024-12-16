import model.Employee;
import service.IEmployeeManager;
import service.impl.IEmployeeManagerImpl;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee employee = new Employee();
        IEmployeeManagerImpl employeeManager = new IEmployeeManagerImpl();

        employeeManager.addEmployee(new Employee("1", "Thanh", "PhamDucThanh", 1.5f, 9500000, "PhongNhanSu"));
        employeeManager.addEmployee(new Employee("2", "Long", "NguyenDinhLong", 1.2f, 7500000, "PhongKinhDoanh"));
        employeeManager.addEmployee(new Employee("3", "Quynh", "HoangDiemQuynh", 1.4f, 8000000, "PhongCongNghe"));
        employeeManager.addEmployee(new Employee("4", "Quynhf", "LeNhuQuynh", 2.1f, 10000000, "PhongQuanTri"));

        while(true)
        {
            System.out.println("===========MENU============");
            System.out.println("1.Add employee.");
            System.out.println("2.Edit employee.");
            System.out.println("3.Search employee.");
            System.out.println("4.Get total salary.");
            System.out.println("5.Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice){
                case 1:
                    Employee newEmployee = new Employee();
                    newEmployee.nhap(sc);
                    employeeManager.addEmployee(newEmployee);
                    break;
                case 2:
                    employeeManager.editEmployee(employee);
                    break;
                case 3:
                    System.out.print("Enter fullname: ");
                    String fullName = sc.nextLine();
                    employeeManager.searchEmployee(fullName);
                    break;
                case 4:
                    System.out.print("Total salary is: ");
                    System.out.println(employeeManager.getTotalSalary());
                    break;
                case 5:
                    System.out.println("Exiting the program!");
                    sc.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
