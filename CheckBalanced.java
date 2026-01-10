public class CheckBalanced {
    public static void isbalanced(String str){
        int cir=0,sq=0,cur=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='[') sq++;
            else if(ch==']')sq--;
            else if(ch=='{')cur++;
            else if(ch=='}')cur--;
            else if(ch=='(')cir++;
            else if(ch==')')cir--;
        }
        if(sq==0 && cir==0 && cur==0){
            System.out.println("Balanced");
        }
        else System.out.println("Not Balanced");
    }
    public static void main(String[] args) {
        String str="{([])}";
        isbalanced(str);
    }
}
