import java.util.Scanner;
public class PrintByNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str;
        System.out.println("enter a string");
        str=sc.nextLine();
        int n=3;
        for(int i=0;i<n;i++){
            System.out.print(str+" ");
        }
        
    }
    
}