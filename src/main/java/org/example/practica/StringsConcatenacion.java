package org.example.practica;

public class StringsConcatenacion {
    public static void main(String[] args) {
        String curso = "Ingles";
        String profesor = "Hector Juarez";
        String informacion = curso + " " + "con el profesor" + " " + profesor;

        int numero = 15;
        int numero1 = 10;

        System.out.println(informacion + "" + numero + numero1);
        System.out.println(informacion + (numero + numero1));

        String informacion1 = curso.concat(" " + profesor);
        System.out.println("Informacion1 = " + " con el " + informacion1);
        String informacion2 = curso.concat(" con el ").concat(profesor);

        System.out.println("Informacion2 = " + informacion2);
    }
}
