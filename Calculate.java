
package homework3;

import java.util.Scanner;

public class Calculate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter num1: ");
        long num1 = scanner.nextLong();

        System.out.println("Choose the next action: +, -, *, /");
        String symbol = scanner.next();

        System.out.println("Enter num2: ");
        long num2 = scanner.nextLong();

        System.out.println("Confirm action. Select equals");
        String equals = scanner.next("=");

        long result;

        switch (symbol) {
            case "+" : result = num1 + num2;
                System.out.println(result);
                break;
            case "-" : result = num1 - num2;
                System.out.println(result);
                break;
            case "*" : result = num1 * num2;
                System.out.println(result);
                break;
            case "/" : result = num1 / num2;
                System.out.println(result);
        }

    }
}
