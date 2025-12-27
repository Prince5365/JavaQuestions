import java.util.Scanner;


public class TotalPairsOfSum {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("enter array size:");
            int n=sc.nextInt();
            int arr[]=new int[n];
            System.out.print("enter array element:"+" ");
            for(int i=0;i<arr.length;i++){
                arr[i]=sc.nextInt();
            }
            System.out.println("enter sum of target:");
            int target=sc.nextInt();
            int ans=0;
            for(int i=0;i<arr.length;i++){
                for(int j=i+1;j<arr.length;j++){
                    if(arr[i]+arr[j]==target){
                        ans++;
                    }
                }
            }
            System.out.println("total pairs of sum is:"+ans);
            
}
}
