import java.util.Scanner;

public class Exercise_0002 {
    public static void main(String[] args) {
        int num1, num2;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please, input first number: ");
        num1 = scanner.nextInt();
        System.out.print("Please, input second number: ");
        num2 = scanner.nextInt();

        System.out.println("Sum is: " + (num1 + num2));

        scanner.close();
    }
}
