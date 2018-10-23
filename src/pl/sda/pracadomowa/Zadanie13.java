package pl.sda.pracadomowa;

public class Zadanie13 {
    public static void main(String[] args) {
        int wielkosc = 8;

//        wersja A
        for (int i = 0; i < wielkosc; i++) {
            for (int j = 0; j < (i + 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

//        wersja B
        for(int i=0; i<wielkosc; i++){
            for(int j=wielkosc-i; j>0; j--){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

//        wercja C
        for(int i=0; i<wielkosc; i++){
            for (int k=0; k<i;k++){
                System.out.print(" ");
            }
            for(int j=wielkosc-i; j>0; j--){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

//        wersja D
        for (int i = 0; i < wielkosc; i++) {
            for(int k =wielkosc-i; k>1; k--){
                System.out.print(" ");
            }
            for (int j = 0; j < (i + 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
