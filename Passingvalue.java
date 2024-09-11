package intermediate;
public class Passingvalue{
    public static void main(String[] args) 
    {
        String name = "rocky";
        greet(name);

    }
    // here the naam is reference variavle which does not hold real variable 
    // it holds points the rocky object which is real object of name class
    
    static void greet(String naam){
        String name = "aravindachar";
        System.out.println(naam);
    }
}