import java.util.Scanner;
public class Exo3 {
    public static void main( String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Donnez deux nombres entiers : " );
            int a =  s.nextInt();
            int b = s.nextInt();
            int choix = s.nextInt();

            switch(choix){
                case 1: if((a+b)%2==0)
                    System.out.println("La somme est paire.");
                break;
                case 2: if((a*b)%2==0)
                    System.out.println("La multiplication est paire.");
                break;
                case 3: if((a+b)>0)
                    System.out.println("Le signe de la somme est positif.");
                else
                    System.out.println("Le signe de la somme est negatif.");
                break;
                case 4: if((a*b)>0)
                    System.out.println("Le signe de la multiplication est positif.");
                else
                    System.out.println("Le signe de la multiplication est negatif.");
                break;

                default:
                    System.out.println("n/a");

            }
    }
}
