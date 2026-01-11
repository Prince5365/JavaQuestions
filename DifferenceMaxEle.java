public class DifferenceMaxEle{
    public static void main(String [] args){

    int[] array_nums = {5, 7, 2, 4, 9};

    int max = array_nums[0];
    int min = array_nums[0];

    for (int i = 1; i < array_nums.length; i++) {
        if (array_nums[i] > max) {
            max = array_nums[i];
        }
        if (array_nums[i] < min) {
            min = array_nums[i];
        }
    }

    System.out.println("Difference: " + (max - min));
}

}
