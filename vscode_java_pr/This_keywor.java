
class This_keyword{
    String name;
    int age;
    int salary;
    This_keyword(String name){
        this.name = name;
        System.out.println(name);
    }
    This_keyword(String name,int salary){
        // this.name = name;
        // this.salary = salary;
        // System.out.println(name+" "+salary);                  // this keyword is used to 
    }
    This_keyword(String name, int salary,int age){
        // this.name=  name;
        // this.salary= salary;
        // this.age = age;
        // System.out.println(name + " "+salary+ " "+age);

        // this(name, salary);
        // this.age = age;
        // System.out.println(name + " "+ salary +" "+ age);
    }
}
public class This_keywor {
    public static void main(String[] args) {
        This_keyword t1 = new This_keyword("sm");
        This_keyword t2 = new This_keyword("smm"+" "+498);
        This_keyword t3 = new This_keyword("sm3"+" "+90589+12);
    }
}




























// calling one comstrucotor to anotther constructor is called constructo chain