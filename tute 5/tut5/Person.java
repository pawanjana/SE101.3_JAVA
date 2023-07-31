
package com.mycompany.tut5;

public class Person
{
    private String name;
    private int id;
    public Person(String n,int i)
    {
        name=n;
        id=i;
    }
    // Setter methods
    public void setName(String n) {
        name = n;
    }

    public void setId(int i) {
        id = i;
    }

    // Getter methods
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
