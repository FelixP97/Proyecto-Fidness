
package com.mycompany.fidness;


public abstract class Persona {
    protected String nombreUsuario;
    protected String contrasena;

    public Persona(String nombreUsuario, String contrasena) {
        this.nombreUsuario = nombreUsuario;
        this.contrasena = contrasena;
    }

    
    public abstract String obtenerRol();

    public boolean iniciarSesion(String usuario, String contrasena) {
        return this.nombreUsuario.equals(usuario) && this.contrasena.equals(contrasena);
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
}
