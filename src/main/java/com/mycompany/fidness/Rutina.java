
package com.mycompany.fidness;
import java.util.ArrayList;
import java.util.List;

public class Rutina {
    private int idRutina;
    private Cliente propietario;
    private List<Ejercicio> listaEjercicios; // Uso de Colecciones

    public Rutina(int idRutina, Cliente propietario) {
        this.idRutina = idRutina;
        this.propietario = propietario;
        this.listaEjercicios = new ArrayList<>();
    }

    public void agregarEjercicio(Ejercicio ejercicio) throws FidnessException {
        if (ejercicio == null) {
            throw new FidnessException("Error: No se puede agregar un ejercicio vacío a la rutina.");
        }
        listaEjercicios.add(ejercicio);
    }

    public void eliminarEjercicio(Ejercicio ejercicio) throws FidnessException {
        if (!listaEjercicios.contains(ejercicio)) {
            throw new FidnessException("Error: El ejercicio no existe en la rutina actual.");
        }
        listaEjercicios.remove(ejercicio);
    }
    
    // El método exportarRutina lo podemos dejar preparado para implementarlo luego (Serialización opcional)
    public void exportarRutina() {
        System.out.println("Exportando rutina de " + propietario.getNombreUsuario() + " con " + listaEjercicios.size() + " ejercicios.");
    }

    // Getters y Setters
    public int getIdRutina() { return idRutina; }
    public void setIdRutina(int idRutina) { this.idRutina = idRutina; }
    public Cliente getPropietario() { return propietario; }
    public void setPropietario(Cliente propietario) { this.propietario = propietario; }
    public List<Ejercicio> getListaEjercicios() { return listaEjercicios; }
}
