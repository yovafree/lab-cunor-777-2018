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
        arbol = new NodoBinario();
        arbol.valor = 0;
        int op = 0;
        Scanner leer = new Scanner(System.in);
        while(op != 3){
            System.out.println("Arbol");
            System.out.println("1) Ingresar valores");
            System.out.println("3) Salir");
            op = leer.nextInt();
            
            switch (op){
                case 1: 
                    int valor = leer.nextInt();
                    agregar(valor);
                    break;
            }
        }
    }
    
    public static void agregar(int valor){
        if (arbol.valor == 0){
            arbol.valor = valor;
        }else{
            int salir = 1;
            NodoBinario nodo = arbol;
            do{
                
                if (valor <= nodo.valor){
                    nodo = nodo.iz;
                    if (nodo == null){
                        nodo = new NodoBinario();
                        nodo.valor = valor;
                        salir = 2;
                    }
                }else{
                    nodo = nodo.der;
                    if (nodo == null){
                        nodo = new NodoBinario();
                        nodo.valor = valor;
                        salir = 2;
                    }
                }
            }while(salir == 1);
        }
    }
}
