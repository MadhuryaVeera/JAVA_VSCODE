import java.util.ArrayList;
public class Array_List {
    public static void main(String[] args) {
        
    ArrayList <Integer> arr = new ArrayList<>();

    arr.add(19);
    System.out.println(arr);

    // get insex  to acces the elementss at  0th index
    System.out.println(arr.get(0));

    // to check length of the array list --> size()
    System.out.println(arr.size());

    //add(ind,element ) -> used to add a lelement
    arr.add(0,2766);
    System.out.println(arr);

    //arr it can remove the prevous elemment and then add the element at aa given index
    arr.set(3,100);
    System.out.println(arr);

    }

}
