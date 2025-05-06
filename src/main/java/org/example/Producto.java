package org.example;

public class Producto {
    private String nombre;
    private double precio;
    public int cantidad;
    public String sku;

    public Producto(String nombre, double precio, int cantidad, String sku){
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.sku = sku;
    }

    public String getNombre() {return nombre;}
    public double getPrecio() {return precio;}
    public int getCantidad() {return cantidad;}
    public String getSku() {return sku;}

    public void setNombre(String nombre) {this.nombre = nombre;}
    public void setPrecio(double precio) {this.precio = precio;}
    public void setCantidad(int cantidad) {this.cantidad = cantidad;}
    public void setSku(String sku) {this.sku = sku;}

    public void mostrarProductos(){
        System.out.println("******* "+this.getNombre()+" *******");
        System.out.println("Precio: " + this.getPrecio() +
                "\nCantidad: " + this.getCantidad() +
                "\nSku: " + this.getSku());
    }
    public String toString(){
        return "Nombre: "+nombre+"\nPrecio: "+precio+"\nCantidad: "+cantidad+"\nSku: "+sku;
    }
}
