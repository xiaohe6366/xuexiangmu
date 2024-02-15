package myWork;

import java.util.Scanner;

/**
 * 1.ask user to input 2. get what user put in 3. decide to move or alarm wrong.
 * 4.different case run different things. 5.method seperately 6.for
 * add/subtract, make sure the input
 * shoud be int 7.for multiplication, make sure they are double 8.for divide,
 * make sure input is double
 * and also not divide by 0 8. for alphabetize,make sure they are two words, and
 * use compare to show
 */

public class Calculator {

    private static final String SUBTRACT_OPERATION = "subtract";

    private static final String MULTIPLY_OPERATION = "multiply";

    public static void main(String[] args) {
        // 先输入指令
        Scanner scanner = new Scanner(System.in);
        System.out.println("the permitted movement is add, subract, multiply, divide, alphabetize");
        System.out.print("please end your input: ");
        String operation = scanner.nextLine().toLowerCase();

        // 看做不做用
        if (!operation.equals("add") && !operation.equals(SUBTRACT_OPERATION) && !operation.equals(MULTIPLY_OPERATION)
                && !operation.equals("divide") && !operation.equals("alphabetize")) {
            System.out.println("Invalid input entered. Terminating...");
            return;
        }

        // 看看做啥
        switch (operation) {
            case "add":
                handleAddition(scanner);
                break;
            case SUBTRACT_OPERATION:
                handleSubtraction(scanner);
                break;
            case MULTIPLY_OPERATION:
                handleMultiplication(scanner);
                break;
            case "divide":
                handleDivision(scanner);
                break;
            case "alphabetize":
                handleAlphabetization(scanner);
                break;
        }
        scanner.close();
    }

    // different method 1.让你输入俩数字 2.判断这个是不是int 3.是则 不是则

    private static void handleAddition(Scanner scanner) {
        System.out.print("put in two integers: ");
        if (scanner.hasNextInt()) {
            int a = scanner.nextInt();
            if (scanner.hasNextInt()) {
                int b = scanner.nextInt();
                System.out.println(a + b);
            } else {
                System.out.println("ss");
            }
        } else {
            System.out.println("ss");
        }
    }

    private static void handleSubtraction(Scanner scanner) {
        System.out.print("put in two integers: ");
        if (scanner.hasNextInt()) {
            int a = scanner.nextInt();
            if (scanner.hasNextInt()) {
                int b = scanner.nextInt();
                System.out.println(a - b);
            } else {
                System.out.println("ss");
            }
        } else {
            System.out.println("ss");
        }
    }

    // 7.for multiplication, make sure they are double
    private static void handleMultiplication(Scanner scanner) {
        System.out.print("put in two doubles ");
        if (scanner.hasNextDouble()) {
            double a = scanner.nextDouble();
            if (scanner.hasNextDouble()) {
                double b = scanner.nextDouble();
                System.out.printf("%.2f\n", (a * b));
            } else {
                System.out.println("ss");
            }
        } else {
            System.out.println("ss");
        }

    }

    // 8.for divide, make sure input is double and also not divide by 0
    private static void handleDivision(Scanner scanner) {
        System.out.print("put in two doubles: ");
        if (scanner.hasNextDouble()) {
            double a = scanner.nextDouble();
            if (scanner.hasNextDouble()) {
                double b = scanner.nextDouble();
                if (b != 0) {
                    System.out.printf("%.2f\n", (a / b));
                } else {
                    System.out.println("ss");
                }
            } else {
                System.out.println("ss");
            }

        } else {
            System.out.println("ss");
        }
    }

    // 8. for alphabetize,make sure they are two words, and use compare to show
    private static void handleAlphabetization(Scanner scanner) {
        System.out.print("put two wrods: ");
        String word1 = scanner.next();
        String word2 = scanner.next();

        if (word1.compareTo(word2) < 0) {
            System.out.println("1比2靠前");
        } else if (word1.compareTo(word2) == 0) {
            System.out.println("一样");
        } else {
            System.out.println("后");
        }
    }

}
