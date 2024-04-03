//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int operation = -1;
        float firstValue;
        float secondValue;
        float result;
        int validationFlag = 0;

        String operationFeedback = "";
        String menu =
            "Please, select one operation: \n" +
            "1 - Sum \n" +
            "2 - Subtraction \n" +
            "3 - Multiplication \n" +
            "4 - Division \n" +
            "5 - All Operations \n" +
            "0 - Exit \n" +
            "Operation: ";

        System.out.println("Welcome to the calculator!");

        while (operation != 0) {
            System.out.println(menu);

            Scanner scanner = new Scanner(System.in);
            operation = scanner.nextInt();

            if (operation < 0 && operation > 5) {
                System.out.println("Invalid operation!");
                continue;
            }

            if (operation == 0) {
                System.out.println("Bye!");
                return;
            }

            System.out.println("Enter the first value: ");
            firstValue = scanner.nextInt();

            System.out.println("Enter the second value: ");
            secondValue = scanner.nextInt();

            switch (operation) {
                case 1:
                    Sum sum = new Sum(firstValue, secondValue);
                    operationFeedback = "The sum is: ";
                    result = sum.calc();
                    break;
                case 2:
                    Subtraction sub = new Subtraction(firstValue, secondValue);
                    operationFeedback = "The subtraction is: ";
                    result = sub.calc();
                    break;
                case 3:
                    Multiplication mult = new Multiplication(firstValue, secondValue);
                    operationFeedback = "The multiplication is: ";
                    result = mult.calc();
                case 4:
                    Division div = new Division(firstValue, secondValue);
                    if (div.validate()) {
                        System.out.println("Can't divide by zero!");
                        validationFlag = 1;
                        break;
                    }
                    operationFeedback = "The division is: ";
                    result = div.calc();
                    break;
                case 5:
                    sum = new Sum(firstValue, secondValue);
                    sub = new Subtraction(firstValue, secondValue);
                    mult = new Multiplication(firstValue, secondValue);
                    div = new Division(firstValue, secondValue);

                    System.out.println("The sum is: " + sum.calc());
                    System.out.println("The subtraction is: " + sub.calc());
                    System.out.println("The multiplication is: " + mult.calc());
                    System.out.println("The division is: " + div.calc());
                    break;

                default:
                    System.out.println("Invalid operation!"); break;
            }

            if (operation != 5 && validationFlag == 0) {
                System.out.println(operationFeedback + result);
            }

            System.out.println("--------------------------------------------- \n");

        }

    }
}