// class Student1{
//      String name;
//       String branch;
//       int age;
//       //constructor with parameters 
//       Student1(String n,String b,int a){
//         name = n;
//         branch = b;
//         age = a;
        
//       }
//        void printing(){
//          System.out.println("my name is "+name+"my branch us"+branch+"my age"+age);
//        }
//       Student1(){
//           System.out.println("hey i got invoked...");
//       }
     
    
// }
// public class Construc {
//     public static void main(String[] args) {
//         // Scaneer sc = new Scanner(System.in); in thus 
        
//          Student1 s1 = new Student1("ms","cse",12);
//           s1.printing();

//         //  Student1 s2 =new Student1();
        
        
//     }
// }



// class Student1{
//     String name;
//     int age;   

//   Student1(String s, int a){
//       name =s;
//       age = a;
  
//  // the defalut constrcor can be 
// }
// }
// class Construc {
// public static void main(String[] args) {
//     Student1 s2 = new Student1("sm",12);
//     System.out.println(s2.name);
//   }
// }





// // class Student1{
//     String name;
//      String branch;
//      int age;
//      //constructor with parameters 
//      Student1(String n,String b,int a){
//        name = n;
//        branch = b;
//        age = a;
       
//      }
//      void printing(){
//        System.out.println("my name is "+name+"my branch us"+branch+"my age"+age);
//      }
//      Student1(){
//         System.out.println("hey i got invoked..");
//      }
  
// }
// public class Construc {
//    public static void main(String[] args) {
//        // Scaneer sc = new Scanner(System.in); in thus 
       
//        Student1 s1 = new Student1("ms","cse",12);
       
//        s1.printing();
//        Student1 s2 =new Student1();
//        Student1 s3= new Student1();
       
//    }
// }




// class Student1{
//     String name;
//      String branch; /// for the popup code
//      int age;
//      //constructor with parameters 
//      Student1(String n,String b,int a){
//        name = n;
//        branch = b;
//        age = a;
//      }
//      void printing(){
//        System.out.println("my name is "+name+"my branch us"+branch+"my age"+age);
//      }
//      Student1(){
//         System.out.println("hey i got invoked..");
//      }
  
// }
// public class Construc {
//    public static void main(String[] args) {
//        // Scaneer sc = new Scanner(System.in); in thus 
       
//        Student1 s1 = new Student1("ms","cse",12);
       
//        s1.printing();
//        Student1 s2 =new Student1();
//        Student1 s3= new Student1();
       
//    }
// }





// class Student1{
    
//      Student1(){
//          System.out.println("hey you");
//      }
     
//     // the defalut constrcor can be 
// }
// public class Construc {
//    public static void main(String[] args) {
//        Student1 s2 = new Student1();
       
//    }
// }



    




// import javax.swing.JOptionPane;
// class PopUp{
//     PopUp(){
//         JOptionPane.showMessageDialog(null, "Constructor Triggered", "Hello", JOptionPane.INFORMATION_MESSAGE);
//     }
// }
// // class Student1{
    
// //      Student1(){
// //          System.out.println("hey you");
// //      }
// // }
// public class Construc {
//    public static void main(String[] args) {
//     //    Student1 s2 = new Student1();
//        new PopUp();
       
//    }
//  }




// class Cat
// {
//     String name;
//     int age;
//     Cat(String n,int a)
//     {
//         name=n;
//         age=a;
//     }
//     public String toString()
//     {
//         return "["+ name + "," + age + "]"; 
//     }
// }
// public class Testing{
//     public static void main(String[] args) {
//         Cat c1=new Cat("alice", 4);
//         System.out.println(c1);
        
//     }
// }

// 18-2-24*Online class codes on constructors
// class Student {
//     String name;
//     int age;
//     String college;  
//     String branch;
//     double cgpa;
//     void setValues(String n,int a ,String c,String b,double cg){
//         name = n;
//         age =a;
//         college = c;

//     }
// }
// public class main{
//     public static void main(String[] args) {
// //         Studnet s1 = new Student();
//         s1.name= "Alice";
//         s1.age =60;
//         s1.college="aec";// bad way 
//   //       becoz we nedd given only one student  and for  other studnet we can again give the another again name ,age
//     //      so wwe came with the ssetters





// An explicit method call 
// Student s1 =new Student();
// s1.setVslues("Alice",17,"Aec");
// Student s2= new Student ();
// s2.setValues("sm",67,"acoe");
           
 // in order to overcome thesee explict or better way to write fofr ,n, number of students to write the constructors
    // }
// }




// consturcot method
// class Student {
//      // defalut constructor 
//      Student(){
//        sout("hello i got invoked");
//      }                                      // hello i got inviked --> willl be 3 times
// }
// public class Construc{
//     public static void main(String[] args) {
//         Studnet s1 = new Student();
//         Studnet s1 = new Student();
//     Studnet s1 = new Student();
//     }
// }



// error can be thrown becoz of the donot bulding the objects 
// class Student {
//     String name;
//     int age;
//     String college;  
//     String branch;
//     double cgpa;
//     Student (String name,
//     int age,
//     String college,  
//     String branch,
//     double cgpa){
//              name = name;
//              age = age;
//              college = college;
//              branch = branch;
//               cgpa = cgpa;            
// }
// public class Construc{
//     public static void main(String[] args) {
//         Student s1 = new Student(buliding an object ( constructor));// the error can be given becoz of doesnt passing in the  variables in the new Student ()
//     
//         Student s2 = new Student();
//         Student s3 = new Student();
//     }
// }




/**
 * Construc  overloading  // having the privilegee to give the valuees whatever we like 
 */
// class Employee//(constructor name)//
// {
//     String name;
//     int age;
//     int empID;
//     Employee( String name,
//     int age,
//     int empID){
//         name  = name;
//         age = age;
//          empID = empID;
//     }
// }
// public class Construc {
//    public static void main(String[] args) {
    
//     Employee e1 = new Employee("sknjf",78);
//    }
    
// }





// this  --> use   (mostly used one distingusshin  instance and local , constriuctor chain)
// class Cat{
//     String name;// instance variable
//     int age;
//     String breed;
//     Cat(){

//     }
//     Cat(String n, int a, String b){ // locakl variable
//         name = n;
//         age = a;
//         breed =b;
//     }
//     void printThis(){
//         System.out.println(this); // it can refered to current object (or instance of  a Cat)
//     }

// public class Construc{
//     public static void main(String[] args) {
//         Cat c1 = new Cat("ALice",34,"russion"); // c1 current object 
//         System.out.println(c1.name);

//         // System.out.println(c1);// adress of  the c1 belongs cat class
//         // c1.printThis();;//  both give the above and this one give same output 

//     }
// }

// // super -> use 
// // final -> use


