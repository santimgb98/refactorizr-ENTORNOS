package org.example;

public class Trabajador {
    public String nombre;
    public String apellido;
    public String direccion;
    public String telefono;
    public Tienda tienda;

    public Trabajador() {


    }
    public String toString() {
        return "Nombre: " + nombre + "\nApellido: " + apellido + "\nDireccion: " + direccion + "\nTelefono: " + telefono;
    }
}
