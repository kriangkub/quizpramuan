import java.util.Scanner;
class quiz_4_1{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("volume of sphere is "+calVolume(5) );
    System.out.println("volume of cylinder is "+calVolume(10, 5) );
    System.out.println("volume of triangle prism is "+calVolume(10, 2, 5) );
    
    }
    
  public static double calVolume(double r){
    return Math.PI*r*r*r*4/3;
  }
  public static double calVolume(double r, double h){
    return Math.PI*r*r*h;
  }
  public static double calVolume(double r, double h, double b){
    return b*h*r/2;
  }
}