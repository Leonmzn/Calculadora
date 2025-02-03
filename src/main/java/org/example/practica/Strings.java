package org.example.practica;

public class Strings {
    public static void main(String[] args) {
        String dato = "Datos";
        String dato1 = new String("datos");

        boolean igual = dato == dato1;
        System.out.println("Igual = " + igual);
        igual = dato.equals(dato1);
        System.out.println("igual = " + igual);

        String dato2 = "Datos";
        igual = dato == dato2;
        System.out.println("Igual = " + igual);

    }
}
