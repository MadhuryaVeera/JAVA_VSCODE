class Rectangle{
    double length,width;
        void printArea(){
            System.out.println("Area is "+ length+width);
        }
        void printPerimeter(){
            System.out.println("Perimeter is "+ length*width);
        }
}

public class OOp_ex2_rectangle {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.width = 1.2;
        r1.length = 2.3;
        r1.printArea();
        r1.printPerimeter();
        // r1.printArea(r1.length,r1.length)

        Rectangle r2 = new Rectangle();
        r2.width =3.4;
        r2.length =6.8;
        r2.printArea();

    }
}
