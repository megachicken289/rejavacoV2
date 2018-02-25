package chapters.ch8;


public class Time2Test

{
    public static void main(String[] args)
    {
        Time2 t1 = new Time2(); // 00:00:00
        Time2 t2 = new Time2(2); // 02:00:00
        Time2 t3 = new Time2(21,34); // 21:34:00
        Time2 t4 = new Time2(12,25,42); // 12:25:42
        Time2 t5 = new Time2(t4);   // 12:25:42

        System.out.println("Constructed with:");
        displayTime("t1: all default args", t1);
        displayTime("t1: hour specified: default minutes and seconds", t2);
        displayTime("t1: hour and minutes specified: default seconds", t3);
        displayTime("t1: hour, minutes, and seconds specified", t4);
        displayTime("t1: Time2 object t4 specified ", t5);

        // attempt to initialize t6 with invalid dates
        try {
            Time2 t6 = new Time2(27, 24, 99);    // invalid time
        } catch (IllegalArgumentException e) {
            System.out.printf("%nException while initializing t6: %s%n", e.getMessage());
        }
    }

    // display time in 12 and 24 hour formats
    private static void displayTime(String header, Time2 t) {
        System.out.printf("%s%n    %s%n    %s%n",
                header, t.toUniversalString(), t.toString());
    }
}
