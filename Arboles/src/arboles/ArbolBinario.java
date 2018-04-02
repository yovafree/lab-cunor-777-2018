/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arboles;

import java.util.Scanner;

/**
 *
 * @author erwin
 */
public class ArbolBinario {
    static NodoBinario arbol;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Arbol arbol = new Arbol();
        int valor;

        System.out.println( "Insertando los siguientes valores: ");

        //insertando 10 numeros aleatorios del 0 al 99 en el arbol
        for (int i = 1; i<=10 ; i++)
        {
                valor = (int) (Math.random() * 100);
                System.out.print(valor + " ");
                arbol.insertarNodo(valor);
        }

        System.out.println("\n\nRecorrido Preorden");
        arbol.recorridoPreorden();

        System.out.println("\n\nRecorrido Inorden");
        arbol.recorridoInorden();

        System.out.println("\n\nRecorrido Posorden");
        arbol.recorridoPosorden();
    }
}
