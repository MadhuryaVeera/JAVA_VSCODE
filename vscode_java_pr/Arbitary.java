public class Arbitary {
    //Arbitary {variable sized} number of arguments to a function n/ method
    static void add(int ... kk){ // elements(or) kk ={19,78},{19,78,56}
        int sum = 0;
        for( int i =0;i < kk.length;i++){
            sum += kk[i];
        }
       System.out.println(sum);
    }
public static void main(String[] args){
    add(19,78);
    add(19,78,56);
    add(19,78,789,78);
    add(19,78,78);
    add(19,78,889,909,5857);
    
}
}