package pl.sda.pracadomowa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Zadanie10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Wprowadź listę: ");
        String listaS = sc.nextLine();
        String[] rozdzielone = listaS.split(",");
        int[] listaInt = new int[rozdzielone.length];

        for (int i = 0; i < rozdzielone.length; i++) {
            listaInt[i] = Integer.parseInt(rozdzielone[i]);
        }

        List lista = new ArrayList();
        List listaBezDuplikacji = new ArrayList();

        for (int element: listaInt){
            lista.add(element);
        }

        for (int i=0; i<lista.size(); i++){
            if (!listaBezDuplikacji.contains(lista.get(i))){
                listaBezDuplikacji.add(lista.get(i));
            }
        }

        System.out.println("Podana lista:\n" + lista);
        System.out.println("Lista bez duplikacji:\n" + listaBezDuplikacji);

    }}
