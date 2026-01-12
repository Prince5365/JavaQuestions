public class SmallestAndSecSmallest {
    public static void main(String[] args) {

        int[] arr = {5, 7, -8, 5, 14, 1};

        // If array has less than 2 elements
        if (arr.length < 2) {
            System.out.println("Array must have at least two elements");
            return;
        }

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        // Loop through the array
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] < smallest) {
                secondSmallest = smallest; // old smallest goes to second
                smallest = arr[i];        // new smallest
            }
            else if (arr[i] > smallest && arr[i] < secondSmallest) {
                secondSmallest = arr[i];
            }
        }

        // Check if second smallest exists
        if (secondSmallest == Integer.MAX_VALUE) {
            System.out.println("Second smallest element not found");
        } else {
            System.out.println("Smallest element: " + smallest);
            System.out.println("Second smallest element: " + secondSmallest);
        }
    }
}
