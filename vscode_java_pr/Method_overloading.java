public class Method_overloading {
    static void add(int a, int b){
        System.out.println(a+b);
    }
      static void add(int a,int b,int c){
        System.out.println(a+b+c);

    }

     static void add(double a,double b){
        System.out.println(a+b);               // the println can be one which is always method overloading
    }
    final static void add(int arr[],int n){
        int sum=0;
        for(int i=0;i<n;i++){
        sum=sum+arr[i];
    }
    System.out.println(sum);
    }
    public static void main(String[] args) {
        add(10,20);
        Method_overloading dd= new Method_overloading();
        dd.add(10,20,30);
        add(23.6,45.6);
        int arr[]={10,20,30};
         int n=3;
         add(arr,n);
         // the method overloading can be possible m=by the changing it's significance like changing the parakemters and changing thr data type;
         // method overlaoading can be possible by chandging the return type of the value
    }
}
