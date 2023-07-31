
package com.mycompany.itemobj;

public class item 
{
    private int location;
    private String description;
    
   public item(int l,String d)
    {
        location=l;
        description=d;
    }
    //setter method
    public void setlocation(int lo)
    {
        location=lo;
    }
    public void setdescription(String des)
    {
        description=des;
    }
    //getter method
    public int getlocation()
    {
        return location;
    }
     public String getdescription()
    {
        return description;
    }
}
