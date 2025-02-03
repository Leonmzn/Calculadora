package org.example.practica;

public class StringsInmutabilidad {
    public static void main(String[] args) {
        String curso = "Ingles";
        String profesor = "Hector Juarez";

        curso.concat(profesor);
        System.out.println("Curso = " + curso);
        String informacion = curso.concat(" " + profesor);
        System.out.println("Informacion = " + informacion);
        System.out.println(curso == profesor);

        String resultado = curso.transform(c -> {
            return c + " " + "con" + " " + profesor;
        });
        System.out.println("Resultado = " + resultado);
        String resultado2 = informacion.replace("a","A");
        System.out.println("Resultado2 = " + resultado2);
    }
}
