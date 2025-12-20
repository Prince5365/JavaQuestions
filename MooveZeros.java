public class MooveZeros {
    public static void main(String[] args) {
        int arr[] = { 1, 0, 2, 0, 3 };
        int index = 0;
        for (int i = 0; i < arr.length; ++i) {
            if (arr[i] != 0) {
                arr[index++] = arr[i];
            }
        }
        for (int i = index; i < arr.length; ++i)
            arr[i] = 0;
        for (int i = 0; i < arr.length; ++i)
            System.out.print(arr[i] + " ");
    }
}