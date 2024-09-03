import java.util.*;
public class EnhancedSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String fruit = input.next();
        switch (fruit) {
        case "appele" -> System.out.print("its red");
        case "mango" -> System.out.print("its yellow");
        case "orange" -> System.out.print("its orangeee");
        case "banana" -> System.out.print("its long yellow");
        default -> System.out.println("chill bro you can ");
                        String day = input.next();
        switch (day) {
            case 1,2,3,4,5 ->System.out.println("week day");
                break;
            case 6 , 7-> System.out.println("weekend");
                break;
        
            default:
                System.out.println("May be your not belongs to eart11111");
                break;
        }
        }
    }
}
