package java.chapters.ch6;

import java.util.Scanner;

public class MaximumFinder
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter three floating point values separated by spaces: ");
        double numb1 = input.nextDouble();
        double numb2 = input.nextDouble();
        double numb3 = input.nextDouble();

        double result = maximum(numb1, numb2, numb3);

        System.out.println("Maximum is: " + result);
    }

    public static double maximum(double x, double y, double z)
    {
        double maximumVal = x; // assume x is largest to start with

        if (y > maximumVal)
            maximumVal = y;

        if (z > maximumVal)
            maximumVal = z;

        return maximumVal;
    }
}
