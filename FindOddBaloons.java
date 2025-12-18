import java.util.Scanner;
public class FindOddBaloons {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        char arr[]=new char[t];
        for(int i=0;i<t;i++)
            arr[i]=sc.next().charAt(0);
            int low[]=new int[26];
            int upp[]=new int[26];
            for(int i=0;i<t;i++){
                if((arr[i]>= 'A') &&(arr[i]<='Z'))
                upp[arr[i]-'A']++;
                else if((arr[i]>='a') && (arr[i]<='z'))
                 low[arr[i]-'a']++;
            }
            boolean flag=false;
            char ch='0';
            for(int i=0;i<t;i++){
                if ((arr[i] >= 'A') && (arr[i] <= 'Z'))
            {
                if (upp[arr[i] - 'A'] % 2 == 1)
                    {
                        ch = (char) (arr[i]);
                        flag = true;
                        break;
                    }
            }
            else if ((arr[i] >= 'a') && (arr[i] <= 'z'))
            {
                if (low[arr[i] - 'a'] % 2 == 1)
                {
                    ch = (char) (arr[i]);
                    flag = true;
                    break;
                }
        
            }
            }
            if(flag==true)
                System.out.println(ch);
            else
                System.out.println("All are even");
    }
}
