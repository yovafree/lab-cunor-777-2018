/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frm;

import java.util.ArrayList;

/**
 *
 * @author erwin
 */
public class clsEstado {
    public String estado;
    public ArrayList<clsRegla> reglas;
    
    public clsEstado(String estado){
        this.estado = estado;
    }
}
