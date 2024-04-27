package org.lessons.java.geometria;
import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("");
        System.out.println("- Welcome to myJava geometry tool -");
        System.out.println("--------------------------------------------------------------");
        System.out.println("Inseriamo le dimensioni del rettangolo :");
        System.out.print("   base : ");
        Rettangolo.base = scan.nextFloat();
        System.out.print("   Altezza : ");
        Rettangolo.altezza = scan.nextFloat();
        System.out.println("");
        Rettangolo myRettangolo = new Rettangolo(Rettangolo.base, Rettangolo.altezza) ;
        myRettangolo.disegnaRettangolo();
        System.out.println("");
        myRettangolo.calcolaPerimetro ();
        myRettangolo.calcolaArea ();
        System.out.println("--------------------------------------------------------------");
        System.out.println("- end -");
        System.out.println("");

    }

}
