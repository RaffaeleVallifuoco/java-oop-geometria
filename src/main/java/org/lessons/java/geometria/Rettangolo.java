package org.lessons.java.geometria;

public class Rettangolo {
    private int base;
    private int altezza;
    
    public void setBase(int base) {
        this.base = base;
    }

    public void setAltezza(int altezza) {
        this.altezza = altezza;
    }

    public int getBase() {
        return base;
    }

    public int getAltezza() {
        return altezza;
    }

    
    public Rettangolo(int insBase, int insAltezza) {
    	this.base = insBase ;
    	this.altezza = insAltezza ;
    }

    public  void calcolaPerimetro () {
        double perimetro = (this.base + this.altezza) * 2 ;
        System.out.println("Il perimetro del rettangolo è : " + perimetro);
        System.out.println("");
    }

    public  void calcolaArea () {
        double area = (this.base * this.altezza);
        System.out.println("L'area del rettangolo è : " + area);
        System.out.println("");
    }

    public void disegnaRettangolo () {
        System.out.println();
        System.out.println("Il rettangolo inserito è : " + getBase() + " x " + getAltezza());
        System.out.println();
        for (int i = 0; i < altezza; i++) {
            for (int j = 0; j < base; j++) {
                if (i == 0 || i == altezza - 1 || j == 0 || j == base - 1) {
                    //non eliminare spazio vuoto !
                    System.out.print("*  ");
                } else {
                    //spazi vuoti ( non eliminare!)
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
        System.out.println("");
    }
    
}