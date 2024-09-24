package Arrays;

public class PassinginF {
    public static void main(String[] args) {
        int[] number = {1,23,34,45,56};
        // System.out.println(Arrays.toString(number))
        change(number);
        for(int i = 0 ; i <= number.length ; i++){
          System.out.println(number[i]);  
        }

     
    }

    static void change(int[] chan){
        chan[0]=77;
    }
    
}
