package Arrays;
import java.util.*;

public class Arrayinput {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int[] array = new int[5];

        // input array in the array 
        for (int i = 0; i < array.length; i++) {
            // the array will take the input and stores in i th position
            array[i] = in.nextInt();
        }
        // print the array 
        for (int i = 0; i < array.length; i++) {
            System.out.print( array[i] + " ");
        }
    }
    
}