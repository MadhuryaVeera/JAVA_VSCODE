

public class Arrays_varying_lengths {
  public static void main(String[] args) {
    // int[][]   arr= {{1,2},{3,4,5},{6,7,8,9}};
    // for(int i=0;i<arr.length;i++){
    //     for(int j=0;j<arr[i].length;j++){
    //         System.out.println(arr[i][j]+" ");
    //     }
    //     System.out.println();
    int[][] newArr={{10,20},{30,40,50},{60,70,80,90}};
    for(int i=0;i<newArr.length;i++)    // Arrays -->length
    {
        for(int j=0;j<newArr[i].length;j++)
        {
            System.out.print(newArr[i][j]+" ");
        }
        System.out.println();
    }
    } 
  }    

