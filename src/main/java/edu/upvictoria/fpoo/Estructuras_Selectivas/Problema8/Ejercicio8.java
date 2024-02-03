package edu.upvictoria.fpoo.Estructuras_Selectivas.Problema8;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio8{
    public Ejercicio8() throws IOException {

        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));//"lector"
        System.out.println("\n\nproblema 8");
        System.out.println("\n********  ********\n\n");
        System.out.println("Ingrese la cantidad de alumnos: ");
        String entrada = br.readLine();
        float alumnos = Float.parseFloat(entrada);

        float precio = Operacion8.ejecucion(n1,t,subtipo);
        System.out.println("El costo seria de: $"+precio);

    }
}
