import java.util.Scanner;


public class Exo1 {
    public static void main(String[] args) {
        Scanner s  = new Scanner(System.in);
        System.out.println("Entrez trois nombres differents :  ");
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        if(a>b && a>c)
            System.out.println("le max est : " +a);
        else if(b>a && b>c)
            System.out.println("le max est : " +c);
        else
            System.out.println("le max est : " +c);
    }
}