package org.example.practica;

public class TipoPrimitivoEnteros {
    public static void main(String[] args) {
        byte numeroByteMaximo = 127;
        byte numeroByteMinimo = -128;
        System.out.println(numeroByteMaximo);
        System.out.println(numeroByteMinimo);
        System.out.println("Valor de byte en byte corresponde a = " + Byte.BYTES);
        System.out.println("Valor de byte en bites corresponde a = " + Byte.SIZE);
        System.out.println("Valor maximo de byte es de = " + Byte.MAX_VALUE);
        System.out.println("Valor minimo de byte es de = " + Byte.MIN_VALUE);


        short numeroMaximoShort = 32767;
        short numeroMinimoShort = -32768;
        System.out.println("Valor de short en byte corresponde a = " + Short.BYTES);
        System.out.println("Valor de short en bites corresponde a = " + Short.SIZE);
        System.out.println("Valor Maximo de short es de = " + Short.MAX_VALUE);
        System.out.println("Valor Minimo de short es de = " + Short.MIN_VALUE);


        int numeroMaximoInt = 2147483647;
        int numeroMinimoInt = -2147483648;
        System.out.println("Valor de int en byte corresponde a = " + Integer.BYTES);
        System.out.println("Valor de int en bites corresponde a = " + Integer.SIZE);
        System.out.println("Valor Maximo de int es de = " + Integer.MAX_VALUE);
        System.out.println("Valor Minimo de int es de = " + Integer.MIN_VALUE);


        long numeroMaximoLong = 9223372036854775807L;
        long numeroMinimoLong = -9223372036854775808L;
        System.out.println("Valor de long en byte correponde a = " + Long.BYTES);
        System.out.println("Valor de long en bites corresponde a = " + Long.SIZE);
        System.out.println("Valor Maximo de long es de = " + Long.MAX_VALUE);
        System.out.println("Valor Minimo de long es de = " + Long.MIN_VALUE);



    }
}
