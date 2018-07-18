/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package angular.js.model;

/**
 *
 * @author stytr
 */
public class Usuario {
    
    private int id_producto;
    private String nombre;
    private String descripcion;
    private double valor;
    private String img;

    public Usuario() {
    }

    public Usuario(int id_producto, String nombre, String descripcion, double valor, String img) {
        this.id_producto = id_producto;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.valor = valor;
        this.img = img;
    }

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    @Override
    public String toString() {
        return "Usuario{" + "id_producto=" + id_producto + ", nombre=" + nombre + ", descripcion=" + descripcion + ", valor=" + valor + ", img=" + img + '}';
    }
    
   
    
}
