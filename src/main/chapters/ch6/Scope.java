package chapters.ch6;

public class Scope
{
    // field that is accessible to all methods of this class
    private static int x = 1;   // field var

    public static void main(String[] args) {
        int x = 5; // is local var      //local var x shadows field x
        System.out.printf("local x in main is %d%n", x);
        
        useLocalVariable(); // has local x
        useField();         // has field x
        useLocalVariable(); // reinitializes local x
        useField();         // retsins field x val

        System.out.printf("%nlocal x in main is %d%n", x);
    }
    
    public static void useLocalVariable()
    {
        int x = 25;     // initialzie each time method called

        System.out.printf("%nlocal x on entering method useLocalVariable is %d%n", x);
        ++x; // changes to show effect
        System.out.printf("local x before exiting method useLocalVariable is %d%n", x);
    }
    
    public static void useField()
    {
        System.out.printf("%nfield x on entering method useField is %d%n", x);
        x *= 10; // changes to show effect
        System.out.printf("field x before exiting method useField is %d%n", x);
    }
}
