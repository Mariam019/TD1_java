import java.util.Scanner;
public class Exo9 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Donnez deux nombres : ");
        int A = s.nextInt();
        int B = s.nextInt();

            System.out.println("Voici les nombres saisis : " + Math.min(A,B) + "  " + Math.max(A,B));


    }
}