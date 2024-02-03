package edu.upvictoria.fpoo.Estructuras_Selectivas.Problema16;
import edu.upvictoria.fpoo.Estructuras_Selectivas.Problema8.Operacion8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio16{
    public Ejercicio16() throws IOException {

        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));//"lector"
        System.out.println("\n\nproblema 16");
        System.out.println("\n********  ********\n\n");
        System.out.println("Ingrese el presupuesto: ");
        String entrada = br.readLine();
        float presupuesto= Float.parseFloat(entrada);

        System.out.println(Operacion16.ejecucion(presupuesto);
    }
}