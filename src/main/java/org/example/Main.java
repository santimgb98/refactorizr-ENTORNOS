package org.example;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<Producto> productos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        Tienda tienda1 = new Tienda("Mercadona","Calle 123","1234567");
        Tienda tienda2 = new Tienda("Froiz","Calle 456","7654321");

        Trabajador trabajador1 = new Trabajador("Juan","Perez","Calle 123","1234567",tienda1);
        Trabajador trabajador2 = new Trabajador("Maria","Lopez","Calle 456","7654321",tienda1);
        Trabajador trabajador3 = new Trabajador("Pedro","Gomez","Calle 789","4567890",tienda2);
        Trabajador trabajador4 = new Trabajador("Ana","Garcia","Calle 101","0987654",tienda2);

        Producto producto1 = new Producto("Patatas", 1.5, 100, "1234");
        productos.add(producto1);
        Producto producto2 = new Producto("Manzanas",2.5,200,"5678");
        productos.add(producto2);
        Producto producto3 = new Producto("Peras",3.5,300,"9101");
        productos.add(producto3);
        Producto producto4 = new Producto("Uvas",4.5,400,"1121");
        productos.add(producto4);
        Producto producto5 = new Producto("Fresas",5.5,500,"3141");
        productos.add(producto5);
        Producto producto6 = new Producto("Plátanos",6.5,600,"5161");
        productos.add(producto6);
        Producto producto7 = new Producto("Naranjas",7.5,700,"7181");
        productos.add(producto7);
        Producto producto8 = new Producto("Mangos",8.5,800,"9201");
        productos.add(producto8);

        int opcion;

        while (true) {
            System.out.println("1. Mostrar información de todas las tiendas");
            System.out.println("2. Mostrar información de todos los trabajadores");
            System.out.println("3. Mostrar productos disponibles");
            System.out.println("4. Últimos 3 productos añadidos");
            System.out.println("5. Comprar productos");
            System.out.println("6. Salir");
            System.out.print("Ingrese la opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    tienda1.mostrarTiendas();
                    tienda2.mostrarTiendas();
                    break;
                case 2:
                    trabajador1.mostrarTrabajadores();
                    trabajador2.mostrarTrabajadores();
                    trabajador3.mostrarTrabajadores();
                    trabajador4.mostrarTrabajadores();
                    break;
                case 3:
                    producto1.mostrarProductos();
                    producto2.mostrarProductos();
                    producto3.mostrarProductos();
                    producto4.mostrarProductos();
                    producto5.mostrarProductos();
                    producto6.mostrarProductos();
                    producto7.mostrarProductos();
                    producto8.mostrarProductos();
                    break;
                case 4:
                    // Aquí va el código para mostrar los últimos 3 productos añadidos
                    System.out.println("Últimos 3 productos añadidos:");
                    producto6.mostrarProductos();
                    System.out.println("-----------------------------------");
                    producto7.mostrarProductos();
                    System.out.println("-----------------------------------");
                    producto8.mostrarProductos();
                    break;
                case 5:
                    // Aquí va el código para comprar productos
                    System.out.println("Comprando productos...");
                    System.out.println("Ingrese el SKU del producto que desea comprar: ");
                    String skuABuscar = scanner.next();
                    System.out.println("Ingrese la cantidad que desea comprar: ");
                    int cantidadAComprar = scanner.nextInt();
                    for (Producto producto : productos) {
                        if (producto.sku.equals(skuABuscar)) {
                            if (producto.cantidad >= cantidadAComprar) {
                                System.out.println("Compra exitosa!");
                                producto.cantidad -= cantidadAComprar;
                            } else {
                                System.out.println("No hay suficiente cantidad de este producto.");
                            }break;
                        }
                    }break;
                case 6:
                    System.out.println("Saliendo...");
                    System.exit(0);
                default:
                    System.out.println("Opción no válida. Por favor, intente de nuevo.");
            }
        }
    }



}