
package com.mycompany.employee3_2;


public class Employee
{
    private String name;
    private double salary;
    private int age;
    
    public void Employee(String n,int a,double s)
    {
       name=n;
       age=a;
       salary=s;
    }
    public void display()
    {
        System.out.println("name"+name);
        System.out.println("age"+age);
        System.out.println("salary"+salary);
    }
}
