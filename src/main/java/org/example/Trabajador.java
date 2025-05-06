package org.example;

public class Trabajador {
    private String nombre;
    private String apellido;
    private String direccion;
    private String telefono;
    private Tienda tienda;

    public Trabajador(String nombre, String apellido, String direccion, String telefono, Tienda tienda) {
        this.nombre = nombre;
        this.apellido =apellido;
        this.direccion = direccion;
        this.telefono = telefono;
        this.tienda = tienda;
    }

    public String getNombre() {return nombre;}
    public String getApellido() {return apellido;}
    public String getDireccion() {return direccion;}
    public String getTelefono() {return telefono;}
    public Tienda getTienda() {return tienda;}

    public void setNombre(String nombre) {this.nombre = nombre;}
    public void setApellido(String apellido) {this.apellido = apellido;}
    public void setDireccion(String direccion) {this.direccion = direccion;}
    public void setTelefono(String telefono) {this.telefono = telefono;}
    public void setTienda(Tienda tienda) {this.tienda = tienda;}

    public void mostrarTrabajadores(){
        System.out.println("Lista de trabajadores: ");
        System.out.println("******* "+this.getNombre()+" "+this.getApellido()+" *******");
        System.out.println("Dirección: " + this.getDireccion() +
                "\nTeléfono: " + this.getTelefono() +
                "\nTienda: " + this.getTienda());
    }
    public String toString() {
        return "Nombre: " + nombre + "\nApellido: " + apellido + "\nDireccion: " + direccion + "\nTelefono: " + telefono+"\nTienda: "+tienda;
    }
}
