package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);
        double x= enter("Введите вещественное число: ");
        double n = enter("Введите натуральное число: ");

        if (n > 0) {
            double ans = calculateAnswer(x, n);

            if (ans == Double.NEGATIVE_INFINITY || ans == Double.POSITIVE_INFINITY) {
                System.out.printf("Знаменатель дроби равен нулю.%n");
            } else {
                System.out.printf("Ответом выражения является %.4f%n", ans);
            }
        }
        else {
            System.out.println("Значение n введено некорректно. Пожалуйста, повторите попытку");
        }
    }

    private static double enter(String text){
        System.out.println(text);
        Scanner input = new Scanner(System.in);
        double num;
        num = input.nextDouble();
        return num;
    }

    private static double calculateAnswer(double x, double n) {
        double ans = 1;
        double numinator = 1;
        double denuminator = 1;

        for (int i = 1; i <= n; i++)
        {
            numinator *= (x - (2 * i));
            denuminator *= (x - (2 * i - 1));
        }
        ans = numinator / denuminator;

        return ans;
    }
}
