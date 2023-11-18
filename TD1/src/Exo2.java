//Un programme qui va resoudre l'équation ax2+bx+c=0

import java.util.Scanner;

public class Exo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Donnez les valeurs a, b et c :" );
        double a = sc.nextDouble();
        double  b = sc.nextDouble();
        double c = sc.nextDouble();

        double d = b*b-4*a*c;
            if(d==0) {
                System.out.println("x=  " + -b/2*a );
            }
            else if(d>0) {
                System.out.println("x1 = " + (-b + Math.sqrt(d)) / 2*a + "  x2 = " + (-b - Math.sqrt(d)) / 2*a);
            }

            else if(d<0) {
                System.out.println("y a pas de solution");
            }


    }
}
