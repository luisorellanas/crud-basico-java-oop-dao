/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.List;
import uml.Persona;

/**
 *
 * @author luis
 */
public interface Opraciones {

    public String insertar(Object p);

    public String elimnar(Object p);

    public String modificar(Object p);

    public List<Persona> consulta();

    public List<Persona> filtrar(String campo, String criterio);
}
