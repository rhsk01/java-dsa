package com.company;

public class Employee {
    String name;
    int emp_id;
    Employee(String name,int emp_id){
        this.name = name;
        this.emp_id = emp_id;
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("raja",101);
        Employee e2 = new Employee("rishabh",102);
        System.out.println("e1"+e1.name+" "+e1.emp_id);
        System.out.println("e2"+e2.name+" "+e2.emp_id);
    }
}
