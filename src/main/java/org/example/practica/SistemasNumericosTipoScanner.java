package org.example.practica;

import java.util.Scanner;

public class SistemasNumericosTipoScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero entero");
        //String numeroString = scanner.nextLine();
        int numeroDecimal = 0;
        try{
            numeroDecimal = scanner.nextInt();//Integer.parseInt(numeroString);
        }catch (Exception e){
            System.out.println("Error ingrese un numero entero");
            main(args);
            return;//System.exit()
        }

        System.out.println("Numero decimal = " + numeroDecimal);
        String resultadoBinario = "Numero binario de " + numeroDecimal + " equivale a = " + Integer.toBinaryString(numeroDecimal);

        String resultadoOctal = "Numero Octal de " + numeroDecimal + " equivale a = " + Integer.toOctalString(numeroDecimal);

        String resultadoHexadecimal = "Numero Hexadecimal de " + numeroDecimal + " " + "equivale a = " + Integer.toHexString(numeroDecimal);


        String mensaje = resultadoBinario;
        mensaje += "\n" + resultadoOctal;
        mensaje += "\n" + resultadoHexadecimal;
        System.out.println(mensaje);
    }
}
