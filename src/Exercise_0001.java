import java.util.Scanner;

public class Exercise_0001 {
    public static void main(String[] args){
        System.out.print("Please, enter your first name and family name: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Hello");
        System.out.println(name);
    }
}
