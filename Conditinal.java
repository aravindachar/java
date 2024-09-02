import java.util.*;
public class Conditinal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the salary of your month");
        int salary = input.nextInt();
        if(salary > 25000){
            salary = salary + 2000;
            System.out.println(salary);
        }
        else if(salary >=2500 && salary >=3500){
            salary = salary + 4000;
            System.out.println(salary);
        }
        else{
            System.out.println("loser");
        }

    }
}
