public class ReverseaString{
    public static void main(String[] args) {
        String a="aaadddd";
        char[] reversed=a.toCharArray();
        for(int i=reversed.length-1;i>=0;i--){
            System.out.print(reversed[i]);
        }
    }
}