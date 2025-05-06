package org.example;
import java.util.ArrayList;

public class Tienda {
    private String nombre;
    private String direccion;
    private String telefono;
    ArrayList<Producto> listaProductos;
    ArrayList<Trabajador> listaTrabajadores;
    ArrayList<Tienda> listaTiendas;

    public Tienda (){
        this.listaProductos = new ArrayList<Producto>();
        this.listaTrabajadores = new ArrayList<Trabajador>();
        this.listaTiendas = new ArrayList<Tienda>();
    }

    public Tienda(String nombre, String direccion, String telefono) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public String getNombre() {return nombre;}
    public String getDireccion() {
        return direccion;
    }
    public String getTelefono() {
        return telefono;
    }

    public void setNombre(String nombre) {this.nombre = nombre;}
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public void setTelefono(String telefono) {this.telefono = telefono;}

    public void mostrarTiendas(){
        System.out.println("Lista de tiendas: ");
        System.out.println("******* TIENDA *******");
        System.out.println("Nombre: " + this.getNombre() +
                "\nDirección: " + this.getDireccion() +
                "\nTeléfono: " + this.getTelefono());
    }
    public String toString(String nombre, String direccion, String telefono){
        return "Nombre: "+nombre+"\rDirección: "+direccion+"\rTeléfono: "+telefono;
    }
}
