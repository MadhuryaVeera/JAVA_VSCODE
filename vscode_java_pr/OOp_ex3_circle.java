// class Circle{
//     double radius; // instance variable
//     static final double PI =3.14;
    
//     void printDiameter(){
//         System.out.println(2*radius);
//         // System.out.println();
//     }
//     void printArea(){
//         System.out.println(3.14*radius*radius);
//         System.out.println(PI*radius);
//     }
//     void printPerimeter(){
//         System.out.println(2*3.14*radius);
//     }
// }
// public class OOp_ex3 {
//     public static void main(String[] args) {
//          Circle c1 = new Circle();
//      c1.radius = 2.0;
//      c1.printDiameter();
//      c1.printArea();
//      c1.printPerimeter();
// }
//     }

    


    import java.util.Scanner;

    class Circle{
        int radius;
        static final double PI=3.14;
        void getInput()
        {
            System.out.println("Enter the radius");
            Scanner sc=new Scanner(System.in);
            radius=sc.nextInt();
        }
        void printDiameter()
        {
            System.out.println("Diameter is "+2*radius);
        }
        void printArea(){
            System.out.println("Area is "+PI*radius*radius);
        }
        void printPerimeter()
        {
            System.out.println("Perimeter is "+2*PI*radius);
        }
    }
    public class OOp_ex3_circle {
        public static void main(String[] args) {
            Circle c1=new Circle();
            c1.getInput();
            c1.printArea();
            c1.printDiameter();
            c1.printPerimeter();
        }
    }
    
