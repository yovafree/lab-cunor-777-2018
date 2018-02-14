/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frm;

/**
 * Clase para controlar las reglas de una tabla de estados
 * @author erwin
 */
public class clsRegla {
   String entrada;
   String estado;
   String cambio;
   String mov;
   
   public clsRegla(String entrada,String estado, String cambio, String mov){
       this.entrada = entrada;
       this.estado= estado;
       this.cambio = cambio;
       this.mov = mov;
   }
   
   public clsRegla(String mov){
       this.estado= "";
       this.cambio = "";
       this.mov = mov;
   }
}
