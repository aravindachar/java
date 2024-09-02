import java.util.*;
public class Temprature {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the Temparature in celcius");
        float TemC = in.nextFloat() ;
        float TemF =  (TemC * 9/5)+ 32 ;
        System.out.println(TemF);
    }
}
