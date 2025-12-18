public class FirstRepeatingNumber {
    public static int firstrepeated(int arr[]){
        int temp[] = new int[1000000];
        for(int i=0;i<arr.length;i++)
        {
            temp[arr[i]]++;
        }
        for(int i=0;i<arr.length;i++)
        {
            if(temp[arr[i]]>1)
            return i+1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={1,6,4,2,5,4,3,5};
        System.out.println(firstrepeated(arr));
    }
    
}
