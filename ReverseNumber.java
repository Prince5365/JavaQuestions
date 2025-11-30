public class ReverseNumber{
    public static void main(String [] args){
        int digit=1234;
        int rev=0;
        while(digit!=0){
            int ld=digit%10;
            rev=rev*10+ld;
            digit/=10;
        }
        System.out.println("Reverse number is:"+rev);
    }
}