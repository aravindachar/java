package intermediate;
/**
 * Shadowing
 */
public class Shadowing {
    static int x = 90 ;// to use the 'x'variable in the object 
    // independent think we use static key work 
    // sttic is object independent
    static int z = 50; 
     public static void main(String[] args) {
       System.out.println(x);
       
       int x = 34 ; 
        int z ; //the scope of showing begins only after INTIALIZING , here we only declared "Z"
        // System.out.println(z); give error 
        z = 55; // Z is DECLARED now you showding occurs
        System.out.println(z);
       System.out.println(x);
        fun();
     }
     static void fun(){
        System.out.println(x); // since the 'x=34'only available it takes the outer think static x 
     }
}
// Showding in java is practice of using same name in two variable 
//  the lower variable showdes the uppper static variable which is static 