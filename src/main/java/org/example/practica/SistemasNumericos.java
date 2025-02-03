package org.example.practica;

import javax.swing.*;

public class SistemasNumericos {
    public static void main(String[] args) {

        String numeroString = JOptionPane.showInputDialog(null,"Ingrese un numero");
        int numeroDecimal = 0;
        try{
            numeroDecimal = Integer.parseInt(numeroString);
        }catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null,"Error ingrese un numero entero");
            main(args);
            return;
        }

        System.out.println("Numero decimal = " + numeroDecimal);
        String resultadoBinario = "Numero binario de " + numeroDecimal + " equivale a = " + Integer.toBinaryString(numeroDecimal);
        System.out.println(resultadoBinario);
        String resultadoOctal = "Numero Octal de " + numeroDecimal + " equivale a = " + Integer.toOctalString(numeroDecimal);
        System.out.println(resultadoOctal);
        String resultadoHexadecimal = "Numero Hexadecimal de " + numeroDecimal + " " + "equivale a = " + Integer.toHexString(numeroDecimal);
        System.out.println(resultadoHexadecimal);

        String mensaje = resultadoBinario;
        mensaje += "\n" + resultadoOctal;
        mensaje += "\n" + resultadoHexadecimal;
        JOptionPane.showMessageDialog(null,mensaje);
    }
}
