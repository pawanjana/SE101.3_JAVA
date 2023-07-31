
package com.mycompany.employeetute3final;

public class Employeetute3final 
{

    public static void main(String[] args) 
    {
       Employee e1=new Employee();
        e1.setname("Bogadan");
        e1.setsalery(50000.00f);
        System.out.println("employee name "+e1.getname());
        System.out.println("basic salary"+e1.getsalary());
        e1.Employee(10000.00f);
        e1.calcbonus();
    }
}
