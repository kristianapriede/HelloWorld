package lekcijaTris.majasDarbsTris;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;


import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;
public class LoopHomeWork {

    public static void main(String[] args) {

        //1.uzd.
        Scanner scanner = new Scanner(System.in);
        int number;
        int sum = 0;

        while (sum <= 100) {
            System.out.println("Ievadiet skaitli zemāk");
            while (true)
                try {
                    number = Integer.parseInt(scanner.nextLine());

                } catch (NumberFormatException nfe) {
                    System.out.println("Lūdzu norādīt veselu skaitli: ");
                }
            sum = sum + number;
        }
        System.out.println("Gatavs");

        //2.uzd.


        //3.uzd.

}
//katrs uzdevums jātaisa kā metode

