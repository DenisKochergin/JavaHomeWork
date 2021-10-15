package hw2;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите значение 1:");
        int operand1 = scan.nextInt();

        System.out.println("Введите значение 2:");
        int operand2 = scan.nextInt();

        System.out.println("Введите знак операции (+, -, *, /): ");
        char operator = scan.next().charAt(0);

        switch (operator) {
            case '+':
                System.out.println(operand1+" "+operator+" "+operand2+"= "+(operand1 + operand2));// output = operand1 + operand2;
                break;
            case '-':
                System.out.println(operand1+" "+operator+" "+operand2+"= "+(operand1 - operand2));//output = operand1 - operand2;
                break;
            case '*':
                System.out.println(operand1+" "+operator+" "+operand2+"= "+(operand1 * operand2));//output = operand1 * operand2;
                break;
            case '/':
                if (operand2 == 0)
                    System.out.println("Ошибка ввода! Деление на 0 невозможно!");
                else   System.out.println(operand1+" "+operator+" "+operand2+"= "+(operand1 * 1.00 / operand2));//output = operand1 * 1.00 / operand2;
                break;
            default:
                System.out.println("Ошибка ввода! Программа может выполнять только действия сложения, вычитания, деления и умножения");
        }
    }
}