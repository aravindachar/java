package Basics;
public class String {
    public static void main(String[] args){

        // string is a non primitive datatype and it's calls which create a object everytime we create a new string
        // Operation overloading
        System.out.println('a'+'b');
        // 195 
        System.out.println("a"+1);
        // a1
        System.out.println('a'+"a");
        // unicodea
        
        //  create strings with name a and b having same value but different objects
        String a = new String("aravinda");
        String b = new String("aravinda");
        System.out.println(a==b);

        // String Methods 
        .toString()
        .toLowerCase()
        .toUpperCase()
        .toCharArray()
        .length()
        .indexof()
        
    }
}
