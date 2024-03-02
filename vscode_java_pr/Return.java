public class Return {
    static void add(int a,int b){
        System.out.println(a+b);
    }
    static int add(int a, int b,int c){
        return a+b+c;
    }
    public static void main(String[] args) {
       add(10,20);
       System.out.println( add(19,29,39));
    }
}
