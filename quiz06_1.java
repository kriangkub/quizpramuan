import java.util.Arrays;
import java.util.Scanner;

public class quiz06_1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of your oder : ");
        int ord = sc.nextInt();
        double[] arr = new double[10];
        System.out.print("Enter ten number : ");
        for (int i = 0 ; i < arr.length; i++){
          arr[i] = sc.nextDouble();
        }
        Arrays.sort(arr);
        for (int i = 0 ; i < arr.length; i++){
          System.out.print(arr[i]+" ");
        }
        System.out.print("Your number is  " + arr[10-ord]);
    }

}