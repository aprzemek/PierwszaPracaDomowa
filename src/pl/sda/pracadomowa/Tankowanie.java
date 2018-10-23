package pl.sda.pracadomowa;

import java.util.Scanner;

public class Tankowanie {
    public static void main(String[] args) {

        double pojemnoscBaku = 40;
        Scanner sc = new Scanner(System.in);

        //CENNIK
        double cena = 0;
        double[] cennik = {4.87, 5.22, 4.80};
        String[] rodzajPaliwa = {"Pb95", "Pb98", "ON"};

        boolean czyWybrano = false;
        while (!czyWybrano){
            System.out.println("Podaj rodzaj paliwa (Pb95=1, Pb98=2, ON=3): ");
            String wybor = sc.nextLine();
            for (int i=1; i<=3; i++){
                if (wybor.equals(String.valueOf(i))){
                    cena = cennik[i-1]; czyWybrano = true;
                    System.out.println("Wybrano: " + rodzajPaliwa[i-1]);
                }
            }if (czyWybrano==false){
                System.out.println("Nie wybrano.");
            }
        }

        double ilosc=0;
        while (czyWybrano){
            System.out.print("Ile chcesz wlać paliwa [l]: ");
            ilosc = sc.nextDouble();
            if (ilosc>=pojemnoscBaku){
                System.out.println("Za dużo!");
            }else {
                czyWybrano = false;
            }
        }
        raportDystrybutora(ilosc,cena);

        // DOLEWANIE PALIWA
        double dodatek = 0;
        double dolanoRazem = ilosc + dodatek;
        double pozostalo = pojemnoscBaku-ilosc;
        while (true){
            System.out.print("Czy chcesz kontynuować (T/N): ");
            String odp = sc.next();
            if (odp.toUpperCase().equals("T")){
                dodatek = losowaDziesietna(pozostalo,2);
                System.out.println("DOLANO:");
                raportDystrybutora(dodatek, cena);
                pozostalo -= dodatek;
                dolanoRazem += dodatek;
            }else if (odp.toUpperCase().equals("N")){
                break;
            }
            else{
                System.out.println("Wybierz T lub N! ");
            }
        }
        System.out.println("\nRaport końcowy:");
        raportDystrybutora(dolanoRazem, cena);
        System.out.println("Zapraszamy ponownie :)");
    }

    private static void raportDystrybutora(double ilosc, double cena) {
        System.out.println("Ilość:\tCena:\tDo zapłaty:");
        System.out.printf("%.2f\t%.2f\t%.2f\n", ilosc, cena, cena*ilosc);
        System.out.println();
    }

    private static double losowaDziesietna(double liczba, int poPrzecinku) {
        double x = Math.round(liczba*(Math.pow(10,poPrzecinku))*Math.random())/Math.pow(10,poPrzecinku);
        return x;
    }
}