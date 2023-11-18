import java.util.Scanner;
public class Exob2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Donner un entier N :");
        int N = sc.nextInt();
        int s=0;

        for(int i =0; i<=N; i++) {
            if (i % 2 == 1) {
                s = s + i;
            }
        }
        System.out.println(s);
    }
}
