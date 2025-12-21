import java.util.Scanner;


public class ThreePairsOfSum {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("enter array size:");
            int n=sc.nextInt();
            int arr[]=new int[n];
            System.out.println("enter array element:");
            for(int i=0;i<arr.length;i++){
                arr[i]=sc.nextInt();
            }
            System.out.println("enter sum of target:");
            int target=sc.nextInt();
            int ans=0;
            for(int i=0;i<arr.length;i++){
                for(int j=i+1;j<arr.length;j++){
                    for(int k=j+1;k<arr.length;k++){
                        if(arr[i]+arr[j]+arr[k]==target){
                            ans++;
                        }
                    }
                }
            }
            System.out.println("total pairs is:"+ans);
    }
    
}
