public class MethodInCharacter {
    public static void main(String[] args) {
        // char ch ='a';
        // System.out.println(ch);
        // char ch1='k';
        // System.out.println(ch1);
        // int ch2 ='z';
        // System.out.println(ch2);
        // char ch3=65;
        // System.out.println(ch3);
        // System.out.println((int)'B');
        
        // System.out.println(Character.isUpperCase('A'));// it can retun the bollean value
        // System.out.println(Character.isUpperCase('Z'));
        // System.out.println(Character.isLowerCase(95));
        // System.out.println(Character.isLowerCase('z'));
        // System.out.println(Character.isAlphabetic('Z'));
        // System.out.println(Character.isAlphabetic('z'));
        // System.out.println(Character.isWhitespace(' '));
        // System.out.println(Character.isDigit('0'));
        //  System.out.println(Character.isDigit("abjk"));// here no output becoz not contain any digit
        String s = "hello";
        System.out.println(Character.isDigit(s.charAt(0)));
        
        // in the c strings can be in the ctype.h header file whereas in the java the characters is present intthe java is java.lang 
        // 'a' -'z'---->  97 to 122
        // 'A' - 'Z'---> 65 to 90
        //


        // String s=""+'c';
        // String s2="c";

        // String s1= Character.toString('z');
        // System.out.println(Integer.toString('z') );
        // System.out.println(Integer.toString(65));
        // // System.out.println(Integer.toString('tk')); it's not woeking 
        // System.out.println(s1);
    }
}
