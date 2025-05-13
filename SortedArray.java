

public class SortedArray{

    public static Boolean isSorted(int array[],int len){
        if(len==0 || len==1){
            return true;
        }

        return array[len-1]>=array[len-2] && isSorted(array, len-1);

    }
  public static void main(String[] args){

    int [] array = {1,2,3,4,5};

    System.out.println(isSorted(array,array.length));
    
  }   
  
}