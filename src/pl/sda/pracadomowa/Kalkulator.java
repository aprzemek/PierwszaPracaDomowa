package pl.sda.pracadomowa;

import java.util.Scanner;

public class Kalkulator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        String operator;

        System.out.println("wprowadź pierwszą liczbą:");
        a = sc.nextInt();
        sc.nextLine();
        System.out.println("wprowadź operator");
        operator = sc.nextLine();
        System.out.println("wprowadź drugą liczbę;");
        b = sc.nextInt();
        System.out.println(a + operator + b + "=" + operacje(a, b, operator));
    }

    private static int operacje(int a, int b, String operator) {
        int wynik = 0;
        switch (operator) {
            case "+":
                wynik = a + b;
                break;
            case "-":
                wynik = a - b;
                break;
            case "*":
                wynik = a * b;
                break;
            case "/":
                wynik = a / b;
                break;
            default:
                System.out.println("nie ma takiego operatora");
        }
        return wynik;
    }
}
