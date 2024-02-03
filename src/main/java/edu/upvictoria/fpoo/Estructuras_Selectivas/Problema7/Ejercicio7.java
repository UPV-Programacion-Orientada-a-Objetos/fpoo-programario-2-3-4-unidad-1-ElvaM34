package edu.upvictoria.fpoo.Estructuras_Selectivas.Problema7;
import edu.upvictoria.fpoo.Estructuras_Selectivas.Problema6.Operacion6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio7{
    public Ejercicio7() throws IOException {

        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));//"lector"
        System.out.println("\n\nproblema 7");
        System.out.println("\n********  uvas ********\n\n");
        System.out.println("Ingrese los kilos de uva que desea comprar: ");
        String entrada = br.readLine();
        float n1 = Float.parseFloat(entrada);
        System.out.println("De que tipo de uva es? A o B");
        String entrada2 = br.readLine();
        char t = entrada2.charAt(0);
        System.out.println("De tipo 1 0 2? ");
        String entrada3 = br.readLine();
        int subtipo = Integer.parseInt(entrada3);
        float precio = Operacion7.ejecucion(n1,t,subtipo);
        System.out.println("El costo seria de: $"+precio);

    }
}
