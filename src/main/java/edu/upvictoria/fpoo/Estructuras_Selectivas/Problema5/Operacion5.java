package edu.upvictoria.fpoo.Estructuras_Selectivas.Problema5;

public class Operacion5 {
    public static float ejecucion(float n1, float n2, float n3){
        if((n1 > n2) && (n1 > n3)){
          System.out.println(n1+"es el numero mayor");

        }else if((n2>n1) && (n2>n3)) {
            System.out.println(n2+"es el numero mayor");
        } else  {
            System.out.println(n3+"es el numero mayor");
        }

        return 0;
    }
}
