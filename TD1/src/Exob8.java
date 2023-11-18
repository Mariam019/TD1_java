import java.util.Scanner;
public class Exob8 {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       System.out.println("Donnez un nombre : ");
       int N = sc.nextInt();
       int s=0;
       while(N>0)
       {
           s = s + N %10;
           N = N/10;
       }
       System.out.println(s);
    }
}
