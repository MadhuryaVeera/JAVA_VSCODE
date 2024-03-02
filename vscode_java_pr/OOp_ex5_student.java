
class Student{
    int id;
    String name;
    String branch ;
    String college;
    double cgpa;
    void setValues(int i,String n,String b,String c,double d){ //paranmeters
        id = i;
        name = n;               // assign the variable                                    // and by assigning the variables we should follow the order of the above mentioned parameters and 
        branch = b;                                                                        //  do not see the print statement and can't assign the value it can leads to the error.
        college = c;
        cgpa = d;
    }
    void printValues(){
        System.out.println("my id is"+id+"my name is"+name);
    }
}
public class OOp_ex5_student {
    public static void main(String[] args) {     //note : here the order of the parmeters should m=be givent to order of arguments 
        Student s1 = new Student();
        s1.setValues(1, "sm", "cse", "acet", 2.0);   //arguments 
        s1.printValues();
    }
}
