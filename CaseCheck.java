import java.util.*;
public class CaseCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char name = input.next().trim().charAt(0);

        // .trim will trim the extra spaces in between 
        // .chatAt will remove only show the index elemet
        // we are using data type char because the data type returning char

        // System.out.println(input.next().trim().charAt(3));
   

        if(name >= 'a' && name <= 'z'){
            System.out.println("it's in small latter");
        }
        else{
            System.out.println("it's in capital letter");
        }
    }
}
