package intermediate;

import java.util.Arrays;

public class VarArgumnet {
    public static void main(String[] args) {
        vararg(23,45,666,665,54343,23);
    }
    static void multiple(int a , int b , String ...s){
        // System.out.println(Arrays.toString(a , b , s));
    }
    static void vararg(int ...v){
        System.out.println(Arrays.toString(v));
    }
}
