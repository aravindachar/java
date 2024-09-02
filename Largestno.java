import java.util.*;

public class Largestno {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Q1 to fint the largest number 
        int a = 10 ;
        int b = 223 ;
        int c = 53 ;
        
        int max = a ;
        if(b>max){
            max = b ;
        }
        if(c>max){
            max =c ;
        }
        System.out.println(max);

        // use math.max()
        int maxx = Math.max(c ,Math.max(a,b)) ;
        System.out.println(maxx);
    }
}
