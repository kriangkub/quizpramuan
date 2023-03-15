import java.util.Scanner;
public class quiz3_2{
  public static void main(String[] args){
    double t,t1=0,t2=0;
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for(int i=1;i<=n;i++){
      if(i%3==0||i%5==0){
        t1 += Math.pow(-1,i+1)/(2*i-1);
        t2 += 2*i;
        }
      if(i%30==0){
        t=t1+t2;
        System.out.println(t);
        }
      }
  }
}