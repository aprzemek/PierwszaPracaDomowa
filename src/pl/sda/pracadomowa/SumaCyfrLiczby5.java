package pl.sda.pracadomowa;

import java.util.Scanner;

public class SumaCyfrLiczby5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int suma = 0;

        System.out.println("wprowadz liczbe dla której zsumowac cyfry");
        String liczba = scanner.nextLine();

        for(int i=0; i<liczba.length(); i++){
            suma += liczba.charAt(i)%48;
        }
        System.out.println(suma);
    }

}
