package intermediate;
// SCOPE : Basically means where we can acess ourthe variable 
public class Scope {
    public static void main(String[] args) {
        int a = 20 ;
        int b = 30 ;
        {
            // int a = 34; you canot intitalize the variable again 
            a = 50 ; // But you can change the value of variable 
            int c = 40 ;
            System.out.println(c);
        }
        // System.out.println(c); you can not print the number which is create 
        // inside the block whick can be modified inside the block only 

        for (int i = 0; i < 4; i++) {
            // int a = 23 ; the number can not be dofined again in loop 
            // you can create a new value and acess here only in the loops
            int l = 3232;
            System.out.println(l);
        }   
        // to acess the number we want to RE-INITIALIZE the number
        

     System.out.println();   
    }
    // Method scope 
    static void randow(){
        int a ; 
        int b ;
        // Method Scope : the change we made is availabel here only
    }
    
}
