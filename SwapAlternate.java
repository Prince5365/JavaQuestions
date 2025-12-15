public class SwapAlternate {
    public static void swapalternate(int arr[]){
        int temp;
        for(int i=0;i<arr.length-1;i+=2){
            temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
        }
        
    }
    public static void main(String[] args) {
        int arr[]={2,4,6,5,8,9,7,3,5};
        swapalternate(arr);
        for(int x:arr){
            System.out.print(x+" ");
        }
    }
    
}
