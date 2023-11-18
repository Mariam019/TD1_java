public class Exob4 {
    public static void main(String[] args){

                int a=32,b=12,p=1;

                for(int i=1; i< Math.min(a,b);i++)
                {
                    if(a%i==0 && b%i==0){
                        p=i;
                    }
                }
                System.out.println("PGCD = " +p);

    }
}
