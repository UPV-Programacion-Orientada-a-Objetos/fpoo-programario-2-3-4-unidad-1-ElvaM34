package edu.upvictoria.fpoo.Estructuras_Selectivas.Problema3;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Ejercicio3{
    public Ejercicio3() throws IOException {

        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));//"lector"
        System.out.println("\n\nproblema 3");
        System.out.println("\n********  Lapices  ********\n\n");
        System.out.println("Ingrese el numero de lapices: ");
        String entrada = br.readLine();
        float nL = Float.parseFloat(entrada);
        float precio=Operacion3.ejecucion(nL);
        System.out.println("el total es : $"+ precio);

    }
}