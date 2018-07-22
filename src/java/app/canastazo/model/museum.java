/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app.canastazo.model;

/**
 *
 * @author robert
 */
public class museum {
  
 private int id;
 private String titulo, descripcion;

  public museum() {
  }

  public museum(int id, String titulo, String descripcion) {
    this.id = id;
    this.titulo = titulo;
    this.descripcion = descripcion;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getTitulo() {
    return titulo;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public String getDescripcion() {
    return descripcion;
  }

  public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
  }

  @Override
  public String toString() {
    return "museum{" + "id=" + id + ", titulo=" + titulo + ", descripcion=" + descripcion + '}';
  }
 
  
}
