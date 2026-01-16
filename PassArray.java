public class PassArray {
    public static void modifyArray(int[] arr) {
        arr[0] = 100; // Modifies original array
    }
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};
        System.out.println("Before: " + numbers[0]);
        modifyArray(numbers);
        System.out.println("After: " + numbers[0]);
    }
}