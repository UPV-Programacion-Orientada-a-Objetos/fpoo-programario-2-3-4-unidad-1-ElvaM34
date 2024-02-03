package edu.upvictoria.fpoo.Estructuras_Selectivas.Problema3;

public class Operacion3 {
    public static float ejecucion(float nL){
        float precio;
        if(nL>999){
             precio = (float) (nL*3.65);
        }else {
           precio = (float) (nL*4.83);

        }

        return precio;
    }
}
