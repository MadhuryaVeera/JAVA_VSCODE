// public class default_value {
//      int y;// instance variables
//     public static void main(String[] args) {
//          int x; // local variable
//           System.out.println(y);
//     }
// }
// public class  Default_value {
//     int y;// instance variables
//     static String z;
//      static Scanner sc;
//    public static void main(String[] args) {
//         int x; // local variable
//          //System.out.println(y);

//    }
// }


import java.util.Scanner; 
import java.util.Arrays;  
class Dog {

 }  
 public class Default_value {  
       int y; // instance variable (no use of static keyword)     
       static String z;     
       static Scanner sc;     
       static Dog dog1;    
        public static void main(String[] args) {         
            int x; // local variable         
            Default_value obj = new Default_value();        
             System.out.println(obj.y);        
              System.out.println(z);         
              System.out.println(sc);        
               System.out.println(dog1);         
               boolean[] data = new boolean[5];         
               System.out.println(Arrays.toString(data));     
            } 
        }  
