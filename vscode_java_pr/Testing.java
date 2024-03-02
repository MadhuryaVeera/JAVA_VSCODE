// public class Testing {   */ Multiplying strings in leetdcode*/ not solved
    
//         public String multiply(String num1, String num2) {
//             int n1 = Integer.parseInt(num1);
//             int n2 = Integer.parseInt(num2);                   under testiong
//             int k = n1*n2;
//             String str = Integer.toString(k);
//         }
//         return (str);
    
    
// }

// import java.util.Scanner;
// public class Ex{
//   public static void main(String args[]){
//       Scanner sc=new Scanner(System.in);
//       String n= sc.next();                                 under testig codemiind vowel consonant sequence
//       for(int i=0;i<n.length();i++){
//       if(n.charAt(i)=='a'||n.charAt(i)=='e'||n.charAt(i)=='i'||n.charAt(i)=='o'||n.charAt(i)=='u'){
//           System.out.print('C');
//       }
//       else{
//           System.out.print('V');
//       }
//    }
// }
// }



// import java.util.Scanner;

// public class Testing{                           */ vowels count and conso count in a striing*/
//     public static void main(String[] args) {
//         // writing the code for vowel and conso count in a string//
//         // taking string
//         Scanner sc= new Scanner((System.in));
//         String s = sc.nextLine();
//         //taking vcount to see the vowel count
//        int vcount=0,Ccount=0;
//         for(int i=0;i<s.length();i++){
//             if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
//                 vcount++;
//             }
              //else{System.ot.println(Ccount++);}
//         }
//         System.out.println(vcount);
//         // System.out.println(Ccount);
//     }
// }











// import java.util.Scanner;
// public class Testing{                       */ vowels count in javacodemind*/
//   public static void main(String args[]){
//       Scanner sc=new Scanner(System.in);
//       // reading the string with the spaces we use the nextLine
//       String s = sc.nextLine();
//       //reading the count for the vowels
//       int vcount=0;
//       for(int i=0;i<s.length();i++){
//           //string name . charAt can we use to give the indexed values from 0 to legth-1
//           //it throws an error if the range can exede the length()-1 (IndexOutOfBoundsException) or not less than the length of the string
//
//           if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)='o'||s.charAt(i)='u'){
//               vcount++;
//           }
//       }
//       System.out.println(vcount);
      
//    }
// }
//input:aec acet acoe  //output:7




// import java.util.Scanner;
// public class Testing{                     */counting the each word(codemind)*/
//   public static void main(String args[]){
//       Scanner sc=new Scanner(System.in);
//       String s = sc.nextLine();// reading the string with the spaces 
//     
//       // here we can use the string_name.split("\\s") -> it means it will split the string art the each whitespaacee character
//       // and resulting the output as the array of substrigs 
//       // ex:Pavan sir is a excellent teacher
//       // the .split("\\s") can converrt into the ->["Pavan","sir","is","a","excellent","teacher"]
//       // and the length is used to find the array of subsrings length right above the ex it can give 6
      
//       int counting_words = s.split("\\s").length;
//       System.out.println(counting_words);
//    }
// }
//input: technical hub       // output:2




// import java.util.Scanner;
// public class Testing{                          //copying the string into the another string*/  by using three diff methods
//   public static void main(String args[]){           //:ex1: directly given string can be stored in the another string variable with a new variable name and printing that output 
//       Scanner sc=new Scanner(System.in);
//       String n= sc.nextLine();
//       String nn= n;
//       System.out.println(nn);
        
//        //reading the string input with the spaces
//          String str= sc.nextLine();
//           String strCopy = String.copyValueOf(str.toCharArray());  // using the copyValueOf
//            System.out.println(strCopy);

//          //reading the string input with the spaces
//          String str = sc.nextLine();
//          String str1 = String.valueOf(str);                        // using the ValueOf
//          System.out.println(str1);
//    }
// }


// import java.util.Scanner; 
// public class Testing {                            // hackerrank string tokenss//
//     public static void main(String[] args) {
//         String input = "hai mai i know your good name plz,its's very urgent";
        
//         // Split the input string based on whitespace
//         String[] words = input.split("\\s+");
        
//         // Print each word on a new line
//         for (String word : words) {
//             System.out.println(word);
//         }
//     }
// }
 // input: hai mai i know ypu good name plz it;s very urgent
 //output:                   
// hai
// mai
// i
// know
// your
// good
// name
// plz,its's
// very
// urgent      




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





// import java.util.*;
// // public class LowerCase{                                                  // toLowerCase in java in codemind
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);  
//         String  s  = sc.nextLine();  // reading input String 
//         System.out.println(s.toLowerCase());  // toLowerCase is used in java with a camel case to change upper to lower case letters.
//     }
// }





// import java.util.*;
//  public class Testing{                                                  //  String concatenate in lexicographically in codemind
//     public static void main(String args[]){
//         // String s = "sudhir";
//         // String ss = "reddy";
//         // String sss = s.concat(ss);   // First_String . concat (Second_String)    -> for concantenation of two strings
//         // System.out.println(sss);
//         //  char charArray[] = sss.toCharArray();    // changing the string array to charactera array for sorting of the concatenated string
//         //  Arrays.sort(charArray);                  
//         //  System.out.println(charArray);
//     }         
//  }



//  String str = "Hello, World!";
//  char[] charArray1 = str.toCharArray();           //h e l  l o  , w o r l d !(kinda kiinda vastunid output anedi manaki )
//  System.out.println(charArray1);
//  for (char c : charArray1) {
//      System.out.println(c);
//  }



// import java.util.*;
// public class Testing{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int count = 0;
//         String  s = sc.nextLine();
//         char[] ch = s.toCharArray();                              // not woriking some hidden test casws are  Camel case word count in codemind
//         for(char chh:ch){
//             if(Character.isUpperCase(chh)){
//                 count=count+1;
//             }
//         }
//         System.out.println(count);
//     }
// }


// import java.util.*;
// public class Testing{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int count = 1;
//         String  s = sc.next();
//         char[] ch = s.toCharArray();                              // woriking some hidden test casws are  Camel case word count in codemind
//         for(int i =1;i<ch.length;i++){
//             if(Character.isUpperCase(ch[i])){
//                 count++;
//             }
//         }
//         System.out.println(count);
//     }
// }



// import java.util.*;
// public class Testing{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         String  s  = sc.nextLine();                       // codemind -->(input)
//          char[]  ch = s.toCharArray();                    // cddeimno---->(output)
//         Arrays.sort(ch);
//         System.out.println(ch);
//     }
// }



// import java.util.*;                                                     //Max of string in the codemind(passed )
// public class Testing{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);                                                           // input :technical hub
//         String  s  = sc.nextLine();    // reading the string
//         char[]  ch = s.toCharArray();  // changing the string  into chararray                           //output: u
//         Arrays.sort(ch);               //sorting the chararry 
//         //System.out.println(ch);      // just checking  the output gettig sorted order or not
//         System.out.println(ch[ch.length-1]); // printing the last element of charrray
        
//     }
// }



// import java.util.*;
// public class Testing{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);                          // find the factors// 10 // 1 2 5 10
//         int n = sc.nextInt();      // 10 
//         for(int i =1;i<=n;i++){    
//              if(n%i==0){           //10%1 == 0; 10 %2 ==0  10%3==1  10%4 ==2  10%5==0
//                  System.out.print(i+" ");  // 1 ; 2; 5; 10;
//              }
//         }
        
//     }
// }




// import java.util.*;
// public class Testing{
//     public static void main(String args[]){                        // find digits count in the ccodemind //
//      Scanner sc = new Scanner(System.in);
//      int n = sc.nextInt();                                      // converting int to string and  then finding the length 
//      String s1=String.valueOf(n);                             // 123 which is the input then
//      System.out.println(s1.length());                          // output is :3 which is  the length of the integer value.
//     }
// }

// import java.util.*;
// public class Testing{                                       // finding the length using the while loop
//     public static void main(String[] args) {               // 123 which is the input then
//         Scanner sc = new Scanner(System.in);                                                         
//         int n = sc.nextInt();                              // output is :3 which is  the length of the integer value.
//     
//         int c=0;
//         while (n!=0){
//             n=n/10;
//             c++;
//         }
//         System.out.println(c);
//     }
// }




// import java.util.*;
// public class Testing{
//     public static void main(String args[]){                                 ///String contain digit or not in codemind succeess */
//         Scanner sc= new Scanner(System.in);                                //  finding if there is a digit then printing the contain and  that count digit and then digit if  (there is no digit present then we can print hte Doesn't contain the digit)
//         String s = sc.nextLine();                                            
//         char[] ch = s.toCharArray();  // to convert string to characterarray (because we can check the present string) 
//         int count =0;           // to check the present digits in a chararray 
//         for(int i =0;i<ch.length;i++){            
//             if(Character.isDigit(ch[i])){   // checking each digit by the Character.isDigit() method and  i here means an index in which and ch[i] which means we are checking the each value of an that particular indeex  in the character Aray 
//                 count++;                    // if the digit is present then the we incresing count 
//             }
//         }
//         if(count==0){
//             System.out.println("Doesn't contain digit");        // if  the count is 0 which means no digit is present then printing the following sout statement
//         }
//         else{
//             System.out.println("Contains "+count+" digit"); 
//         }
        
//     }
// }

