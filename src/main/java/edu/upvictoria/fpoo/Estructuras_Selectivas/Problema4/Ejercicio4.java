package edu.upvictoria.fpoo.Estructuras_Selectivas.Problema4;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Ejercicio4{
    public Ejercicio4() throws IOException {

        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));//"lector"
        System.out.println("\n\nproblema 3");
        System.out.println("\n********  El harapiento distinguido ********\n\n");
        System.out.println("Ingrese el costo del traje: ");
        String entrada = br.readLine();
        float nL = Float.parseFloat(entrada);


        System.out.println(Operacion4.ejecucion(nL));

    }
}