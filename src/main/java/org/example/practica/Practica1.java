package org.example.practica;

import java.security.spec.RSAOtherPrimeInfo;
import java.sql.SQLOutput;

import static java.lang.Character.toUpperCase;

public class Practica1 {
    public static void main(String[] args) {

        String deviceId = "DEVICEID";
        int numberOfTheBeast = 666;
        System.out.println("deviceId.inUpperCase = " + deviceId.toUpperCase());
        System.out.println(numberOfTheBeast);
        System.out.println(deviceId.toLowerCase());
        System.out.println(deviceId);
        
        int numero = 10;
        int numero2 = 50;
        System.out.println(numero2);
        System.out.println("numero = " + numero);
        boolean valor = true;
        if(valor){
            int caja = 20;
            numero2 = 90;
            System.out.println(caja);
            System.out.println(deviceId);
            System.out.println(numberOfTheBeast);
            System.out.println(numero2);

        }
        String nombre;
        nombre = "Leo";
        if(numero>10){
            nombre = "Omar";
        }

        System.out.println("nombre = " + nombre);
        char c ='\n';
        System.out.println(deviceId);

                
    }
}
