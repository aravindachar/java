package intermediate;
import java.util.*;
public class Methods {
//  its static because its not returning anything!

    public static void sum(){
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = a + b  ;
        System.out.println(c);
    }

    //  return function 
    static int sum2(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first value : ");
        int value1 = input.nextInt();
        System.out.println("Enter the second value: ");
        int value2 = input.nextInt();
        int summ = value1 + value2 ;
        return summ ;

    }
    public static void main(String[] args) {
        sum();
        System.out.println("the sum of two value :" + sum2());
    }
}
