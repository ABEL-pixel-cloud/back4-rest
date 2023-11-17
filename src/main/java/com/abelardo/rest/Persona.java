package com.abelardo.rest;

public class Persona {
    private String nombre;
    private String apellido;
    private String cedula;
    private String ciudad;

    public Persona() {

    }

    public Persona(String nombre, String apellido, String cedula, String ciudad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.ciudad = ciudad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
}
