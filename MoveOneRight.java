public class MoveOneRight {
    public static void main(String[] args) {

        int[] arr = {1, 0, 1, 0, 1, 0, 1};

        int countOne = 0;

        // Count number of 1s
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                countOne++;
            }
        }

        // Fill array with 0s first
        for (int i = 0; i < arr.length - countOne; i++) {
            arr[i] = 0;
        }

        // Put all 1s at the right side
        for (int i = arr.length - countOne; i < arr.length; i++) {
            arr[i] = 1;
        }

        // Print result
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
