/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author LN710Q
 */
public class productos {
    private int id;
    private String nombre;
    String codigo;
    double precio;
    private int cantidad;
    private boolean disponibilidad;
    
    public productos(){
    }
    
    public productos(int id, String codigo, String marca, int stock, boolean existencia){
        this.id = id;
        this.nombre = nombre;
        this.codigo = codigo;
        this.disponibilidad = disponibilidad;
        this.codigo = codigo;        
    }
    
    public productos(String codigo, String marca, int stock, boolean existencia){
        this.codigo = codigo;
        this.nombre = nombre;
        this.disponibilidad = disponibilidad;
    }
    
        public productos(String marca, int stock, boolean existencia){
        this.nombre = nombre;
        this.disponibilidad = disponibilidad;
    }
}
