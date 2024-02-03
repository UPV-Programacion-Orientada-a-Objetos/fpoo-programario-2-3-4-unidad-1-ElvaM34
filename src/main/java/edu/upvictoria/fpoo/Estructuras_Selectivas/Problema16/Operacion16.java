package edu.upvictoria.fpoo.Estructuras_Selectivas.Problema16;

public class Operacion16 {
    public static float ejecucion(float n1,char t,int subtipo){
        float precioPorAlumno=0;
        float total=0;
        if((t=='A') && (subtipo==1)){
            precio= (float)(n1*20);
        }else if ((t =='A') && (subtipo==2)){
            precio = (float) (n1*30);
        } else if ((t=='B')&&(subtipo==1)) {
            precio =(float) (n1*30);
        }else if ((t =='B')&&(subtipo==2)){
            precio= (float) (n1*50);
        }else {
            System.out.println("No existe ese subtipo/tipo");
        }

        return precio;
    }
}
