package org.lessons.java.geometria;

public class Rettangolo {
    public static int base;
    public static int altezza;

    public static void calcolaPerimetro () {
        int perimetro = (base * 2) + (altezza * 2) ;
        System.out.println("Il perimetro del rettangolo è : " + perimetro);
        System.out.println("");
    }

    public static void calcolaArea () {
        int area = (base * altezza);
        System.out.println("L'area del rettangolo è : " + area);
        System.out.println("");
    }

    public static void disegnaRettangolo () {
        System.out.println();
        for (int i = 0; i < altezza; i++) {
            for (int j = 0; j < base; j++) {
                if (i == 0 || i == altezza - 1 || j == 0 || j == base - 1) {
                    //non eliminare spazio vuoto !
                    System.out.print("* ");
                } else {
                    //spazi vuoti ( non eliminare!)
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println("");
    }    
}