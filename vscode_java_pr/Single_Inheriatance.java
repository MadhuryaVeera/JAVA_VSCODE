// // class Student{
// //     String name;
// //     int age;
// //     String gender;
// //     String branch;
// //      String college;
// //      void printDetails1(){
// //           System.out.println(name + " "+ age + " "+ gender );

// //      }
// //      void printDetails2(){
// //        System.out.println(branch +" "+ college);
// //      }

// // }
// // class Teacher {
// //     String name;
// //     int age;
// //     String gender;                              /// in this most of the  instance variabvles are same story so thiss is the bad way so in this the inheritance concept can be obtain
// //     String branch;
// //      String college;
// //      void printDetails1(){
// //         System.out.println(name + " "+ age + " "+ gender );

// //    }
// //    void printDetails2(){
// //     System.out.println(branch +" "+ college);
// //   }
// // }
// // public class Single_Inheriatance {
// //     public static void main(String[] args) {
        
// //     }
// // }





// class Person{
//     String name;
//     int age ;
//     String gender;
//     void printDetails1(){
//      System.out.println(name + " "+ age +" "+ gender);
//     }
// }



// class Student extends Person{
    
//     String branch;
//     String Studentid;
//     int salary;
//      String college;
    
//      void printDetails2(){
//        System.out.println(branch +" "+ college);
//      }

// }
// class Teacher extends Person{
//     String Techerid;                             /// in this most of the  instance variabvles are same story so thiss is the bad way so in this the inheritance concept can be obtain
//     String branch;
//      String college;
//    void printDetails2(){
//     System.out.println(branch +" "+ college);
//   }
// }
// public class Single_Inheriatance {
//     public static void main(String[] args) {
//         Student s1 = new Student();
//         //s1. ( -> getting all the access to the variables)
//            s1.name =" sk";
//            s1.age =78;
//            s1. printDetails1();

//            Teacher  t1 = new Teacher();
            
//     }
// }





// class Student{
//     String name;
//     int age;
//     String gender;
//     String branch;
//      String college;
//      void printDetails1(){
//           System.out.println(name + " "+ age + " "+ gender );

//      }
//      void printDetails2(){
//        System.out.println(branch +" "+ college);
//      }

// }
// class Teacher {
//     String name;
//     int age;
//     String gender;                              /// in this most of the  instance variabvles are same story so thiss is the bad way so in this the inheritance concept can be obtain
//     String branch;
//      String college;
//      void printDetails1(){
//         System.out.println(name + " "+ age + " "+ gender );

//    }
//    void printDetails2(){
//     System.out.println(branch +" "+ college);
//   }
// }
// public class Single_Inheriatance {
//     public static void main(String[] args) {
        
//     }
// }














// class Person{
//     String name;
//     int age ;
//     String gender;
//     Person(String name , int age, String gender){
//         this.name = name;
//          this.age = age;
//           this.gender = gender;
//     }
//     void printDetails1(){
//      System.out.println(name + " "+ age +" "+ gender);
//     }
// }

// class Student extends Person{
    
//     String branch;
//     String Studentid;
//     int salary;
//      String college;
    
//      void printDetails2(){
//        System.out.println(branch +" "+ college);
//      }

// }
// class Teacher extends Person{
//     String Techerid;                             
//     String branch;
//      String college;
//    void printDetails2(){
//     System.out.println(branch +" "+ college);
//   }
// }
// public class Single_Inheriatance {
//     public static void main(String[] args) {
//         Student s1 = new Student();
//         //s1. ( -> getting all the access to the variables)
//            s1.name =" sk";
//            s1.age =78;
//            s1. printDetails1();

//            Teacher  t1 = new Teacher();
            
    // }
// }



// // pavan sir example on (in iheriatance if you create an instance of a child class the drfault constructot of pararendt is also invoked)
// class Person {
//     String name;
//     int age;
//     String gender;
//     Person() {
//         System.out.println("This is Person Class");
//     }
//     void printPersonDetails() {
//         System.out.println(name + " " + age + " " + gender);
//     }
// }
// class Student extends Person {
//     String studentID;
//     String branch;
//     String college;
//     Student() {
//         System.out.println("This is Student class");
//     }
//     void printDetails2() {
//         System.out.println(studentID + " " + branch + " " + college);
//     }
// }
// class Teacher extends Person {
//     String teacherID;
//     double salary;
//     String branch;
//     Teacher() {
//         System.out.println("This is teacher class");
//     }
//     void printDetails2() {
// //         System.out.println(teacherID + " " + salary + " " + branch);
// //     }
// // }
// // public class IE1 {
// //     public static void main(String[] args) {
// //         Student s1 = new Student();
// //         Teacher t1 = new Teacher();
// //     }
// }
 






// //n using super keyword//
// // class Person {
// //     String name;
// //     int age;
// //     String gender;
// //     Person() {}
// //     Person(String name, int age, String gender) {
//         this.name = name;
//         this.age = age;
//         this.gender = gender;
//     }
//     void printPersonDetails() {
//         System.out.println(name + " " + age + " " + gender);
//     }
// }
// class Student extends Person {
//     String studentID;
//     String branch;
//     String college;
//     Student() {}
//     Student(String name, int age, String gender, String studentID, String branch, String college) {
//         super(name, age, gender);
//         this.studentID = studentID;
//         this.branch = branch;
//         this.college = college;
//     }
//     void printDetails2() {
//         System.out.println(studentID + " " + branch + " " + college);
//     }
// }
// class Teacher extends Person {
//     String teacherID;
//     double salary;
//     String branch;
//     void printDetails2() {
//         System.out.println(teacherID + " " + salary + " " + branch);
//     }
// }
// public class IE1 {
//     public static void main(String[] args) {
//        Student s1 = new Student("Alice", 17, "Female", "123", "ACET", "IT");
//        s1.printPersonDetails();
//        s1.printDetails2();
//     }
// }



// Constrcutor(to build something):
//   constructor is a special method whcih is in general used to initialse the instance varaiable
// : speccial method 
//  constructors are always triggred(method invoking) right when you are crating an instance of the class      new Cat()  new Student()

// 1.constructor name should be sa e as class name.
// 2.constructors doesnt return any types 

// 1. default / no paramaetric constructor

// 2. parametric constructors


// Constructor Overloading :
//     why do we can overloading ?







// Inheritance(to represent an hiearchy):
// The mechanism  where one class obtains the features from another class.
// extends is the keyword we use for inheritance
// 3. super claass / parent class
//  from which ever the you are obtaing fertures
// 4. sub class /child  class/ Derived   
//    rom which ever the you are obtaing fertures frome the super class

// class A extends Z{
// }
//  A --> Sub class
//  Z --> Super class

// 4 ways to do the e inheriab=ncae
// 1.Single Inheriataanace
// 2. Multi level 
// 3. Hierranchial 
// 4.Multiple
// 5.        
//  in iheriatance if you create an instance of a child class the drfault constructot of pararendt is also invoked
    
       