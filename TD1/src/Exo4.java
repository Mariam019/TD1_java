import java.util.Scanner;
public class Exo4 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Donnez la moyenne de l'etudiant ");
        double M= s.nextDouble();
        if (M>=16)
            System.out.println("Mention tres bien");
        else if(M>=14)
            System.out.println("Mention bien");
        else if(M>=12)
            System.out.println("Mention assez bien");
        else if(M>=10)
            System.out.println("Mention passable");
    }
}
