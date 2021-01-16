package main;

import converter.Convert;
import logic.Calculator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите два числа и знак операции" + "\nПример #1:\t1 + 2" + "\nПример #2:\tI * II");
        System.out.println("Обратите внимание, что калькулятор потдерживает только целые числа от 1 до 10 включительно!");

        String str = "";

        try {
            str = scanner.nextLine();
        } catch (InputMismatchException exception) {
            System.out.println("Неправильный ввод");
        }

        String[] mathExpression = str.split(" ");

        if (mathExpression.length == 3) {
            try {
                Convert arabToRoman = new Convert();

                int firstNum = arabToRoman.convert(mathExpression[0]);
                boolean tmp1 = arabToRoman.isRom();

                int secondNum = arabToRoman.convert(mathExpression[2]);
                boolean tmp2 = arabToRoman.isRom();

                String operator = mathExpression[1];

                if (tmp1 == tmp2) {
                    Calculator calculator = new Calculator();
                    if (!arabToRoman.isRom()) {
                        System.out.println(calculator.doCalculation(firstNum, operator, secondNum));
                    } else {
                        System.out.println(arabToRoman.arabicToRoman(calculator.doCalculation(firstNum, operator, secondNum)));
                    }
                } else {
                    System.out.println("Цифры из разных систем счисления");
                }
            } catch (InputMismatchException exception) {
                System.out.println("Ошибка ввода.");
            }
        } else {
            System.out.println("Неправильный ввод. \nПример #1:\t1 + 2");
        }
    }
}
