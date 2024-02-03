package edu.upvictoria.fpoo.Estructuras_Selectivas.Problema2;

import edu.upvictoria.fpoo.Estructuras_Selectivas.Problema1.Operacion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio2 {
    public Ejercicio2() throws IOException {

        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));//"lector"
        System.out.println("\n\nproblema 2");
        System.out.println("\n********Mayor o menor que 0 ********\n\n");
        System.out.println("Ingrese un numero: ");
        String entrada = br.readLine();
        float n1 = Float.parseFloat(entrada);
        System.out.println(Operacion2.comparar(n1));


    }
}
