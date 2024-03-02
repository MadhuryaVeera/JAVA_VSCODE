/**
 * Wrapper_class
 */
class Cats
{
    String name;
    int age;
     Cats(String name, int age){
        this.name = name;
        this.age = age;
     }
    public String toString(){
        return "tjis is "+" {"+ name +"}";
    }
}
public class Wrapper_class {
    static void printArray(Integer[] A){
        for(Integer val: A){
            System.out.println(val + " ");
        }
    }
    static void printArray(Character[] C){
        for(Character val : C){
            System.out.println(val+ " ");
        }
    }

    public static void main(String[] args) {
        Integer[] arr = {1,2,3,4,5};
         printArray(arr);
        
         Character[] array1 = {'a','b','c'};
         printArray(array1);

         Cats cat =new Cats("cutie",46);
         System.out.println(cat);
        
         Cats cat1 = new Cats("um", 89);
         System.out.println(cat1);

    }
}
