package lekcijaDivi.majasDarbsDivi;

import java.util.ArrayList;
import java.util.Scanner;

public class HomeWorkTwo {

    public static void main(String[] args) {

        //1.uzd.
        int x = 10;

        System.out.println(x > 0);

        System.out.println(x < 0);

        System.out.println(x > 5 && x <= 10);

        x = 6;
        System.out.println(x > 5 || x != 5 && x < 10);

        System.out.println(x == 0 || x == 10);

        System.out.println(x * x > 10);
    }
//2.uzd.

    System.out.println("Lūdzu ievadiet kalendāra mēnesi no 1 līdz 12: ");

    Scanner sc = new Scanner(System.in);
    int monthNumber = sc.nextInt();

    switch(monthNumber)

    {
        case 1:
            System.out.println("Janvāris");
        case 2:
            System.out.println("Februāris");
        case 3:
            System.out.println("Marts");
        case 4:
            System.out.println("Aprīlis");
        case 5:
            System.out.println("Maijs");
        case 6:
            System.out.println("Jūnijs");
        case 7:
            System.out.println("Jūlijs");
        case 8:
            System.out.println("Augusts");
        case 9:
            System.out.println("Septembris");
        case 10:
            System.out.println("Oktobris");
        case 11:
            System.out.println("Novembris");
        case 12:
            System.out.println("Decembris");
        default:
            System.out.println("Kalendārā nav mēneša ar šādu numuru");
    }

//3.uzd.

    Scanner readInput = new Scanner(System.in);

    System.out.println("Lūdzu ievadiet trīs pilnus skaitļus");
    //?   int a = readInput.nextInt();
    //    int b = readInput.nextInt();
    //    int c = readInput.nextInt();

    //    System.out.println("Lielākais skaitlis ir " + Math.max(a,b));

    ArrayList<Integer> numbers = new ArrayList<Integer>();
    numbers.add(readInput.nextInt());
    numbers.add(readInput.nextInt());
    numbers.add(readInput.nextInt());

    int currentHighest = Integr.MIN_VALUE;
    for(
    int currentNumber :numbers)

    {
        if (currentNumber > currentHighest) {
            currentHighest = currentNumber;
        }
    }
    System.out.println("Lielākais skaitlis ir: "+currentHighest);

    //4.uzd.

    String trafficLight;
    System.out.println("Lūdzu ievadiet luksofora gaismas krāsu");
    Scanner scanner = new Scanner(System.in);
    trafficLight =scanner.nextLine();

    if(trafficLight.equeals("sarkans"))

    {
        System.out.println("STĀVI!");
    } else if(trafficLight.equals("dzeltens"))

    {
        System.out.println("GATAVOJIES!");
    } else if(trafficLight.equals("zaļš"))

    {
        System.out.println("EJ!");
    } else

    {
        System.out.println("PĀRBAUDI ZĪMES!");
    }

//5 un 6.uzd.

    printBusinessCard();

    printBusinessCard();

    printBusinessCard();

    printBusinessCard2("Kristiāna","Priede",23456789,1995);

    printBusinessCard2("Vaira","Bērziņa",29876543,1960);

}

public static void printBusinessCard() {
    System.out.println("Vizitkarte 1");
    System.out.println("Vards:Kristiana");
    System.out.println("Uzvards:Priede");
    System.out.println("Talrunis:23456789");
    System.out.println("Dzimsanas gads:1995");
}

public static void printBusinessCardTwo( String name, String lastName, int phoneNumber, int birthYear) {
    System.out.println("Vizitkarte 2");
    System.out.println("Vards:" + Vards);
    System.out.println("Uzvards:" + Uzvards);
    System.out.println("Talrunis:" + Talrunis);
    System.out.println("Dzimsanas gads: "Dzimsanas gads);
}

}










