
package com.mycompany.tut5;


public class Student extends Person
{
  private String course;
  
public Student(int i,String n,String c) {
        super(n,i);
        course=c;
}
public void setCourse(String c) {
       course=c;
    }

    // Getter methods
    public String getCourse() {
        return course;
    }
}
