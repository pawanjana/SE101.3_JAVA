
package com.mycompany.encapsulation;

public class person
{
 
    private String name;
    private int age;
    private double salary;
    
    //setter method
    public void setname(String n)
    {
        name=n;
    }
    public void setage(int a)
    {
        age=a;
    }
    public void setsalary(double s)
    {
        salary=s;
    }
    //getter method
    public String getname()
    {
        return name;
    }
    public int getage()
    {
        return age;
    }
    public double getsalary()
    {
        return salary;
    }
}

