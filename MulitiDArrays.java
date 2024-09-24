package Arrays;

public class MulitiDArrays {
    public static void main(String[] args) {
        // int[][] raghu = new int[3][]; rows must be mentioned not necessory
        // to mention columns
        //imagin array in array elements 
        int[][] raghu = {
            {1,2,3},
            {4,5,5,6},
            {66,67,78}
        };
        for (int i = 0; i < raghu.length; i++) {
            for (int j = 0; j < raghu.length; j++)
            System.out.print(raghu[i][j]);
        
        }
        

    }
}
