public class quiz{
  public static void main(String[] args){
    Cylinder c1 = new Cylinder();
    c1.printCylinder();
    System.out.println("");
    Cylinder c2 = new Cylinder(25.4);
    c2.printCylinder();
    System.out.println("");
    Cylinder c3 = new Cylinder(50.8,7.62);
    c3.printCylinder();
    System.out.println("");
  }
}