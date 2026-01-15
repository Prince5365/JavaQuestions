public class ArrayInitialization {
    public static void main(String[] args) {
        // Using array initializer
        String[] fruits = {"Apple", "Banana", "Orange"};
        // Manual initialization
        int[] scores = new int[3];
        scores[0] = 90;
        scores[1] = 85;
        scores[2] = 88;
        System.out.println("First fruit: " + fruits[0]);
        System.out.println("First score: " + scores[0]);
    }
}