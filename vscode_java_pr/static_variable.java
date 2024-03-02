
    class Student{
        int age=90;// instance of variable
        String rollNumb;//instance of variable
        String name;//instance of variable
        static String collegeName="ACET"; //collegename is same to every student so we state it as static
    }

public class static_variable {
        public static void main(String args[]){
        Student s=new Student();//creating an instance of variable(or we can call it as obj cretion)
        //System.out.print(s);
        
        
        System.out.println(s.collegeName);// non -static way becoz can be called by obj

        System.out.println(Student.collegeName);// static way becoz  we can call the instance(collname) with a classname(student)

        System.out.println(s.age);// here the obj(s) can have both the access of the staic variable and also instanc variable.

       //NOte: System.out.print(Student.age);//we cannot execute becoz  the classname can be acces by the static variable only
       
       // static --> classname(Student) tho --> static chesina variable(collegename) tho pilavali //
       // instance --> obj(s) tho--> instance variable chesina(like--> age,roll,name) vatithone pivalli  and also static variable (coll) tho kuda access cheyoochu.

    }
    
}

/*import java.util.Scanner;
public class first_program{
    static void sayHello(){
        System.out.print("sm");
    }
    
    
    
    public static void main(String args[]){
        sayHello();  //here we can call it by either by method 
        first_program.sayHello();// or  we can call method with the classsname 
    }
}/* */
