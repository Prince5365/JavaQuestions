import java.util.*;
public class FindFirstNumber {
    public static int number(int num){
        while(num>10){
            num/=10;
        }
        return num;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=sc.nextInt();
        System.out.println("The first number is:"+number(num));
    }
}
