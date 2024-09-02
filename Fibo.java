import java.util.*;
public class Fibo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the position of the Fiboo");
        int n = input.nextInt();
        // n is the position where we want to store the input
        int a = 0 ;
        int b = 1 ;  
        // a and b are the first and second nubmer of the fibonuchi
        int count = 2 ; // as we have first two numbers start form a,b 

        while (count <= n) {
            int temp = b ;
            b = b + a;
            a = temp;
            count++;
        }
        System.out.println(b);
    }
}
