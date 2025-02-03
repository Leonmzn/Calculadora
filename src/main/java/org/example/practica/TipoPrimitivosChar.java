package org.example.practica;

import javax.lang.model.SourceVersion;

public class TipoPrimitivosChar {
    public static void main(String[] args) {
        char caracter = '\u0021';
        char decimal = 33;
        System.out.println("caracter = " + caracter);
        System.out.println("decimal = " + decimal);
        System.out.println("caracter = decimal: " + (caracter == decimal));

        char simbolo = '!';
        char espacio = ' ';
        char espacio2 = '\u0020';
        char retroceso = '\b';
        char tabulador = '\t';
        char nuevaLinea = '\n';
        char retornoCarro = '\r';
        System.out.println("simbolo = " + simbolo);
        System.out.println("simbolo = caracter " + retroceso + espacio + (simbolo == caracter));
        System.out.println("simbolo = caracter " + espacio2 + (simbolo == caracter));
        System.out.println("char corresponde en byte = " + tabulador + Character.BYTES);
        System.out.println("char corresponde en byte = " + Character.SIZE);
        System.out.println("char tiene como valor maximo a = " + nuevaLinea + Character.MAX_VALUE);
        System.out.println("char tiene como valor minimo a = " + retornoCarro + Character.MIN_VALUE);
        //System.lineSeparator()= Salto de Linea
        //System.getProperty()= Salto de Linea

    }
}
