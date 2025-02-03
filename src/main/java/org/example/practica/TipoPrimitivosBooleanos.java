package org.example.practica;

public class TipoPrimitivosBooleanos {
    public static void main(String[] args) {

        boolean datoLogico = true;
        System.out.println("datoLogico = " + datoLogico);

        double a = 10e10;
        System.out.println("a = " + a);
        float b = 10000e-10f;
        System.out.println("b = " + b);

        datoLogico = b > a;
        System.out.println("datoLogico = " + datoLogico);

        boolean igual = (3-3 == 0);
        System.out.println("igual = " + igual);

    }
}
