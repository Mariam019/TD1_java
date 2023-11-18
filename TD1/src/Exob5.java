import java.util.Scanner;
public class Exob5
{
    public static void main(String[]args){
        int n,un=1,un1=1,un2=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("the N:");
        n=sc.nextInt();
        if(n==0||n==1){
            System.out.println(1);
            return;
        }
        System.out.print("11");
        for(int i=2;i<=n;i++){
            un=un1+un2;
            un2=un1;
            un1=un;
            System.out.print(un+ " " );
        }
    }
}
