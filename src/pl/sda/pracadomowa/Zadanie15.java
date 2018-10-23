package pl.sda.pracadomowa;

import java.util.Scanner;

public class Zadanie15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int liczbaA, liczbaB, najwiekszyDzielnik = 0;
        System.out.println("Wprowadź pierwszą liczbę: ");
        liczbaA = sc.nextInt();

        System.out.println("Wprowadź drugą liczbę");
        liczbaB = sc.nextInt();

        for (int i = 1; i <= liczbaB; i++) {
            if (liczbaA % i == 0 && liczbaB % i == 0) {
                najwiekszyDzielnik = i;
            }
        }
        System.out.println("największy wspólny dzielnik liczby: " + liczbaA + " i " + liczbaB + " wynosi: " + najwiekszyDzielnik);
    }
}
