import java.util.Arrays;
public class CopyOfOriginalArray {
        public static void copyarray(int num[]){
            int num2[]=Arrays.copyOf(num,num.length);
           
            
            for(int i=0;i<num2.length;i++){
                System.out.print("copy array is:");
                System.out.println(num2[i]);
            
            }
            
        }
        public static void main(String[] args) {
        int num[]={2,3,4,5,6};
        copyarray(num);
    }
}