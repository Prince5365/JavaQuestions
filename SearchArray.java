public class SearchArray {
    public static int linearsearch(int arr[],int key) {
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
        
    }
        public static void main(String[] args) {
            int arr[]={10,5,8,9,6,7,2};
            int key=7;
            int index=linearsearch(arr,key);
            if(index==-1){
                System.out.println("not found");
            }else{
            System.out.println("key at index is:"+index);
            }
        }
}
