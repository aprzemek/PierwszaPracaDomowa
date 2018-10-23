package pl.sda.pracadomowa;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lotto7 {public static void main(String[] args) {
    int wielkoscTabeli = 6;
    Scanner sc = new Scanner(System.in);
    Random rand = new Random();

    int[] tabUzytkownika = new int[wielkoscTabeli];
    int[] tabRandom = new int[wielkoscTabeli];

    //wywołanie metody uzupełnienia tabeli przez uzytkownika
    uzupelnianieTabeliUzytkownika(sc, tabUzytkownika);

    //wywołanie metody uzupełnienia tabeli random
    uzupelnianieTabeliRandomowej(rand, tabRandom);

    //wypisanie tabeli uzytkownika
    System.out.println("liczby użytkownika: " + Arrays.toString(tabUzytkownika));

    //wypisanie tabeli random
    System.out.println("liczby wylosowane: " + Arrays.toString(tabRandom));

    //podanie informacji o ilości trafień ilość trafień liczy metoda
    System.out.println("udało sie tobie trafic " + wystapienia(tabUzytkownika, tabRandom) + " liczb");
}

    //zrobiona pętla w pętli aby kazy wyraz z tabeli uzytkownika "przebegł" przez tabelę randomowa,
    // jeżeli taka sama wartość to zlicza powtórzenia
    private static int wystapienia(int[] tabUzytkownika, int[] tabRandom) {
        int powtorzenia = 0;
        for (int i = 0; i < tabUzytkownika.length; i++) {
            for (int j = 0; j < tabRandom.length; j++) {
                if (tabUzytkownika[i] == tabRandom[j])
                    powtorzenia++;
            }
        }
        return powtorzenia;
    }

    //uzupelnienie tabeli wartościami z zakresu od 1 do 49 (rand.nextInt(49)+1) znaczy że "losuj w zakresie
    // 49 liczb, zaczynając od liczby 1"
    private static void uzupelnianieTabeliRandomowej(Random rand, int[] tabRandom) {
        for (int i = 0; i < tabRandom.length; i++) {
            tabRandom[i] = rand.nextInt(49) + 1;
        }
    }

    //uzupełnienie tabeli użytkownika na początku sprawdza czy podana liczba mieści się w zakrecie od 0 do 49, jeżeli tak to
    //sprawdza w zagnieżdżonej pętli czy liczba już została podana
    private static void uzupelnianieTabeliUzytkownika(Scanner sc, int[] tabUzytkownika) {
        for (int i = 0; i < tabUzytkownika.length; i++) {
            System.out.println("Podaj " + (i + 1) + " liczbę, którą typuejsz: ");
            boolean zakres = false;
            while (!zakres) {
                zakres = false;
                int liczba = sc.nextInt();
                if (liczba > 0 && liczba <= 49) {
                    tabUzytkownika[i] = liczba;
                    zakres = true;

                    for (int j = 0; j < i; j++) {
                        if (liczba == tabUzytkownika[j]) {
                            System.out.println("liczba zostalą już wylosowana, podaj jeszcze raz liczbę " + (i + 1));
                            zakres = false;
                        }
                    }
                } else {
                    System.out.println("liczba poza zakresem, podaj jeszcze raz liczbę numer : " + (i + 1));
                }
            }
        }
    }
}

