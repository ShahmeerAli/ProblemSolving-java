public class Pattern {
    public static void main(String[] args) {

        int n=3;
        int v=n;
        int a=v;

        while (n >=1) {


            for(int i=v;i>=1;i--){
                for(int j=a;j>=1;j--){
                System.out.print(i+ " ");
                
                }          
                
            }
            
            System.out.print("-1 ");
            a=a-1;
           
            n=n-1;

        }
        
      
       
    

        
    }
    
}
