import java.util.Arrays;

public class FindSmallestAndLargest {
        public static int[] smallestandlargest(int arr[]){
            Arrays.sort(arr);
            int ans[]={arr[0],arr[arr.length-1]};
            return ans;
            
        }
        public static void main(String[] args) {
             int arr[]={2,4,1,3,5,6};
             int ans[]=smallestandlargest(arr);
             System.out.println("smallest number is:"+ans[0]);
             System.out.println("largest number is:"+ans[1]);
}
}