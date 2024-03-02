public class Met_over2 {
    static void max(int a,int b)
    {
        System.out.println(a>b ? a:b);
    }
    static void max(int a,int b,int c)
    {
        if(a>b && a>c) System.out.println(a);
        else if(b>a && b>c) System.out.println(b);
        else System.out.println(c);
    }
    static void max(int[] arr,int n)
    {
        int mx=arr[0];
        for(int i=0;i<n;i++)
        {
            if(arr[i]>mx) mx=arr[i];
        }
        System.out.println(mx);
    }
    public static void main(String[] args) {
        max(12, 6);
        max(2, 4, 1);
        int[] arr={1,3,6,2};
        max(arr, 4);
    }
}