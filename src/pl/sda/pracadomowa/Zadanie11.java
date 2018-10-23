package pl.sda.pracadomowa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Zadanie11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // wprowadzanie listy jako String (liczby po przecinku), np. 2,4,3,1,2,12
        System.out.println("Wprowadź listę #1: ");
        String listaString1 = sc.nextLine();
        System.out.println("wprowadź listę #2: ");
        String listaString2 = sc.nextLine();

        int[] array1 = zamienNaListe(listaString1);
        int[] array2 = zamienNaListe(listaString2);

        List lista1 = bezDuplikacji(array1);
        List lista2 = bezDuplikacji(array2);
        List czescWspolna = new ArrayList();

        for (int i=0; i<lista1.size();i++){
            if (lista2.contains(lista1.get(i))){
                czescWspolna.add(lista1.get(i));
            }
        }
        System.out.println("Wspólne elementy obu list:\n" + czescWspolna);
    }

    private static List bezDuplikacji(int[] array) {
        List lista = new ArrayList();
        List listaBezDuplikacji = new ArrayList();
        for (int element: array){
            lista.add(element);
        }
        for (int i=0; i<lista.size(); i++){
            if (!listaBezDuplikacji.contains(lista.get(i))){
                listaBezDuplikacji.add(lista.get(i));
            }
        }
        return listaBezDuplikacji;
    }

    private static int[] zamienNaListe(String listaString) {
        String[] rozdzielone = listaString.split(",");
        int[] listaInt = new int[rozdzielone.length];
        for (int i = 0; i < rozdzielone.length; i++) {
            listaInt[i] = Integer.parseInt(rozdzielone[i]);
        }
        return listaInt;
    }
}
