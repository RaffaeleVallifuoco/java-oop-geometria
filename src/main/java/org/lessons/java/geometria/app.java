package org.lessons.java.geometria;
import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("");
        System.out.println("- Welcome to myJava geometry tool -");
        System.out.println("--------------------------------------------------------------");
        System.out.println("Inseriamo le dimensioni del rettangolo :");
        Rettangolo myRettangolo = new Rettangolo() ;
        System.out.print("   base : ");
        Rettangolo.base = scan.nextInt();
         System.out.print("   Altezza : ");
        Rettangolo.altezza = scan.nextInt();
        System.out.println("");
        System.out.println("Il rettangolo inserito è : " + Rettangolo.base + "x" + Rettangolo.altezza);
        Rettangolo.disegnaRettangolo();
        System.out.println("");
        Rettangolo.calcolaPerimetro ();
        Rettangolo.calcolaArea ();
        System.out.println("- end -");
        System.out.println("");

    }

}
