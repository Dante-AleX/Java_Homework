/*
Реализовать простой калькулятор
 */

package Java_Homework;

import java.util.Scanner;

public class Task_003 {
        public static void main(String[] args) {
                double num1;
                double num2;
                double answer;
                char op;
                Scanner sc = new Scanner(System.in);
                System.out.print("Введите первое число: ");
                num1 = sc.nextDouble();
                System.out.print("Введите второе число: ");
                num2 = sc.nextDouble();
                System.out.print("Введите оператор (+, -, *, /): ");
                op = sc.next().charAt(0);
                switch (op) {
                        case '+':
                                answer = num1 + num2;
                                break;
                        case '-':
                                answer = num1 - num2;
                                break;
                        case '*':
                                answer = num1 * num2;
                                break;
                        case '/':
                                answer = num1 / num2;
                                break;
                        default:
                                System.out.printf("Ошибка! Введен некорректный оператор");
                                return;
                }
                System.out.println("Результат:");
                System.out.printf(num1 + " " + op + " " + num2 + " = " + answer + "\n");
        }

}