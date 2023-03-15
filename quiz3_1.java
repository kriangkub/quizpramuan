import java.util.Scanner;
public class quiz3_1{
  public static void main(String[] args){
    int row,colum,pos=0,even=0,sum=0,total=0;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter row");
    row = sc.nextInt(); 
    System.out.print("Enter column");
    colum = sc.nextInt();
    
    for(int i =0;i<row;i++){
      for(int j = 0 ;j<colum;j++){
        int rd = (int)((Math.random()*3000)-850);
        System.out.print(rd+"\t");
        if(rd>0){
        pos++;
        }
        if(rd%2==0){
        even++;
        }
        if(rd%2==0&&rd>0){
          total++; 
          sum+=rd;
        }
      }
      System.out.println("");
    }
    
      System.out.println("The total number of positive number : "+pos);
      System.out.println("The total number of even number : "+even);
      System.out.println("The total number of our number : "+total);
      System.out.println("The sum number of our number : "+sum);
  }
}