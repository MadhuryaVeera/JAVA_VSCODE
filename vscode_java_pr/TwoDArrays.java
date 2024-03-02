public class TwoDArrays {
    public static void main(String[] args) {
    //     int sun=50;
    //     int sun2= 60;// differwent students 
    //     int sun3=70;
     // accessing all together
    // int [] marks= {} // accsing no 
                        // 0 index     1 index
     int [][] marks2 = {{75,60,70},{20,30,40}}; // two dimentsional aray syntax   acceso=ing we have to know what the data contain in the row,and it's coloumn
       //2X 3 ->dimentsions
        for(int i=0;i<2;i++){ //rows 
            for(int j=0;j<3;j++){ //colu
                System.out.print(marks2[i][j]+" ");
            }
            System.out.println();
        }
     //System.out.println(marks[0][1]);//row,coloumn(indexes representation)
    }                  // 0 1 2      0 1 2
}
