package edu.upvictoria.fpoo.Estructuras_Selectivas.Problema4;

public class Operacion4 {
    public static float ejecucion(float nL){
        float precio;
        float descuento;
        if(nL>2500){
            descuento=(float) (nL-(nL*.15));
            precio = nL-descuento;
            System.out.println("Obtendra un descuento de 25% que equivale a : $\n"+descuento);
            System.out.println("Costo del traje aplicando el descuento: $"+precio);
        }else {
            descuento=(float) (nL-(nL*.08));
            precio = nL-descuento;
            System.out.println("Obtendra un descuento de 8% que equivale a : $\n"+descuento);
            System.out.println("Costo del traje aplicando el descuento: $"+precio);


        }

        return 0;
    }
}
