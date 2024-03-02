import java.util.Scanner;
public class UserDefinedMethods{
    static void sayHello(){
        System.out.println("sm");
    }
    static boolean isFac(int a,int b){
        return a%b==0;   // here it can return the if the condition is satisfy true(otherwise) false  
        //if(a%b==0) return true;
        //else return false;
    }
    
    
    public static void main(String args[]){
        sayHello();  // wee can call direct method (or)  by using the classname with methjod name 
       UserDefinedMethods.sayHello(); 

        
         System.out.println( isFac(10,2));
        System.out.println( UserDefinedMethods.isFac(10, 2));
    }
}