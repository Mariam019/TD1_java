import java.util.Scanner;

public class Exo5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Entrez l'heure : ");
        int heure = s.nextInt();
        System.out.println("Choisissez la langue : ");
       char c= s.next().charAt(0);

        String f = null,a = null;

        if (c == 'f') {
            if (heure < 18)
                System.out.println("Bonjour");
            else if (heure >= 18 && heure < 22)
                System.out.println("Bonsoir");
            else if (heure >= 22)
                System.out.println("Bonne nuit");
        }
        else if (c == 'a') {
            if (heure < 18)
                System.out.println("Good morning");
            else if (heure >= 18 && heure < 22)
                System.out.println("Good evening");
            else if (heure >= 22)
                System.out.println("Good night");

        }
    }
}