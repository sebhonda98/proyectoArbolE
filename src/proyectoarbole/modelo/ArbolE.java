/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoarbole.modelo;

import java.io.Serializable;
import proyectoarbole.exception.ArboleException;

/**
 *
 * @author sebastian
 */
public class ArbolE implements Serializable {

    private NodoE raiz;

    public NodoE getRaiz() {
        return raiz;
    }

    public void setRaiz(NodoE raiz) {
        this.raiz = raiz;
    }

    public void adicionarNodo(Empleado dato, String identificacionPadre, NodoE ayudante) throws ArboleException {

        if (raiz == null) {

            raiz = new NodoE(dato);

        } else {

            if (buscarNodo(dato.getIdentificacion(), raiz) == null) {
                NodoE padreEcontrado = buscarNodo(identificacionPadre, raiz);
                if (padreEcontrado != null) {

                    padreEcontrado.getHijos().add(new NodoE(dato));

                } else {
                    throw new ArboleException("ojo el padre con identificacion" + identificacionPadre + "ya existe");
                }
            } else {
                throw new ArboleException("ojo el empleado con identificacion" + dato.getIdentificacion() + "ya existe");
            }

        }

    }

    public NodoE buscarNodo(String identificacion, NodoE ayudante) {

        if (ayudante.getDato().getIdentificacion() == identificacion) {

            return ayudante;
        } else {
            for (NodoE hijo : ayudante.getHijos()) {
                NodoE nodoEncontrado = buscarNodo(identificacion, hijo);
                if (nodoEncontrado != null) {
                    return nodoEncontrado;
                }
            }
        }

        return null;
    }

}
