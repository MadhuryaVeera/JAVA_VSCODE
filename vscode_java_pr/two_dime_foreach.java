import java.util.Arrays;
public class two_dime_foreach {
    
    public static void main(String[] args) {
        String[][] characters = {{"harry","hermone","ron"},
                                            {"walter","jesse","saul"},
                                        {"professor","berlin","takyo"}};
         for(String[] eachSeries:characters){
            for(String eachCharacter:eachSeries){
                System.out.print(eachCharacter);// in this multidimensional array String that deeptoString we have to use.
            }
            
         }
         System.out.println(Arrays.deepToString(characters)); //(sortingarrays.java) two dimenssional aray we use the deeptoString to print th eoutput as the list with elements without using the loop if we use loop then go to sorting arrays
    }
}
