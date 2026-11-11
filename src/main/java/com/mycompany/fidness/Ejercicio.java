
package com.mycompany.fidness;


public class Ejercicio {
    private int idEjercicio;
    private String nombre;
    private String categoria;
    private String descripcionEjecucion;

    public Ejercicio(int idEjercicio, String nombre, String categoria, String descripcionEjecucion) {
        this.idEjercicio = idEjercicio;
        this.nombre = nombre;
        this.categoria = categoria;
        this.descripcionEjecucion = descripcionEjecucion;
    }

    public String obtenerDetalles() {
        return String.format("[%s] %s - %s", categoria, nombre, descripcionEjecucion);
    }

    // Getters y Setters
    public int getIdEjercicio() { return idEjercicio; }
    public void setIdEjercicio(int idEjercicio) { this.idEjercicio = idEjercicio; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getCategoria() { return categoria; }
    public void setCategoria(String categoria) { this.categoria = categoria; }
    public String getDescripcionEjecucion() { return descripcionEjecucion; }
    public void setDescripcionEjecucion(String descripcionEjecucion) { this.descripcionEjecucion = descripcionEjecucion; }
}
