package lekcijaPieci.majasDarbs;

public class Main {
    public static void main(String[] args) {

        Cilindrs cilindrs2 = new Cilindrs(70,65);
        System.out.println("Cilindrs Nr. 1: ");

        cilindrs2.printCilindrs();

        System.out.println("Cilindra Nr. 1 virsmas laukums :" + cilindrs2.getSurFaceArea());
        System.out.println("Cilindra Nr. 1 virsmas tilpums :" + cilindrs2.getVolume());

        System.out.println("**************");

        Cilindrs cilindrs = new Cilindrs();
        System.out.println("Cilindrs 2");

        cilindrs.setRadius(7);
        System.out.println("Cilindra radiuss: " + cilindrs.getRadius());

        cilindrs.setHeight(45);
        System.out.println("Cilindra augstums: " +cilindrs.getHeight());

        System.out.println("Cilindra virsmas laukums ir: ") + cilindrs.getSurFaceArea();
        System.out.println("Cilindra tilpums ir: " + cilindrs.getVolume());
    }
}
