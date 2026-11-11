
package com.mycompany.fidness;


public class Cliente extends Persona {

    public Cliente(String nombreUsuario, String contrasena) {
        super(nombreUsuario, contrasena);
    }

    @Override
    public String obtenerRol() {
        return "Cliente";
    }

    // Retorna una nueva instancia de Rutina asignada a este cliente
    public Rutina crearRutina(int idRutina) {
        return new Rutina(idRutina, this);
    }
}
