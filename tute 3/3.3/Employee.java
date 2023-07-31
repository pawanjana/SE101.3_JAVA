
package com.mycompany.employeetute3final;

public class Employee 
{
    private String name;
    private double salary;
    private double bonus;
    double b_salary;
    
    //setter methods
    public void setname(String n)
    {
        name=n;
    }
    public void setsalery(double s)
    {
        salary=s;
    }
    //getter methods
    public String getname()
    {
        return name;
    }
    public double getsalary()
    {
        return salary;
    }
    //constructer
    public void Employee(double b)
    {
        bonus=b;
    }
    public void calcbonus()
    {
        
        b_salary=salary+bonus;
        System.out.println("bonus amount "+b_salary);
    }
}
