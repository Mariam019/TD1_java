import java.util.Scanner;
public class Exo6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Donner deux entiers A et B ");
        int A = sc.nextInt();
        int B = sc.nextInt();

        if ((A > 0 && B > 0) || (A<0 && B<0))
            System.out.println("Le signe du produit est positif");
        else
            System.out.println("Le signe du produit est negatif");
    }
}