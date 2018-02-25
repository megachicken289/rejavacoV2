package java.chapters.ch3.withConstrAndDouble;

public class Account {
    private String name;    // instance variable
    private double balance; // instance variable

    // account constructor that receives two parameters
    public Account(String name, double balance)
    {
        this.name = name;       // assign name to instance variable name

        // validate that the balance ; if it's not instance variable
        // balance keeps its default initial value of 0.0
        if (balance > 0.0)
            this.balance = balance; // assign it to instance variable balance
    }

    // method that deposits (adds) only a valid amount to the balance
    public void deposit(double depositAmoount)
    {
        if (depositAmoount > 0.0) // validate deposit amount
            balance = balance + depositAmoount;
    }

    // method returns the amount bal
    public double getBalance()
    { return balance; }

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
