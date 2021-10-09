package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double x, n, ans;
        double i = 0;

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
            ans = calculateAnswer(x, n, i);
            System.out.printf("Ответом выражения является %.4f%n", ans);
        }

   private static double calculateAnswer(double x, double n, double i){
        while (i < n){
            double ans = ans*(x-2*n)/(x-2*n-1);
            i = i++;
            return ans;
        }
    }

    private static boolean checkThisOut(double x, double n){
            return (n > 0 && x!=2*n-1);
    }
}
