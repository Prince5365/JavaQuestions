public class FindUniqueNumber {
        public static int finduniqnum(int arr[]){
            for(int i=0;i<arr.length;i++){
                for(int j=i+1;j<arr.length;j++){
                    if(arr[i]==arr[j]){
                        arr[i]=-1;
                        arr[j]=-1;
                    }
                }
            }
            int ans=-1;
            for(int i=0;i<arr.length;i++){
                if(arr[i]>0){
                    ans=arr[i];
                }
            }
            return ans;
        }
        public static void main(String[] args) {
            int arr[]={2,5,5,9,8,8,9,9,6};
            System.out.println("unique number is:"+finduniqnum(arr));
    }
    
}
