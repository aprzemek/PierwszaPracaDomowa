package pl.sda.pracadomowa;

import java.util.Scanner;

public class Wystapienia7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text;
        int litery = 0, liczby = 0, spacje = 0, inne = 0;

        System.out.println("wprowadź tekst");
        text = scanner.nextLine();

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == 32) {
                spacje++;
            } else if (48 <= text.charAt(i) && text.charAt(i) <= 57) {
                liczby++;
            } else if ((65 <= text.charAt(i) && text.charAt(i) <= 90) || (97 <= text.charAt(i) && text.charAt(i) <= 122)) {
                litery++;
            } else {
                inne++;
            }
        }

        System.out.println("wprowadzony tekst ma:");
        System.out.println(litery + " liter");
        System.out.println(liczby + " cyfr");
        System.out.println(spacje + " spacji");
        System.out.println(inne + " innych znaków");
    }
}
