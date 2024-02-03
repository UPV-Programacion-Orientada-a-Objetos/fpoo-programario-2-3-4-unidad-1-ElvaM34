package edu.upvictoria.fpoo.Estructuras_Selectivas.Problema5;

import edu.upvictoria.fpoo.Estructuras_Selectivas.Problema4.Operacion4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Ejercicio5{
    public Ejercicio5() throws IOException {

        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));//"lector"
        System.out.println("\n\nproblema 5");
        System.out.println("\n********  Numero menor ********\n\n");
        System.out.println("Ingrese el primer numero: ");
        String entrada = br.readLine();
        float n1 = Float.parseFloat(entrada);
        System.out.println("Ingrese el segundo numero: ");
        String entrada2 = br.readLine();
        float n2 = Float.parseFloat(entrada2);
        System.out.println("Ingrese el tercer numero: ");
        String entrada3 = br.readLine();
        float n3 = Float.parseFloat(entrada3);


        System.out.println(Operacion5.ejecucion(n1,n2,n3));

    }
}
