import java.util.Scanner;
public class CheckVoteEligible{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter age:");
        int age=sc.nextInt();
        if(age>=18){
            System.out.println("You can vote now:");
        }
        else{
            System.out.println("You are not eligible for vote:");
        }
    }
}