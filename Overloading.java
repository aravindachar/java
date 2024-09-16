package intermediate;

import java.util.Arrays;

public class Overloading {
    public static void main(String[] args) {
        name(34);
        name("aravindachar");

        demo(23,45,65,44,43);
        demo("kunal","aravind","goa");
        // demo() if we call without specifing the parameter it will give 
        // AMBIGUENT ERROS as the overloading function user not specfing the parameter
    }
    // Function overloading means two function having same name but differnt parametes can coexsit
    // based on the parameter the function is called
    static void name(int x){
        System.out.println(x);
    } 
    static void name(String naam){
        System.out.println(naam);
    }
    static void demo(String ...v){
        System.out.println(Arrays.toString(v));
    }
    static void demo(int ...v){
        System.out.println(Arrays.toString(v));
    }
}
