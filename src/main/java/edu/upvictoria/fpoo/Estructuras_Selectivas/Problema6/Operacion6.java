package edu.upvictoria.fpoo.Estructuras_Selectivas.Problema6;

public class Operacion6 {

    public static float ejecucion(float n1){
        float precio=0;
        if(n1 < 200){
            precio=(float) (n1*95);

        }else if((n1>200) && (n1<301)) {
            precio=(float) (n1*85);
        } else if(n1>300) {
            precio=(float) (n1*75);
        }

        return precio;
    }
}
