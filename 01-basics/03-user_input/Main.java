import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {

        System.out.print("Your good name is: ");
        String name = scanner.nextLine();

        System.out.print("Your age is: ");
        int age = scanner.nextInt();

        System.out.print("And your gpa is: ");
        double gpa = scanner.nextDouble();

        System.out.print("Are you a student? (true/false): ");
        boolean isStudent = scanner.nextBoolean();

        System.out.println("Hello " + name);
        System.out.println("You are " + age + " years old");
        System.out.println("Your gpa is: " + gpa);

        if(isStudent){
            System.out.println("You're enrolled as a student");
        } 
        else{
            System.out.println("You're NOT enrolled as a student");
        }

        }    
    }
}