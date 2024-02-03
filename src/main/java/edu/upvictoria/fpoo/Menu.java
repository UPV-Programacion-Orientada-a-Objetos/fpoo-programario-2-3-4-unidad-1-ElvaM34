package edu.upvictoria.fpoo;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Menu {
    public Menu() throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));//"lector"
            Menu_Selectivas MenuSelectiva = new Menu_Selectivas();
        System.out.println("Menu Principal: \n");
        System.out.println("************************************** \n");
        System.out.println("a)Estructuras Repetitivas \n");
        System.out.println("b)Estructuras Selectivas \n");
        System.out.println("c) \n");
        String entrada = br.readLine();
        char opc = entrada.charAt(0);
        switch (opc){
            case 'a':
                Menu_Selectivas menu_selectivas = new Menu_Selectivas();
                break;

        }



    }
}





