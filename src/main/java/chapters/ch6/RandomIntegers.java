package chapters.ch6;

import java.security.SecureRandom;

public class RandomIntegers
{
    public static void main(String[] args) {
        SecureRandom randomNumbers = new SecureRandom();

        for ( int count = 1; count <=20; count++) {
            for (int counter = 1; counter <= 20; counter++) {
                int face = 1 + randomNumbers.nextInt(6);    // pick rand num

                System.out.printf("%d  ", face);

                // if counter is divisible y 5, start a new line of input
                if (counter % 5 == 0) {
                    System.out.println();
                }
            }
            System.out.println("~~~~~~~~~~~~~~~~~~~~");
        }
    }
}
