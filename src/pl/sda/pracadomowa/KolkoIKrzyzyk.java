package pl.sda.pracadomowa;

import java.util.Arrays;
import java.util.Scanner;

public class KolkoIKrzyzyk {  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    // PLANSZA
    char[][] plansza = new char[3][3];
    char k=48;
    for (int i=0; i<3; i++){
        for (int j=0; j<3; j++){
            plansza[i][j] = k;
            k++;
        }
    }
    // TABLICA Z WYGRYWAJĄCYMI OPCJAMI
    char[][] wygrane = new char[8][3];
    for (int i=0; i<3; i++){
        for (int j=0; j<3; j++){
            wygrane[i][j]=plansza[i][j];
        }
    }
    for (int i=0; i<3; i++){
        for (int j=0; j<3; j++){
            wygrane[i+3][j]=plansza[j][i];
        }
    }
    for (int j=0; j<3; j++){
        wygrane[6][j]= plansza[j][j];
    }
    for (int j=0; j<3; j++){
        wygrane[7][j]=plansza[j][2-j];
    }

    pokazTablice(plansza);

    int runda=0;
    String[] gracz = {"KÓŁKO", "KRZYŻYK"}; String graTeraz ="";
    boolean czyWybrano = false;
    while (!czyWybrano){
        System.out.print("Wybierasz kółko (O) czy krzyżyk (X): ");
        String wybor = sc.nextLine();
        if (wybor.toUpperCase().equals("O")){
            runda = 1; graTeraz = gracz[0]; czyWybrano = true;
        }else if (wybor.toUpperCase().equals("X")){
            runda = 2; graTeraz = gracz[1]; czyWybrano = true;
        }else {
            System.out.println("Źle wybrałeś, gałganie! :) ");
        }
    }

    boolean czyWygrano= false;
    char[] kolka = {'O','O','O'};
    char[] krzyzyki = {'X','X','X'};
    while (!czyWygrano){
        System.out.print(graTeraz + ", wskaż pole: ");
        char pole = (char)sc.nextInt();
        for (int i=0; i<3; i++){
            for (int j=0; j<3; j++){
                if (pole +48== plansza[i][j]){
                    if (runda%2==0){
                        plansza[i][j] = 'X';
                        graTeraz = gracz[0];
                    }else{
                        plansza[i][j] = 'O';
                        graTeraz = gracz[1];
                    }
                }
            }
        }
        for (int i=0; i<8; i++){
            for (int j=0; j<3; j++){
                if (pole +48== wygrane[i][j]){
                    if (runda%2==0){
                        wygrane[i][j] = 'X';
                    }else{
                        wygrane[i][j] = 'O';
                    }
                }
            }
        }
        pokazTablice(plansza);
        for (int i=0; i<8; i++){
            if (Arrays.equals(wygrane[i],kolka)||Arrays.equals(wygrane[i],krzyzyki)){
                System.out.println(gracz[(runda-1)%2] + " wygrał!");
                czyWygrano = true;
            }
        }
        runda++;
    }
}

    private static void pokazTablice(char[][] tablica) {
        for (int i=0; i<tablica.length; i++){
            for (int j=0; j<tablica[i].length; j++){
                System.out.print(tablica[i][j]+ " ");
            }
            System.out.println();
        }
    }
}

