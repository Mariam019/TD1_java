import java.util.Scanner;

        public class Exo7{
    public static void main (String[]args){
        Scanner scanner=new Scanner(System.in);

        System.out.print("Entrez un entier de trois chiffres non nuls:");
        int nombre= scanner.nextInt();


        if(nombre<100||nombre>999){
            System.out.println("Veuillez entrer un entier de trois chiffres non nuls.");
        }else{
            int[]chiffres=new int[3];
            int temp=nombre;


            for(int i=2;i>=0;i--){
                chiffres[i]=temp%10;
                temp/=10;
            }

            System.out.println("Nombres formés par les chiffres de"+nombre+":");


            for(int i=0;i<3;i++){
                for(int j=0;j<3;j++){
                    for(int k=0;k<3;k++){
                        if(i!=j&&j!=k&&k!=i){
                            int permutation=chiffres[i]*100+chiffres[j]*10+chiffres[k];
                            System.out.println(permutation);
                        }
                    }
                }
            }
        }

        scanner.close();
    }
}
