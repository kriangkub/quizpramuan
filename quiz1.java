import java.util.Scanner;

public class quiz1{
  public static void main (String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of minutes : ");
    int mins = sc.nextInt();
    int year = mins/525600;
    int day = (mins - (year*525600))/1440;
    int min = mins-(year*525600+day*1440);
    System.out.println(mins + " minutes is approximately " + year + " years, " + day + " days and " + min + " minutes.");
  }
}