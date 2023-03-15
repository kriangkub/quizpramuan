import java.util.Arrays;
import java.util.Scanner;

public class quiz06{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter number row and colum : ");
      int size = sc.nextInt();
      int[][] arr = new int[size][size];
      for(int i =0 ; i<size ; i++){
        for(int j =0 ; j<size ; j++){
          int random = (int)(Math.random()*100);
          arr[i][j] = random;
          System.out.print(arr[i][j]+"\t");
        }
        System.out.println("");
      }
      show49Sharp(arr);
    }
    public static void show49Sharp(int[][] matrix){
      System.out.println("  Result : ");
      for(int i =0 ; i<matrix.length ; i++){
        for(int j =0 ; j<matrix.length ; j++){
          if(j%3==0){
            if(matrix[i][j]%10==4||matrix[i][j]%10==9){
              System.out.print(matrix[i][j]+"\t");
              continue;
            }
            System.out.print("#"+"\t");
            continue;
          }
          System.out.print(matrix[i][j]+"\t");
        }
        System.out.println("");
      }
      
    }
}
