
public class Exot5 {
    public static void main(String[] args) {


        char [] tab ={'D','E','C','A','L','A','G','E'};
        for( int i =0; i<tab.length;i++)
        { System.out.print(tab[i]  + "  ");}
        System.out.println();

        for( int i =0; i<tab.length;i++)

        {
            tab[i] =  tab[i+1];


            System.out.print(tab[i]  + "  ");
        }

    }
}