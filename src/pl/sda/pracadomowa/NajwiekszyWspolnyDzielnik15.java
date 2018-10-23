package pl.sda.pracadomowa;

import java.util.Scanner;

public class NajwiekszyWspolnyDzielnik15 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean czyDalej = true;
        String odp;

        while (czyDalej){
            System.out.println("Podaj pierwszą liczbę: ");
            int liczba1 = scanner.nextInt();
            System.out.println("Podaj drugą liczbę: ");
            int liczba2 = scanner.nextInt();
            System.out.println("Największy wspólny dzielnik liczb:" +
                    "\nwynosi: " + najwiekszyWspolnyDzielnik(liczba1, liczba2));
            System.out.println("Czy dalej (T/N): ");
            scanner.nextLine();
            odp = scanner.nextLine();
            if (odp.toUpperCase().equals("T")) {
                czyDalej = true;
            } else {
                czyDalej = false;
            }
        }
    }

    private static int najwiekszyWspolnyDzielnik(int liczba1, int liczba2) {
        int reszta = 1;
        int iloraz;
        while (reszta>0){
            iloraz = liczba1 / liczba2;
            reszta = liczba1 - liczba2*iloraz;
            if (reszta == 0){
                break;
            }
            liczba1 = liczba2;
            liczba2 = reszta;
        }
        return liczba2;
    }
}
