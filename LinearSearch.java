public class LinearSearch{
    public static void main(String [] args){
        int arr[] = {1, 5, 7, 8, 9};
        int key = 2;
        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
                if (arr[i] == key) {
                System.out.println("Key found at index no: " + i);
                found = true;
                break;
    }
}

        if (!found) {
            System.out.println("Key not found");
}

}
}