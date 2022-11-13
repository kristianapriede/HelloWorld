package lekcijaPieci.majasDarbs;

public class Cilindrs {
    private double height;
    private double radius;

    public double getHeight() {return height};
    public void setHeight(double height) {this.height = height};

    public double getRadius() {return radius};
    public void setRadius(double radius) {this.radius = radius};

    public double surFaceArea;
    double volume;

    public double getSurFaceArea (){
        return 2 * Math.PI * radius * (radius + height);}
    public double getVolume() {return Math.PI * radius * radius * height};}

    public Cilindrs(double radius, double height) {
        this.height = height;
        this.radius = radius;}

    public Cilindrs(){}
    public void printCilindrs() {
        System.out.println("Radiuss: " + radius + "\n Augstums: " + height);
}
