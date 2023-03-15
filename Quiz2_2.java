import java.util.*;
import javax.swing.*;

class Quiz2_2{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter r1's center x,y coordinates , width and height");
    int x1 = sc.nextInt();
    int y1 = sc.nextInt();
    float w1 = sc.nextInt();
    float h1 = sc.nextInt();
    System.out.print("Enter r2's center x,y coordinates , width and height");
    int x2 = sc.nextInt();
    int y2 = sc.nextInt();
    float w2 = sc.nextInt();
    float h2 = sc.nextInt();
    double lenghtx = Math.sqrt((x1-x2)*(x1-x2));
    double lenghty = Math.sqrt((y1-y2)*(y1-y2));
    if(w1/2>lenghtx*2&&h1/2>lenghty*2){
      System.out.println("r2 is inside r1");
    }else if((lenghtx+w2/2>w1/2||lenghty+h2/2>h1/2)&&(((w1/2+w2/2)>lenghtx)&&((h1/2+h2/2)>lenghty))){
      System.out.println("r2 is overlap r1");
    }else{
      System.out.println("r2 does not overlaps r1");
      
    }
  }
}