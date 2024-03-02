import java.util.Scanner;

public class Array_are_obj {
    public static void main(String[] args) {
        int[] arr=new int[5];
        //array are objects
        //belong to object class
        //object class in java.lang.package
        Scanner sc=new Scanner(System.in);
        System.out.println(sc instanceof Scanner);
        System.out.println(sc instanceof Object);
        System.out.println(arr instanceof Object);
    }
    
}