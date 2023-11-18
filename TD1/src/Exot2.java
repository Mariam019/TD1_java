import java.util.Scanner;

public class Exot2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Entrez un entier N : ");
        int N = scanner.nextInt();


        System.out.println("La représentation binaire de " + N + " est : " + decimalToBinary(N));
    }


    public static String decimalToBinary(int decimal) {
        if (decimal == 0) {
            return "0";
        }

        StringBuilder binary = new StringBuilder();
        while (decimal > 0) {
            int remainder = decimal % 2;
            binary.insert(0, remainder);
            decimal = decimal / 2;
        }

        return binary.toString();
    }
}

