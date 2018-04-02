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
class Arbol{
	private NodoBinario raiz;

	//contruir un arbol vacio
	public Arbol()
	{
		raiz = null;
	}

	//insertar un nuevo nodo en el arbol de busqueda binaria
	public synchronized void insertarNodo(int valorInsertar)
	{
		if(raiz == null)
			raiz = new NodoBinario(valorInsertar); //crea nodo raiz

		else
			raiz.insertar(valorInsertar); // llama al metodo insertar
	}

	//--------------- EMPESAR EL RECORRIDO EN PREORDEN-----------------------
	public synchronized void recorridoPreorden()
	{
		ayudantePreorden(raiz);
	}
	//metodo recursivo para recorrido en preorden

	private void ayudantePreorden(NodoBinario nodo)
	{
		if (nodo == null)
			return;

		System.out.print(nodo.valor + " "); // mostrar datos del nodo
		ayudantePreorden(nodo.iz); //recorre subarbol izquierdo
		ayudantePreorden(nodo.der); //recorre subarbol derecho
	}

	//--------------EMPEZAR RECORRIDO INORDEN-----------------------------------
	public synchronized void recorridoInorden()
	{
		ayudanteInorden(raiz);
	}

	// metodo recursivo para recorrido inorden

	private void ayudanteInorden(NodoBinario nodo)
	{
		if (nodo == null)
			return;

		ayudanteInorden(nodo.iz);
		System.out.print(nodo.valor + " ");
		ayudanteInorden(nodo.der);
	}

	//-----------------------------EMPEZAR RECORRIDO POSORDEN---------------------------------
	public synchronized void recorridoPosorden()
	{
		ayudantePosorden(raiz);
	}

	//metodo recursivo para recorrido posorden

	private void ayudantePosorden(NodoBinario nodo)
	{
		if (nodo == null)
			return;

		ayudantePosorden(nodo.iz);
		ayudantePosorden(nodo.der);
		System.out.print(nodo.valor + " ");
	}

}//fin clase arbol
