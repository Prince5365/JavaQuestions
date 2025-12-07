public class Lcm{
    public static void main(String [] args){
        int n1=12;
        int n2=15;
        for(int i=n2; ; i=i+n2){
            if(i%n1==0 && i%n2==0){
                System.out.println(i);
                break;
            }
        }
    }
}