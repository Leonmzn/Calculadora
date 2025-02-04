package org.example.practica;

import java.util.Scanner;

public class AplicacionCalculadora {
    /**
     * Esta es una calculadora que realiza operaciones de suma resta multiplicacion y division
     * @param args
     */
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        while (true) {
            System.out.println("Calculadora App");
            mostrarMenu();
            try {
                int operacion = Integer.parseInt(datos.nextLine());
                if (operacion >= 1 && operacion <= 4) {
                    ejecutarOperacion(operacion, datos);
                } else if (operacion == 5) {
                    System.out.println("Hasta pronto");
                    break;
                } else {
                    System.out.println("Operacion erronea = " + operacion);
                }
                System.out.println();
            }catch (Exception e){
                System.out.println("Ocurrio un error " + e.getMessage());
            }
            System.out.println();

        }
    }
    private static void mostrarMenu (){
        System.out.println("1. Suma \n2. Resta \n3. Multiplicacion \n4. Division \n5. Salir");
        System.out.println("Seleccione el tipo de operacion a realizar");
    }
    private static void ejecutarOperacion(int operacion, Scanner datos){
        System.out.println("Ingrese el primer valor");
        double operando1 = Double.parseDouble(datos.nextLine());
        System.out.println("Ingrese el segundo valor");
        double operando2 = Double.parseDouble(datos.nextLine());
        double resultado;
        switch (operacion) {
            case 1 -> {
                resultado = operando1 + operando2;
                System.out.println("Resultado suma = " + resultado);
            }
            case 2 -> {
                resultado = operando1 - operando2;
                System.out.println("Resultado resta = " + resultado);
            }
            case 3 -> {
                resultado = operando1 * operando2;
                System.out.println("Resultado multiplicacion = " + resultado);
            }
            case 4 -> {
                resultado = operando1 / operando2;
                System.out.println("Resultado division = " + resultado);
            }
            default -> {
                System.out.println("Opcion erronea = " + operacion);
            }
        }
    }
}
