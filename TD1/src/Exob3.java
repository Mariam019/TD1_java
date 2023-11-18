import java.util.Scanner;
public class Exob3 {
    public static void main(String[] args){
         Scanner scanner = new Scanner(System.in);
         //System.out.println("Donner 20 nombre : ");

         int max = Integer.MIN_VALUE;
         int p=0, j=0, N;

         do{
             System.out.println("Donner 20 nombre : ");
              N = scanner.nextInt();
             if(N>max)
             {
                 max = N;
                 p=j;}
             j++;

         }
         while(N != 0);
         System.out.println("Le max est : " +max+ "  sa position est : " +p );
    }
}
