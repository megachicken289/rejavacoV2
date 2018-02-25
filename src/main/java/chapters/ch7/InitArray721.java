package java.chapters.ch7;

public class InitArray721
{
    // in IntelliJ, run this program at least once to create a run config to edit
    // once created, edit the config, go to "Program Arguments" and add arguments
    public static void main(String[] args)
    {
        // check number of cmd-ln args
        if (args.length !=3)
        {
            System.out.printf(
                    "Error: Please re-enter the entire command, including%n" +
                            "an array size, initial value, and increment%n"
            );
        } else  {
            // get array size from first cmd-ln arg
            int arrayLength = Integer.parseInt(args[0]);
            int[] array = new int[arrayLength];

            // get initial val and increment from cmd-ln arg
            int initalValue = Integer.parseInt(args[1]);
            int increment = Integer.parseInt(args[2]);

            // calc value for each array element
            for (int counter = 0; counter < array.length; counter++)
                array[counter] = initalValue + increment * counter;

            System.out.printf("%s%8s%n", "Index", "Value");

            // display array index and value
            for (int counter = 0; counter < array.length; counter++) {
                System.out.printf("%s%8s%n", counter, array[counter]);
            }
        }
    }
}
