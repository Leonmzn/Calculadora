package org.example.practica;

public class TipoPrimitivoFloatDouble {
    public static void main(String[] args) {
        float realFloatEjemplo = 2.7536e4f;//27536f;
        float realFloatEjemplo2 = 6e6f;//6000000;
        System.out.println(realFloatEjemplo);
        System.out.println(realFloatEjemplo2);
        System.out.println("Valor de FLoat en byte = " + Float.BYTES);
        System.out.println("Valor de Float en bites = " + Float.SIZE);
        System.out.println("Maximo valor de Float correponde a = " + Float.MAX_VALUE);
        System.out.println("Minimo valor de Float correponde a = " + Float.MIN_VALUE);
        System.out.println("Maximo exponente de FLoat corresponde a = " + Float.MAX_EXPONENT);
        System.out.println("Minimo exponente de Float corresponde a = " + Float.MIN_EXPONENT);

        double realDoble = 1.7976931348623157E308;
        System.out.println("Valor de dobleFLoat en byte = " + Double.BYTES);
        System.out.println("Valor de dobleFloat en bites = " + Double.SIZE);
        System.out.println("Maximo valor de dobleFloat correponde a = " + Double.MAX_VALUE);
        System.out.println("Minimo valor de dobleFloat correponde a = " + Double.MIN_VALUE);
        System.out.println("Maximo exponente de dobleFLoat corresponde a = " + Double.MAX_EXPONENT);
        System.out.println("Minimo exponente de dobleFloat corresponde a = " + Double.MIN_EXPONENT);

        var flotante = 3;
        System.out.println(flotante);
        System.out.println(realDoble);


    }
}
