
package com.mycompany.tut5;

public class Lecturer extends Person
{
    private String programme;
  
public Lecturer(int i,String n,String p) 
{
        super(n,i);
        programme=p;
}
public void setProg(String p) {
       programme=p;
    }

    // Getter methods
    public String getProg() {
        return programme;
    }
}
