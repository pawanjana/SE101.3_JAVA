
package com.mycompany.tut5;

public class Tut5 {

    public static void main(String[] args)
    {
   Student s1= new Student(200 ,"har" ,"computing");
        System.out.println("name "+s1.getName());
        System.out.println("degree "+s1.getCourse());    
        System.out.println("id "+s1.getId());
        
        Lecturer L1= new Lecturer(200 ,"das" ,"computing");
        System.out.println("name "+L1.getName());
        System.out.println("degree "+L1.getProg());
        System.out.println("id "+L1.getId());
    }
    
}
