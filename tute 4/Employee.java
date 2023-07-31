/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.tute4;
public class Employee
{


    private int empid;
    private String empname;
    private String empdesignation;

    // Constructor
    public Employee(int id, String n, String d) {
        empid = id;
        empname = n;
        empdesignation = d;
    }

    // Setter methods
    public void setempid(int id) {
        empid = id;
    }

    public void setempname(String n) {
        empname = n;
    }

    public void setempdesignation(String d) {
        empdesignation = d;
    }

    // Getter methods
    public int getempid() {
        return empid;
    }

    public String getempname() {
        return empname;
    }

    public String getempdesignation() {
        return empdesignation;
    }
}
