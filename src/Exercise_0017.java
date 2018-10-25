import java.util.ArrayList;
import java.util.Scanner;

public class Exercise_0017 {
    public static void main(String[] args) {
        int b_1,b_2;
        ArrayList<Integer> sum_b = new ArrayList<Integer>();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input first binary number: ");
        b_1 = scanner.nextInt();
        System.out.print("Input second binary number: ");
        b_2 = scanner.nextInt();

        sum_b.add((b_1%10 + b_2%10)%2);



    }
}
