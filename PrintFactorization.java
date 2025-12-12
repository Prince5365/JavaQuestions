import java.util.Scanner;
public class PrintFactorization {
    public static void printPrimeFactors(int n) {
        System.out.println("Prime factors of " + n + " are:");

        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                System.out.print(i + " ");
                n = n / i;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        printPrimeFactors(number);
    }
}