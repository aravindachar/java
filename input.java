import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        System.out.println("Enter Your students Details?");
        Scanner student = new Scanner(System.in);
        int rollnumber =  student.nextInt();
        String name = student.next();
        float cgpa = student.nextFloat();

        System.out.println("Name :" + name);
        System.out.println("Roll number:" + rollnumber);
        System.out.println("cgpa :" + cgpa);
    }
}
