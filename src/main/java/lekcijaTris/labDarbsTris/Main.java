package lekcijaTris.labDarbsTris;

public class Main {

    public static void main(String[] args) {
        System.out.println("Sākās programma");
        printCard2("Pēteris", "Kalniņš", "Ventspils", 35);

        printNewLine();

        System.out.println("Beidzās programma");
        int laukums = aprekinatTaisnsturaLaukumu(4, 2);
        System.out.println("Taisnstūra laukums ir:" + laukums);


    }

    public static int aprekinatTaisnsturaLaukumu(int platums, int garums) {
        return platums * garums;
    }

    public static void printNewLine() {
        System.out.println("\n");
    }

    public static void printCard2(String vards, String uzvards, String pilseta, int vecums) {
        System.out.println("@@@@@@@@@@@@@");
        System.out.println(vards + " " + uzvards);
        System.out.println(pilseta);
        System.out.println("Vecums" + vecums);
        System.out.println("$$$$$$$$$$$$$");

        //masīva izmērs ir 3
        String dogName;
        String dogname2 = "Reksis";

        int[] menesaTerini = {100, 40, 23, 44, 55, 200};
        String[] produktuSaraksts = {"Piens", "Maize", "Olas"};

        System.out.println(produktuSaraksts[0]); //piens
        System.out.println(produktuSaraksts[1]); //maize
        System.out.println(produktuSaraksts[2]); //olas

        produktuSaraksts[2] = "Desa";
        System.out.println(produktuSaraksts[2]); // desa

        produktuSaraksts[2] = "Desa";
        System.out.println(produktuSaraksts[2]); //desa

        String[] cars = {"Volvo", "BMW", "Nissan", "Mercedes"};
        System.out.println("Masiva garums ir:" + cars.length);

        cars[1] = "Audi";
        String[] studentuSaraksts = new String[23];
        studentuSaraksts[0] = "Jānis Bērziņs";
        studentuSaraksts[1] = "Juris Kreilis";

        System.out.println(studentuSaraksts[0]);
        System.out.println(studentuSaraksts[1]);
        System.out.println(studentuSaraksts[2]);


        whileCikls();

    }

    public static void whileCikls() {

        int x = 5;
        while (x > 0) {
            System.out.println("X nav nulle");
            x = x - 1;


        }
        int i = 10;
        while (i < 50) {
            System.out.println("I ir " + i);
            i = i + 1;

        }

        String[] cars = {"Volvo", "BMW", "Nissan", "Mercedes"};
        int z = 0;
        while (z < 4) {
            System.out.println(cars[z]);
            z = z + 1;
        }
        System.out.println("Kods turpinās");


        int[] monthlyCosts = {100, 90, 45, 33, 12, 899, 5};
        int k = 0;
        while (k < 7) {
            System.out.println(monthlyCosts[k]);
            k++;
        }
//
//        Scanner ievade = new Scanner(System.in);
//        System.out.println("Ievadi skaitli...");
//        int number = ievade.nextInt();
//        int summa = 0;
//
//        while (number > 0) {
//            summa = summa + number;
//            System.out.println("Ievadi skaitli...");
//            number = ievade.nextInt();
//
//        }
//
//        System.out.println("summa ir:" + summa);
//
//
//        String[] kartis = {"Pīķa dūzis", "Ercena kalps", "Kreiča dāma"};
//
//        String[] kartis = {"Pīķa dūzis", "Ercena kalps", "Kreiča dāma"};
//        int m = 0;
//        while (m < kartis.length) {
//            System.out.println(kartis[m]);
//            m++;
//        }
//        int q = 0;
//        do {
//            System.out.println("TEST TEST TEST");
//            q++;
//        } while (q < 10);
//
//        //md
//
//        String parole = "SuperSecretPassword123;";
//        String ievaditaParole;
//        do {
//            System.out.println("Ievadi paroli");
//            ievaditaParole = ievade.nextLine();
//            System.out.println("Pārbaudām paroli");
//        } while (ievaditaParole.equals(parole));
//
//
//        System.out.println("Pareiza parole");

    }

    //int count = 0;
       /// for(int j = 1; j <= 50; j++); {
       // if (!(j % 3 == 0 || j % 5 == 0)) {
         //   count++;
        }


    //System.out.println ("Der" + count + "Māju numuri");
