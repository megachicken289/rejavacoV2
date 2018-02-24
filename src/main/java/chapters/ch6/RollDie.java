package chapters.ch6;

import java.security.SecureRandom;

public class RollDie
{
    public static void main(String[] args) {
        SecureRandom secureNumbers = new SecureRandom();

        int freq1 = 0;  // count 1s rolled
        int freq2 = 0;  // count 2s rolled
        int freq3 = 0;  // count 3s rolled
        int freq4 = 0;  // count 4s rolled
        int freq5 = 0;  // count 5s rolled
        int freq6 = 0;  // count 6s rolled

        int freq1post = 0;  // count 1s rolled
        int freq2post = 0;  // count 2s rolled
        int freq3post = 0;  // count 3s rolled
        int freq4post = 0;  // count 4s rolled
        int freq5post = 0;  // count 5s rolled
        int freq6post = 0;  // count 6s rolled

        for (int roll = 1; roll <= 6000000; roll++)
        {
            int face = 1 + secureNumbers.nextInt(6); // numbers 1-6

            // use face face value 1-6 to determin which counter to increment
            switch (face)
            {
                case 1:
                    ++freq1;
                    freq1post++;
                    break;

                case 2:
                    ++freq2;
                    freq2post++;
                    break;

                case 3:
                    ++freq3;
                    freq3post++;
                    break;

                case 4:
                    ++freq4;
                    freq4post++;
                    break;

                case 5:
                    ++freq5;
                    freq5post++;
                    break;

                case 6:
                    ++freq6;
                    freq6post++;
                    break;
            }
            if (roll % 100000 == 0)
                System.out.println("Roll: " + roll);
        }

        System.out.println("");

        System.out.println("Face\tFreq"); // headers
        System.out.printf("1\t%d%n2\t%d%n3\t%d%n4\t%d%n5\t%d%n6\t%d%n", freq1, freq2,freq3,freq4,freq5,freq6);

        System.out.println("");

        System.out.println("Face\tFreq"); // headers
        System.out.printf("1\t%d%n2\t%d%n3\t%d%n4\t%d%n5\t%d%n6\t%d%n", freq1post, freq2post,freq3post,freq4post,freq5post,freq6post);
    }
}
