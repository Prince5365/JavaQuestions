public class ConvertUpperToLowerAndLowerToUpper {
    public static void main(String[] args) {
        String s1="AbCdE";
        char ch[]=s1.toCharArray();
        for(int i=0;i<s1.length();i++){
            if(ch[i]>='A' && ch[i]<='Z'){
                ch[i]=(char)(ch[i]+32);
            }
            else if(ch[i]>='a' && ch[i]<='z'){
                ch[i]=(char)(ch[i]-32);
            }
        }
        String sc=new String(ch);
        System.out.println(sc);
    }
}
