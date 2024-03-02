public class Strings {
    public static void main(String[] args) {
     // Characters are mutable (which meanss it can be changable after even creating  the  characters)
     // Strings are Immutable() but we can gave the mutablitiy state by using the StringBuffers and StringBuilders to modify the stringss without changing into characterArray and do the modifidcations for thatt instead we can use the thesse (buffer and builders)

//      String s="Hello";  // here  the variable (s  and p) can be stored in the stack 📦
//      String p="Hello";   // wheras the "its corresponding stroring strings("Hello" "Hello") can be stroresd in the heap ⭕ and in the inside heap(black of the circle) there is a string constant pool(scp) in that pool  the  correspponding strings can stored inside in it and the compiler can check  in that stack variable s can be check inside the heap and again the stacak another varaiable t can  also check inside the heap and the finnaly allocation of memory inside the heap was same so the final result was same ( i mean true) "
//      System.out.println(s==p);

//      String ss= new String("hi");//here also the variables ss and pp can be stored in the stack 📦
//      String pp = new String("hi");// wheras it's corresponding storing strings("hi" "hi") can be stord in the heap ⭕and in the ouside the heap(middle pink clr) there is without scp .so, the coresponding strings can be stored in ouside teh scp  so the allocatioon of  the memory was differnt and so the variables was n't equla hence it can print false.
//      System.out.println(ss==pp);


     // pavan sir written code
    
            // Character Arrays -> Mutable
            // Ability to be changed even after created
            char[] arr = {'h', 'e', 'l', 'l', 'o'};
            arr[1] = 'z';
        
            int[] arr1 = {10, 20, 30};
    //        System.out.println(arr);
    //        System.out.println(arr1);
            // Strings -> Immutable
            // Can't be modified / changed once created
            String sss = "Hello"; // String Constant Pool
            String tt = "Hello"; // Stored in String Constant Pool
            String ppp = "Hello"; // Stored in String Constant Pool
            System.out.println(sss == tt);
            String x = new String("Hello"); // Stored in Heap
            String y = new String("Hello"); // Stored in Heap
            System.out.println(x == y);
       

    }
}
