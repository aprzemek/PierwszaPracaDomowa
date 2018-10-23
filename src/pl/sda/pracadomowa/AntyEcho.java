package pl.sda.pracadomowa;

import java.util.Scanner;

public class AntyEcho {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wpisz cokolwiek:");
        String tekst = scanner.nextLine();
        scanner.close();
        String[] elementy = tekst.split("");

        for(int i = elementy.length - 1; i > -1; i--) {
            System.out.print(elementy[i]);
        }
    }
}

