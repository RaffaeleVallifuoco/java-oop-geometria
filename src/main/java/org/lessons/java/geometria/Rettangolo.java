package org.lessons.java.geometria;

public class Rettangolo {
    public static int base;
    public static int altezza;

    public static void calcolaPerimetro () {
        int perimetro = (base * 2) + (altezza * 2) ;
        System.out.println("  Il perimetro del rettangolo è : " + perimetro);
        System.out.println("");
    }

    public static void calcolaArea () {
        int area = (base * altezza);
        System.out.println("  L'area del rettangolo è : " + area);
        System.out.println("");
    }
}