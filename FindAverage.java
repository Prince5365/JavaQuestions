public class FindAverage {
    public static void main(String[] args) {
       int arr[]={2,5,-8,-6,8,7,3};
       double avg;
       int sum = 0;
       int count = 0;
       for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                count++;
                sum += arr[i];
        }
    }
        avg = (double) sum / count;
        System.out.println("average is:"+avg);

    }
    
    
}