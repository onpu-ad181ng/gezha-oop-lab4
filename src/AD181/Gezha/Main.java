package AD181.Gezha;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double operand1 = console.nextDouble();

        System.out.print("Enter the second number: ");
        double operand2 = console.nextDouble();

        MathOperation sumOperation = new SumOperation(operand1, operand2);
        MathOperation subOperation = new SubOperation(operand1, operand2);

        double sumResult = sumOperation.calc();
        double subResult = subOperation.calc();

        System.out.println("Summation result: " + sumResult);
        System.out.println("Subtraction result: " + subResult);
    }
}
