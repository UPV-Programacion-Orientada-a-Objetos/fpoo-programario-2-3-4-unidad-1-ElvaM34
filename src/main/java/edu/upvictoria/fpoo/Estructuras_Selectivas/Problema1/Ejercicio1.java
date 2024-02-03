package edu.upvictoria.fpoo.Estructuras_Selectivas.Problema1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
    public class Ejercicio1{
        public Ejercicio1() throws IOException {

            BufferedReader br =new BufferedReader(new InputStreamReader(System.in));//"lector"
            System.out.println("\n\nproblema 1");
            System.out.println("\n********Mayor que o menor que********\n\n");
            System.out.println("Ingrese el primer numero: ");
            String entrada = br.readLine();
            float n1 = Float.parseFloat(entrada);
            System.out.println("Ingrese el segundo numero: ");
            String entrada2 = br.readLine();
            float n2 = Float.parseFloat(entrada2);
            System.out.println(Operacion.comparar(n1,n2));


        }
    }

