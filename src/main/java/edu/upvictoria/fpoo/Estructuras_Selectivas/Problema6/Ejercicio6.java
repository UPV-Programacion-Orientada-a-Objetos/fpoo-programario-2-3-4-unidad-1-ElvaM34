package edu.upvictoria.fpoo.Estructuras_Selectivas.Problema6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio6{
    public Ejercicio6() throws IOException {

        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));//"lector"
        System.out.println("\n\nproblema 5");
        System.out.println("\n********  La langosta ahumada ********\n\n");
        System.out.println("Ingrese la cantidad de platillos: ");
        String entrada = br.readLine();
        float n1 = Float.parseFloat(entrada);
        float precio;
        precio = Operacion6.ejecucion(n1);
        System.out.println("El costo seria de: $"+precio);

    }
}