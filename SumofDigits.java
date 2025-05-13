import java.util.Scanner;

public class SumofDigits {
    public static void main(String [] args){
      Scanner in=new Scanner(System.in);
       System.out.println("Enter the Digit");
        int no=in.nextInt();

        int temp=no;
        int reverse=0;
        int digits;
        int sum=0;


        //separating the digits

        while(temp!=0){
            digits=temp % 10;
            sum= sum+ digits;
            temp=temp/10;

        }

        temp=sum;

        //reversing the number
        while(temp!=0){
              reverse=(reverse * 10) + (temp % 10);
              temp=temp/10;

        }

        if(sum==reverse){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }




         



    }
}
