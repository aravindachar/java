import java.util.*;
public class Switch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String fruit = input.next();
        switch (fruit) {
            case "apple":
                System.out.println("its a red fruit!");
                break;
            case "mango":
            System.out.println("its a Yello fruit");
                break;
            case "banana":
            System.out.println("its a long shitt");
            break;
            default:
            System.out.println("enter the currect fruit ");
                break;
        }
    }   
}
