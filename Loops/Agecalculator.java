import java.util.Scanner;
public class Agecalculator {
    public static void main(String[] args) {
        // Example usage:
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age to check");
        int age = sc.nextInt();
        if (age < 13) {
            System.out.println("Person is a Kid.");
        } else if (age >= 13 && age <= 19) {
            System.out.println("Person is a Teen.");
        } else {
            System.out.println("Person is an Adult.");
        }
    }
}
