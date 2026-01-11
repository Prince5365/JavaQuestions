import java.util.Arrays;

public class AverageExMaxMin {
    public static void main(String[] args) {

        int[] arr = {5, 7, 2, 4, 9};

        System.out.println("Array: " + Arrays.toString(arr));

        int max = arr[0];
        int min = arr[0];
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (arr[i] > max) {
                max = arr[i];
            }

            if (arr[i] < min) {
                min = arr[i];
            }
        }

        float avg = (float)(sum - max - min) / (arr.length - 2);

        System.out.println("Average (except max & min): " + avg);
    }
}
