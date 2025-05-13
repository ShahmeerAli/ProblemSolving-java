import java.util.Scanner;


public class Table {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);

        System.out.println("Enter your desired input");

        int n=in.nextInt();


        printtable(n);

         

    }


    private static void printtable(int a){
        
        for(int i=1;i<=10;i++){
            System.out.print(a * i + " ");
        }

    }
    
}
