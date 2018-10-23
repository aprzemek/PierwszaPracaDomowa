package pl.sda.pracadomowa;

import java.util.Scanner;

public class Sortowanie {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Wprowadź liczby (oddzielając je przecinkiem): ");
        String listaS = scanner.nextLine();
        String[] rozdzielone = listaS.split(",");
        int[] listaInt = new int[rozdzielone.length];

        for (int i=0; i<rozdzielone.length; i++){
            listaInt[i] = Integer.parseInt(rozdzielone[i]);
        }

        System.out.println("Twoja lista:");
        for (int elem: listaInt){
            System.out.print(elem + "\t");
        }
        System.out.println();

        boolean CzyZmienionoKolejnosc = true;
        while (CzyZmienionoKolejnosc){
            CzyZmienionoKolejnosc = false;
            for (int i=0; i<listaInt.length-1; i++){
                if (listaInt[i]>listaInt[i+1]){
                    int c = listaInt[i];
                    listaInt[i]=listaInt[i+1];
                    listaInt[i+1]=c;
                    CzyZmienionoKolejnosc = true;
                }
            }
        }

        System.out.println("Sortowanie rosnąco:");
        for (int element: listaInt){
            System.out.print(element + "\t");
        }
        System.out.println();

        System.out.println("Sortowanie malejąco:");
        for (int i=listaInt.length-1; i>=0; i--){
            System.out.print(listaInt[i] + "\t");
        }
    }
}
