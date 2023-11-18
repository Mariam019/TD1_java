import java.util.Scanner;

public class Exot1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez la taille du tableau (entre 10 et 50) : ");
        int N = scanner.nextInt();


        if (N < 10 || N > 50) {
            System.out.println("La taille du tableau doit être entre 10 et 50.");
            return;
        }

        int[] T = new int[N];

        System.out.println("Entrez les éléments du tableau : ");
        for (int i = 0; i < N; i++) {
            System.out.print("T[" + i + "] : ");
            T[i] = scanner.nextInt();
        }


        int max = T[0];
        int min = T[0];


        for (int i = 1; i < N; i++) {
            if (T[i] > max) {
                max = T[i];
            }

            if (T[i] < min) {
                min = T[i];
            }
        }


        System.out.println("La valeur maximale est : " + max);
        System.out.println("La valeur minimale est : " + min);
    }
}
