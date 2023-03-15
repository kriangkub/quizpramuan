import java.util.Scanner;
class quiz_4{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter width : ");
    double w = sc.nextDouble();
    System.out.print("Enter length : ");
    double l = sc.nextDouble();
    System.out.print("Enter inner depth : ");
    double ind = sc.nextDouble();
    System.out.print("Enter outer depth");
    double outd = sc.nextDouble();
    System.out.print("The different volume of 2 Rectangle Boxes is : "+rectangleBoxVolumeDif(l, w, outd, ind));

  }
  public static double rectangleBoxVolumeDif(double lenght, double width, double deptOut, double deptIn){
    return lenght*width*(deptOut-deptIn);
  }
}