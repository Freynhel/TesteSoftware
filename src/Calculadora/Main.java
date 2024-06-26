package Calculadora;

import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        int operation = -1;
        double firstValue;
        double secondValue;
        double result = 0;
        int validationFlag = 0;

        String operationFeedback = "";
        String menu =
            "Please, select one operation: \n" +
            "1 - Calculadora.Sum \n" +
            "2 - Calculadora.Subtraction \n" +
            "3 - Calculadora.Multiplication \n" +
            "4 - Calculadora.Division \n" +
            "5 - All Operations \n" +
            "0 - Exit \n" +
            "Operation: ";

        System.out.println("Welcome to the calculator!");

        while (operation != 0) {
            System.out.println(menu);
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
            firstValue = scanner.nextDouble();

            System.out.println("Enter the second value: ");
            secondValue = scanner.nextDouble();

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
                    Sum sumAll = new Sum(firstValue, secondValue);
                    Subtraction subAll = new Subtraction(firstValue, secondValue);
                    Multiplication multAll = new Multiplication(firstValue, secondValue);
                    Division divAll = new Division(firstValue, secondValue);

                    System.out.println("The sum is: " + sumAll.calc());
                    System.out.println("The subtraction is: " + subAll.calc());
                    System.out.println("The multiplication is: " + multAll.calc());
                    System.out.println("The division is: " + divAll.calc());
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