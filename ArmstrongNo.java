import java.util.*;

public class ArmstrongNo {

    
    public static void main(String [] args){


       Scanner in=new Scanner(System.in);

       System.out.println("Enter the number you want to check");
       int number=in.nextInt();

         System.out.println(checkArmstrong(number));

    


     

     

      



    }


    private static String checkArmstrong(int number){

        int temp=number;
        int count=0;
        int digit;
        int n;
        int totalsum=0;
      
        while(temp>0){
            n=0;
           digit=temp%10;
    
           n=digit * digit * digit;
           totalsum=totalsum+n;
           temp=temp/10;
        
    
        }


        if(totalsum==number){
            String answer="Yes, the given number is Armstrong number";
            return answer;
        }else{
            return "NO";
        }

    
}

}
