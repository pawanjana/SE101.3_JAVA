
package com.mycompany.tute4;

public class Tute4 {
    public static void main(String[] args) {
        Employee e1 = new Employee(123, "Mr. Bogdan", "Manager");
        System.out.println("ID: " + e1.getempid());
        System.out.println("Name: " + e1.getempname());
        System.out.println("Designation: " + e1.getempdesignation());

        Employee e2 = new Employee(345, "Mr. Bird", "Manager");
        System.out.println("\nID: " + e2.getempid());
        System.out.println("Name: " + e2.getempname());
        System.out.println("Designation: " + e2.getempdesignation());
    }
}