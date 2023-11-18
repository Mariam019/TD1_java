import java.util.Scanner;
public class Exot4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int S[][] = new int[2][2];

        int[][] T = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("T[" + i  + "][" + j + "] : ");
                T[i][j] = scanner.nextInt();
            }
        }
        System.out.println();

        int[][] T2 = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("T2[" + i  + "][" + j  + "] : ");
                T2[i][j] = scanner.nextInt();
            }
        }

        System.out.println("La somme des deux matrices est :");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println(S[i][j] = T[i][j] + T2[i][j]);

            }

        }
    }
}