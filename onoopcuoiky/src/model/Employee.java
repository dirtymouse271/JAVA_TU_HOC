package model;

import java.util.Scanner;

public class Employee extends User{
    private float employee_basic_salary;
    private String employee_department;
    private float phuCapPhongBan = 0;

    public Employee() {
    }

    public Employee(String user_id, String user_name, String user_fullname, float user_cosalary, float employee_basic_salary, String employee_department) {
        super(user_id, user_name, user_fullname, user_cosalary);
        this.employee_basic_salary = employee_basic_salary;
        this.employee_department = employee_department;
        setPhuCapPhongBan();
    }

    public float getEmployee_basic_salary() {
        return employee_basic_salary;
    }

    public void setEmployee_basic_salary(float employee_basic_salary) {
        this.employee_basic_salary = employee_basic_salary;
    }

    public String getEmployee_department() {
        return employee_department;
    }

    public void setEmployee_department(String employee_department) {
        this.employee_department = employee_department;
        setPhuCapPhongBan();
    }

    public float getPhuCapPhongBan() {
        return phuCapPhongBan;
    }

    private void setPhuCapPhongBan() {
        if ("phongNhanSu".equalsIgnoreCase(this.employee_department)) {
            this.phuCapPhongBan = 1.0f;
        }else if("phongKinhDoanh".equalsIgnoreCase(this.employee_department)){
            this.phuCapPhongBan = 1.1f;
        }else if("phongCongNghe".equalsIgnoreCase(this.employee_department)){
            this.phuCapPhongBan = 1.15f;
        }else if ("phongQuanTri".equalsIgnoreCase(this.employee_department)){
            this.phuCapPhongBan = 1.2f;
        }
    }


    @Override
    public float getSalary() {
        return this.employee_basic_salary*user_cosalary*this.phuCapPhongBan;
    }

    @Override
    public String toString() {
        return super.toString() +
                "employee_basic_salary=" + employee_basic_salary +
                ", employee_department='" + employee_department + '\'' +
                ", phuCapPhongBan=" + phuCapPhongBan +
                '}';
    }

    public void display(){
        System.out.println(toString());
    }

    public void nhap(Scanner sc){
        System.out.print("Enter ID: ");
        user_id = sc.nextLine();
        System.out.print("Enter name: ");
        user_name = sc.nextLine();
        System.out.print("Enter fullname: ");
        user_fullname = sc.nextLine();
        System.out.print("Enter cosalary: ");
        user_cosalary = sc.nextFloat();
        sc.nextLine();
        System.out.print("Enter basic salary: ");
        employee_basic_salary = sc.nextFloat();
        sc.nextLine();
        System.out.print("Enter employee department: ");
        employee_department = sc.nextLine();
    }

}
