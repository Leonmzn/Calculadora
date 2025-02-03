package org.example.practica;

public class ConversionDeTipos {
    public static void main(String[] args) {
        String numeroString = "100";
        int numeroInt = Integer.parseInt(numeroString);
        System.out.println("numeroInt = " + numeroInt);
        
        String realString = "40000.900";
        double realdouble = Double.parseDouble(realString);
        System.out.println("realdouble = " + realdouble);

        String realString2 = "40000.900e-4";
        double realdouble2 = Double.parseDouble(realString2);
        System.out.println("realdouble = " + realdouble2);

        String logicoString = "true";
        boolean logicoBoolean = Boolean.parseBoolean(logicoString);
        System.out.println("logicoBoolean = " + logicoBoolean);

        int numeroInt2 = 500;
        String intstring = Integer.toString(numeroInt2);
        System.out.println("intstring = " + intstring);

        intstring = String.valueOf(intstring);
        System.out.println("intstring = " + intstring);

        intstring = String.valueOf(numeroInt2+20);
        System.out.println("intstring = " + intstring);

        intstring = String.valueOf(intstring+20);
        System.out.println("intstring = " + intstring);

        double strg3 = 304.980;
        String strg = Double.toString(strg3);
        System.out.println("strg = " + strg);

        double strg4 = 304.980e3;
        String strg2 = Double.toString(strg4);
        System.out.println("strg = " + strg2);

        strg2 = String.valueOf(5.4758f);
        System.out.println("strg2 = " + strg2);

        int a = 20000;
        short b = (short) a;
        long c = a;
        float d = (float) a;
        double e = (double) a;
        char f = (char) a; 
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("e = " + e);
        System.out.println("f = " + f);
    }
}
