public class SumOfDigit{
    public static void main(String [] args){
        int digit=154;
        int sum=0;
        while(digit!=0){
            int ld=digit%10;
            sum=sum+ld;
            digit/=10;
        }
        System.out.println("sum of digit is:"+sum);
    }
}