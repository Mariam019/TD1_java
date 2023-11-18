import java.util.Scanner;

public class Exot3 {
    public static void main(String[] args) {
        int i;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez la taille du tableau : ");
        int N = scanner.nextInt();

        double[] T = new double[N];
        System.out.println("Entrez les moyennes : ");

        for (i = 0; i < N; i++) {
            System.out.print("T[" + i + "] : ");
            T[i] = scanner.nextDouble();
        }

        System.out.print("Entrez le seuil de moyenne : ");
        double seuil = scanner.nextDouble();

        int resultat = count(T, seuil);
        System.out.println("Le nombre d'étudiants ayant une moyenne supérieure ou égale à " + seuil + " est : " + resultat);


        scanner.close();
    }

    public static int count(double[] T, double seuil) {

        int count = 0;


        for (double moyenne : T) {

            if (moyenne >= seuil) {
               count++;
            }
        }

        return count;
    }

}
