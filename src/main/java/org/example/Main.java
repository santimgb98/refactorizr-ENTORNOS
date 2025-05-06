package org.example;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<Producto> listaProductos = new ArrayList<>();
        ArrayList<Trabajador> listaTrabajadores = new ArrayList<>();
        ArrayList<Tienda> listaTiendas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        Tienda tienda1 = new Tienda("Mercadona","Calle 123","1234567");
        listaTiendas.add(tienda1);
        Tienda tienda2 = new Tienda("Froiz","Calle 456","7654321");
        listaTiendas.add(tienda2);

        Trabajador trabajador1 = new Trabajador("Juan","Perez","Calle 123","1234567",tienda1);
        listaTrabajadores.add(trabajador1);
        Trabajador trabajador2 = new Trabajador("Maria","Lopez","Calle 456","7654321",tienda1);
        listaTrabajadores.add(trabajador2);
        Trabajador trabajador3 = new Trabajador("Pedro","Gomez","Calle 789","4567890",tienda2);
        listaTrabajadores.add(trabajador3);
        Trabajador trabajador4 = new Trabajador("Ana","Garcia","Calle 101","0987654",tienda2);
        listaTrabajadores.add(trabajador4);

        Producto producto1 = new Producto("Patatas", 1.5, 100, "1234");
        listaProductos.add(producto1);
        Producto producto2 = new Producto("Manzanas",2.5,200,"5678");
        listaProductos.add(producto2);
        Producto producto3 = new Producto("Peras",3.5,300,"9101");
        listaProductos.add(producto3);
        Producto producto4 = new Producto("Uvas",4.5,400,"1121");
        listaProductos.add(producto4);
        Producto producto5 = new Producto("Fresas",5.5,500,"3141");
        listaProductos.add(producto5);
        Producto producto6 = new Producto("Plátanos",6.5,600,"5161");
        listaProductos.add(producto6);
        Producto producto7 = new Producto("Naranjas",7.5,700,"7181");
        listaProductos.add(producto7);
        Producto producto8 = new Producto("Mangos",8.5,800,"9201");
        listaProductos.add(producto8);

        int opcion;

        while (true) {
            System.out.println("1. Mostrar información de todas las tiendas");
            System.out.println("2. Mostrar información de todos los trabajadores");
            System.out.println("3. Mostrar productos disponibles");
            System.out.println("4. Últimos 3 productos añadidos");
            System.out.println("5. Vender productos");
            System.out.println("6. Agregar nuevo producto");
            System.out.println("7. Contratar nuevo trabajador");
            System.out.println("8. Salir");
            System.out.print("Ingrese la opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1: // Mostrar tiendas
                    System.out.println("Lista de tiendas: ");
                    for( int i = 0; i<listaTiendas.size();i++) {
                        listaTiendas.get(i).mostrarTiendas();
                    }
                    break;
                case 2: // Mostrar trabajadores
                    System.out.println("Lista de trabajadores: ");
                    for( int i = 0; i<listaTrabajadores.size();i++) {
                        listaTrabajadores.get(i).mostrarTrabajadores();
                    }
                    break;
                case 3: // Mostrar productos
                    System.out.println("Lista de productos: ");
                    for( int i = 0; i<listaProductos.size();i++) {
                        listaProductos.get(i).mostrarProductos();
                    }
                    break;
                case 4: // Mostrar los últimos 3 productos añadidos
                    System.out.println("Últimos 3 productos añadidos:");
                    for( int i = (listaProductos.size()-3); i<listaProductos.size();i++) {
                        listaProductos.get(i).mostrarProductos();
                    }
                    break;
                case 5:
                    // Aquí va el código para vender productos
                    System.out.println("Vender productos...");
                    System.out.println("Ingrese el SKU del producto que desea vender: ");
                    String skuABuscar = scanner.next();
                    System.out.println("Ingrese la cantidad que desea vender: ");
                    int cantidadAVender = scanner.nextInt();
                    for (Producto producto : listaProductos) {
                        if (producto.sku.equals(skuABuscar)) {
                            if (producto.cantidad >= cantidadAVender) {
                                System.out.println("Compra exitosa!");
                                producto.cantidad -= cantidadAVender;
                            } else {
                                System.out.println("No hay suficiente cantidad de este producto.");
                            }
                        }
                    }
                    break;
                case 6:
                    System.out.println("Introduce el nombre del nuevo producto: ");
                    String nombre = scanner.next();
                    System.out.println("Introduce el precio del nuevo producto: ");
                    int precio = scanner.nextInt();
                    System.out.println("Introduce la cantidad de producto que entra: ");
                    int cantidad = scanner.nextInt();
                    System.out.println("Introduce el sku del nuevo producto: ");
                    String sku = scanner.next();
                    Producto productoNuevo = new Producto(nombre,precio,cantidad,sku);
                    listaProductos.add(productoNuevo);
                    System.out.println("Producto agregado con éxito!");
                    break;
                case 7:
                    System.out.println("Introduce el nombre del nuevo trabajador: ");
                    String nombreTrabajador = scanner.next();
                    System.out.println("Introduce el apellido del nuevo trabajador: ");
                    String apellido = scanner.next();
                    System.out.println("Introduce su dirección: ");
                    String direccion = scanner.next();
                    System.out.println("Introduce su teléfono: ");
                    String telefono = scanner.next();
                    scanner.next();
                    System.out.println("Selecciona su tienda:");
                    String tienda = scanner.next();
                    if(tienda.equals("tienda1")) {
                        Trabajador trabajadorNuevo = new Trabajador(nombreTrabajador, apellido, direccion, telefono, tienda1);
                        listaTrabajadores.add(trabajadorNuevo);
                    }else if (tienda.equals("tienda2")){
                        Trabajador trabajadorNuevo = new Trabajador(nombreTrabajador, apellido, direccion, telefono, tienda2);
                        listaTrabajadores.add(trabajadorNuevo);
                    }
                    break;
                case 8:
                    System.out.println("Saliendo...");
                    System.exit(0);
                default:
                    System.out.println("Opción no válida. Por favor, intente de nuevo.");
            }
        }
    }
}