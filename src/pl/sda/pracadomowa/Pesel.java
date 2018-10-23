package pl.sda.pracadomowa;

import java.util.Arrays;
import java.util.Scanner;

public class Pesel {public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Wprowadź numer 11 cyfrowy numer PESEL: ");
    String[] pesel1 = scanner.nextLine().split("");
    int[] pesel2 = new int[pesel1.length];

    if (pesel1.length == 11) {
        for (int i = 0; i < pesel1.length; i++) {
            pesel2[i] = Integer.valueOf(pesel1[i]);
        }

        System.out.println("Wprowadzony PESEL to: " + Arrays.toString(pesel2));

        int suma = (pesel2[0] * 1) + (pesel2[1] * 3) + (pesel2[2] * 7) + (pesel2[3] * 9) + (pesel2[4] * 1)
                + (pesel2[5] * 3) + (pesel2[6] * 7) + (pesel2[7] * 9) + (pesel2[8] * 1) + (pesel2[9] * 3)
                + (pesel2[10] * 1);

        String check = String.valueOf(suma);
        String[] koniec = check.split("");

        if (Integer.valueOf(koniec[koniec.length - 1]) == 0) {
            System.out.println("Wprowadziłeś prawidłowy PESEL. ");
        } else {
            System.out.println("Wprowadziłeś nieprawidłowy PESEL! ");
        }
    }
    else {
        System.out.println("Podany PESEL ma nieprawidłową ilość cyfr!");
    }

}
}
