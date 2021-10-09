package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double x, n;
        double numerator=0;
        double denominator=0;
        double i = 1;

        Scanner num = new Scanner(System.in);
        System.out.println("Введите вещественное число");
        x = num.nextDouble();
        System.out.println("Введите натуральное число");
        n = num.nextDouble();

        if (checkThisOut(x, n)){
            System.out.println("Выражение верное");
        }
            else{
            System.out.println("Выражения не верное");
            return;
        }
            float ans = (float) calculateAnswer(x, n, i, numerator, denominator);
            System.out.printf("Ответом выражения является %.4f%n", ans);
        }

    private static double calculateAnswer(double x, double n, double i, double numenator, double denominator) {
        float ans =0;
        for (i = 1; i < n; i++)
        {
            numenator = (x - 2 * i);
            denominator = (x - 2 * i - 1);
            ans = (float) (numenator / denominator);
        }
        return ans;
    }

    private static boolean checkThisOut(double denuminator, double n){
            return (n > 0 && denuminator!=0);
    }
}
