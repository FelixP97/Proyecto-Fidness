
package com.mycompany.fidness;


public class Administrador extends Persona {

    public Administrador(String nombreUsuario, String contrasena) {
        super(nombreUsuario, contrasena);
    }

    @Override
    public String obtenerRol() {
        return "Administrador";
    }
}
