import java.util.Scanner;

public class AP {

    public static void main(String[] args){
        Scanner in=new Scanner(System.in);

        System.out.println("Enter the First 1 digit");
        int firtsdiit=in.nextInt();
        System.out.println("Enter the Second digit");
        int seconddigit=in.nextInt();
        System.out.println("Enter the nth term");
        int nthterm=in.nextInt();


        System.out.println(findarithprogr(firtsdiit,seconddigit,nthterm));


        


    }

    private static int findarithprogr(int a,int b,int n){

        int d=b-a;
        int an=a + (n-1)*d;

        return an;

    }
    
}
