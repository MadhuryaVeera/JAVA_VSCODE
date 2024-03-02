/*public class ParsingExamples {
    public static void main(String[] args) {
        String x="10";//decimal
        String y="1110";//binary
        String z="ABC";//hexadecimal

        int a= Integer.parseInt(x); // string to int conversion
        int b= Integer.parseInt(y, 2);       //string  to  binary 
        int c= Integer.parseInt(z, 16);   // string to hexadeci
        System.out.println(a);
        System.out.println(b);
        System.out.print(c);

    }
    
}*/
public class ParsingExamples{
    public static void main(String[] args) {
        int a= 12;
        int b=2748;
        String x= Integer.toString(a); // int to string conver
        String y= Integer.toString(b);
        System.out.println(x);
        System.out.println(y);
       System.out.println(x instanceof String); // to check whether the given integer can be convrted into string (or) not  if it is output is true then int can be convert into string 
    }
}
