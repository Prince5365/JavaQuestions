public class LargestOf3Number{
    public static void main(String [] args){
        int a=10,b=20,c=30;
        if(a>b && a>c){
            System.out.println("A is:"+a);
        }
        else if(b>a && b>c){
            System.out.println("B is:"+b);
        }
        else{
            System.out.println("C is:"+c);
        }
    }
}