import java.util.Scanner;
public class Exob1 {
    public static void main(String[] args){

        int f=1;
        Scanner sc=new  Scanner(System.in);

        System.out.print("Entrez un entier : ");
        int n=sc.nextInt();

        for(int i=1;i<=n;i++)
            f *= i;
        System.out.println("le factoriel de n est : " +f);

    }
}
