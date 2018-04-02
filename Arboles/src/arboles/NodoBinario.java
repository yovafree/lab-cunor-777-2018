/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arboles;

/**
 *
 * @author erwin
 */
public class NodoBinario {
    public int valor;
    
    public NodoBinario iz;
    public NodoBinario der;
    
    public NodoBinario(){
        this.iz = null;
        this.der = null;
    }
    
    public NodoBinario(int valor){
        this.iz = null;
        this.valor = valor;
    }
    
    public synchronized void insertar(int valorInsertar)
	{
		//insertar en subarbol izquierdo
		if (valorInsertar < valor){

			//inserta nuevo nodoarbol
			if (iz == null)
				iz = new NodoBinario(valorInsertar);
			else //continua recorriendo subarbol izquierdo
				iz.insertar(valorInsertar);
		}

		//insertar nodo derecho
		else if(valorInsertar > valor){

		//insertar nuevo nodoarbol
		if (der == null)
			der = new NodoBinario(valorInsertar);
		else //continua recorriendo subarbol derecho
			der.insertar(valorInsertar);
		}
	} //fin del metodo insertar
}
