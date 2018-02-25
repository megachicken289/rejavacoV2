package java.intToObjTxtBk.chapters.ch3.withoutConstructor;

public class Account {
    private String name;    // instance variable

    // method to set the name in the object
    public void setName(String name)
    {
        this.name = name;   // store the name
    }

    // method to retrieve the name of the object
    public String getName()
    {
        return name;    // return value of the name to caller
    }
}
