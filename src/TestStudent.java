import java.util.Scanner;

public class TestStudent {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter first name:");
        String firstName = input.nextLine();

        System.out.println("Enter middle name:");
        String middleName = input.nextLine();

        System.out.println("Enter last name:");
        String lastName = input.nextLine();

        Student student = new Student();
        student.setNames(firstName, middleName, lastName);

        System.out.println(student.getFullName());

    }
}
