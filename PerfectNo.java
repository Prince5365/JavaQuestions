public class PerfectNo{
    public static void main(String [] args){
        int num=6;
        int temp=num;
        int sum=0;
        for(int i=1;i<num;i++){
            if(num%i==0){
                sum=sum+i;
            }
        }
        if(temp==sum){
            System.out.println("perfect");
        }
        else{
            System.out.println("not perfect");
        }
    }
}