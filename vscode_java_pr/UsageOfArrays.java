import java.util.Arrays;

public class UsageOfArrays {
    public static void main(String[] args) {
        int[] a={10,20,30,40,};//in plaace opetation
        //int[] b= a;
        int[] b=a.clone();//a shallow copy
        a[1]=2000;
        System.out.println(Arrays.toString(b));

       


     }

     
    
}
