/*public class Arrays_creation {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(arr.length);
        System.out.println(arr[0]+arr[1]-arr[2]*arr[3]);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
}/* */

import java.util.Scanner;

public class Arrays_creation{
    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        int n=read.nextInt();
        int[] arr= new int[n]; // ->java style
        // int arr[]= new int[n]-> cstyle
        
        for(int i=0;i<n;i++){
            arr[i]=read.nextInt();
        }
        for(int i=0;i<n;i++){
           System.out.print(arr[i]+" ");
        }
    }
}
