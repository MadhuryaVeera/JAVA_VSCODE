import java.util.Arrays;
import java.util.Scanner;
public class Sorting_array {
    public static void main(String[] args) {
           Scanner sc=new Scanner(System.in);  
      //        int arr[]={4,8,1,29,45};
      //  System.out.println( Arrays.sort(arr));//->it doesnt return any value
      // Arrays.sort(arr);
      // System.out.println(Arrays.toString(arr));


        int n=sc.nextInt();
        String[] strArray=new String[n]; //the list is:[sm,sm,sm,sm,sm]
        Arrays.fill(strArray,"sm"); // it want to add the reqire elemnents

        // for(int i=0;i<strArray.length;i++){
        //   System.out.println(strArray[i]);
        // }
        //System.out.println(Arrays.toString(strArray));

      //  int [] p = {10,20,30,40,50};
      //  int [] q = {10,20,30,40,50};
      //  int [] r = {10,50,30,40,50};
      //  int [] s = {10,30,30,40,50};
      //  System.out.println(Arrays.compare(r,s));
       //System.out.println(Arrays.compare(q,r));   //q==r(0) ; q<r(-1);  q>r(1); 
       //System.out.println(Arrays.compare(p,q));   


      // mismatch for the index wahicgh is mismatched
    }


    
    
}
