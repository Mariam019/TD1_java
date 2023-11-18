import java.util.Scanner;

        public class Exo8{
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        System.out.println("entrez une annee:");
        int annee= sc.nextInt();

        System.out.println("entrez le numero du mois:");
        int numMois= sc.nextInt();
        if(annee>1900 && annee<2100)

        {
            if(numMois==1|| numMois==3|| numMois==5|| numMois==7 || numMois==8 || numMois==10 ||  numMois==12)
                System.out.println("le nombre du jours de cemois est 31.");
            else if(numMois==4||numMois==6||numMois==9||numMois==11)
            System.out.println("le nombre du jours de ce mois est 30");
else{
            if(annee%4==0&&numMois==2)
                System.out.println("le nombre du jours de ce mois est  29.");
            else
                System.out.println("le nombre du jours de  cemoisest 28.");
        }
        }

    }
}
