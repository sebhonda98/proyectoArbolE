/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoarbole.modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sebastian
 */
public class NodoE implements Serializable{
    
    private Empleado dato;
    private List<NodoE> hijos;

    public NodoE(Empleado dato) {
        this.dato = dato;
        this.hijos = new ArrayList<>();
    }

    public Empleado getDato() {
        return dato;
    }

    public void setDato(Empleado dato) {
        this.dato = dato;
    }

    public List<NodoE> getHijos() {
        return hijos;
    }

    public void setHijos(List<NodoE> hijos) {
        this.hijos = hijos;
    }
    
    
}
