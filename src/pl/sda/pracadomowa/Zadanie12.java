package pl.sda.pracadomowa;

import java.util.Scanner;

public class Zadanie12 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadź liczbę w zakresie od 1 do 20: ");
        int liczba = scanner.nextInt();

        if (liczba == 0 || liczba > 20) {
            System.out.println("Podana liczba jest nieprawidłowa! Wprowadź inną liczbę: ");
            liczba = scanner.nextInt();
        }
        if (liczba <= 20) {
            for (int i = 0; i <= liczba; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(j);
                }
                System.out.println();
            }
        }

    }}

