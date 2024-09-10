package intermediate;
import java.util.*;
public class PassingA {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name = in.next();
        String persongreet = mygreet(name);
        System.out.println(persongreet);
    }
    static String mygreet(String name){
        String naam = "hello  " + name ;
        return naam ;
    }
}
