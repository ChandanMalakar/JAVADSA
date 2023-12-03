package dsa;
public class reverse {
    public static void doit(char arr[])
    {
        int first=0;
        int last=arr.length-1;
        char temp;
        while(first<last)
        {
            temp=arr[last];
            arr[last]=arr[first];
            arr[first]=temp;

            first++;
            last--;
        }
    }
    public static void main(String args[])
    {
        char arr[]={'M','A','D','A','N'};
        doit(arr);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]);
        }
    }
}
