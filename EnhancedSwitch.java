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
        }
    }
}
