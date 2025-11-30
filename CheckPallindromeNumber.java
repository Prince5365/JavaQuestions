public class CheckPallindromeNumber{
    public static void main(String [] args){
        int digit=121;
        int temp=digit;
        int rev=0;
        while(digit!=0){
            int ld=digit%10;
            rev=rev*10+ld;
            digit/=10;
        }
        if(temp == rev){
            System.out.println("Number is Pallindrome:");
        }else{
            System.out.println("Number is not Pallindrome:");
        }
    }
}