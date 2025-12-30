public class CountOdd{
    public static void main(String [] args){
        int arr[]={1,2,4,6,5,8};
        int count=0;
        for(int i:arr) {
        if(i%2!=0){
        count++;
        }
        }
System.out.println(count);
    }
    
}