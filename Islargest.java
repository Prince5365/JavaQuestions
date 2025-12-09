public class Islargest{
    public static void main(String [] args){
        int num=125;
        int max=0;
        while(num!=0){
            int ld=num%10;
            num/=10;
            if(ld>max){
                max=ld;
            }
        }
        System.out.println("greater is :"+max);
    }
}