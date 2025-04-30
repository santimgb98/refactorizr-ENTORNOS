package org.example;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Tienda tienda1 = new Tienda();
        tienda1.direccion = "Calle 123";
        tienda1.telefono = "1234567";

        Tienda tienda2 = new Tienda();
        tienda2.direccion = "Calle 456";
        tienda2.telefono = "7654321";


        Trabajador trabajador1 = new Trabajador();
        trabajador1.nombre = "Juan";
        trabajador1.apellido = "Perez";
        trabajador1.direccion = "Calle 123";
        trabajador1.telefono = "1234567";
        trabajador1.tienda = tienda1;


        Trabajador trabajador2 = new Trabajador();
        trabajador2.nombre = "Maria";
        trabajador2.apellido = "Lopez";
        trabajador2.direccion = "Calle 456";
        trabajador2.telefono = "7654321";
        trabajador2.tienda = tienda1;



        Trabajador trabajador3 = new Trabajador();
        trabajador3.nombre = "Pedro";
        trabajador3.apellido = "Gomez";
        trabajador3.direccion = "Calle 789";
        trabajador3.telefono = "4567890";
        trabajador3.tienda = tienda2;

        Trabajador trabajador4 = new Trabajador();
        trabajador4.nombre = "Ana";
        trabajador4.apellido = "Garcia";
        trabajador4.direccion = "Calle 101";
        trabajador4.telefono = "0987654";
        trabajador4.tienda = tienda2;



        Cliente cliente1 = new Cliente();
        cliente1.nombre = "Carlos";
        cliente1.apellido = "Perez";
        cliente1.direccion = "Calle 123";
        cliente1.telefono = "1234567";

        Cliente cliente2 = new Cliente();
        cliente2.nombre = "Ana";
        cliente2.apellido = "Lopez";
        cliente2.direccion = "Calle 456";
        cliente2.telefono = "7654321";

        Cliente cliente3 = new Cliente();
        cliente3.nombre = "Pedro";
        cliente3.apellido = "Gomez";
        cliente3.direccion = "Calle 789";
        cliente3.telefono = "4567890";

        Cliente cliente4 = new Cliente();
        cliente4.nombre = "Maria";
        cliente4.apellido = "Garcia";
        cliente4.direccion = "Calle 101";
        cliente4.telefono = "0987654";


        Producto producto1 = new Producto();
        producto1.nombre = "Patatas";
        producto1.precio = 1.5;
        producto1.cantidad = 100;
        producto1.sku = "1234";

        Producto producto2 = new Producto();
        producto2.nombre = "Manzanas";
        producto2.precio = 2.5;
        producto2.cantidad = 200;
        producto2.sku = "5678";

        Producto producto3 = new Producto();
        producto3.nombre = "Peras";
        producto3.precio = 3.5;
        producto3.cantidad = 300;
        producto3.sku = "9101";

        Producto producto4 = new Producto();
        producto4.nombre = "Uvas";
        producto4.precio = 4.5;
        producto4.cantidad = 400;
        producto4.sku = "1121";

        Producto producto5 = new Producto();
        producto5.nombre = "Fresas";
        producto5.precio = 5.5;
        producto5.cantidad = 500;
        producto5.sku = "3141";

        Producto producto6 = new Producto();
        producto6.nombre = "Platanos";
        producto6.precio = 6.5;
        producto6.cantidad = 600;
        producto6.sku = "5161";

        Producto producto7 = new Producto();
        producto7.nombre = "Naranjas";
        producto7.precio = 7.5;
        producto7.cantidad = 700;
        producto7.sku = "7181";

        Producto producto8 = new Producto();
        producto8.nombre = "Mangos";
        producto8.precio = 8.5;
        producto8.cantidad = 800;
        producto8.sku = "9201";

        ArrayList<Producto> productos = new ArrayList<>();
        productos.add(producto1);
        productos.add(producto2);
        productos.add(producto3);
        productos.add(producto4);
        productos.add(producto5);
        productos.add(producto6);
        productos.add(producto7);
        productos.add(producto8);



        Scanner scanner = new Scanner(System.in);
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
                    System.out.println("Información de la tienda 1");
                    System.out.println("Dirección: " + tienda1.direccion);
                    System.out.println("Teléfono: " + tienda1.telefono);
                    System.out.println("Información de la tienda 2");
                    System.out.println("Dirección: " + tienda2.direccion);
                    System.out.println("Teléfono: " + tienda2.telefono);
                    System.out.println("-----------------------------------");
                    System.out.println("Tiendas disponibles: " + tienda1.direccion + ", " + tienda2.direccion);
                    break;
                case 2:
                    System.out.println("Información del trabajador 1");
                    System.out.println("Nombre: " + trabajador1.nombre);
                    System.out.println("Apellido: " + trabajador1.apellido);
                    System.out.println("Dirección: " + trabajador1.direccion);
                    System.out.println("Teléfono: " + trabajador1.telefono);
                    System.out.println("Tienda: " + trabajador1.tienda.direccion);
                    System.out.println("-----------------------------------");
                    System.out.println("Información del trabajador 2");
                    System.out.println("Nombre: " + trabajador2.nombre);
                    System.out.println("Apellido: " + trabajador2.apellido);
                    System.out.println("Dirección: " + trabajador2.direccion);
                    System.out.println("Teléfono: " + trabajador2.telefono);
                    System.out.println("Tienda: " + trabajador2.tienda.direccion);
                    System.out.println("-----------------------------------");
                    System.out.println("Información del trabajador 3");
                    System.out.println("Nombre: " + trabajador3.nombre);
                    System.out.println("Apellido: " + trabajador3.apellido);
                    System.out.println("Dirección: " + trabajador3.direccion);
                    System.out.println("Teléfono: " + trabajador3.telefono);
                    System.out.println("Tienda: " + trabajador3.tienda.direccion);
                    System.out.println("-----------------------------------");
                    System.out.println("Información del trabajador 4");
                    System.out.println("Nombre: " + trabajador4.nombre);
                    System.out.println("Apellido: " + trabajador4.apellido);
                    System.out.println("Dirección: " + trabajador4.direccion);
                    System.out.println("Teléfono: " + trabajador4.telefono);
                    System.out.println("Tienda: " + trabajador4.tienda.direccion);
                    System.out.println("-----------------------------------");
                    System.out.println("Tiendas disponibles: " + tienda1.direccion + ", " + tienda2.direccion);

                    break;
                case 3:
                    // Aquí va el código para mostrar los productos disponibles
                    System.out.println("Productos disponibles:");
                    System.out.println("Producto 1:");
                    System.out.println("Nombre: " + producto1.nombre);
                    System.out.println("Precio: " + producto1.precio);
                    System.out.println("Cantidad: " + producto1.cantidad);
                    System.out.println("SKU: " + producto1.sku);
                    System.out.println("-----------------------------------");
                    System.out.println("Producto 2:");
                    System.out.println("Nombre: " + producto2.nombre);
                    System.out.println("Precio: " + producto2.precio);
                    System.out.println("Cantidad: " + producto2.cantidad);
                    System.out.println("SKU: " + producto2.sku);
                    System.out.println("-----------------------------------");
                    System.out.println("Producto 3:");
                    System.out.println("Nombre: " + producto3.nombre);
                    System.out.println("Precio: " + producto3.precio);
                    System.out.println("Cantidad: " + producto3.cantidad);
                    System.out.println("SKU: " + producto3.sku);
                    System.out.println("-----------------------------------");
                    System.out.println("Producto 4:");
                    System.out.println("Nombre: " + producto4.nombre);
                    System.out.println("Precio: " + producto4.precio);
                    System.out.println("Cantidad: " + producto4.cantidad);
                    System.out.println("SKU: " + producto4.sku);
                    System.out.println("-----------------------------------");
                    System.out.println("Producto 5:");
                    System.out.println("Nombre: " + producto5.nombre);
                    System.out.println("Precio: " + producto5.precio);
                    System.out.println("Cantidad: " + producto5.cantidad);
                    System.out.println("SKU: " + producto5.sku);
                    System.out.println("-----------------------------------");
                    System.out.println("Producto 6:");
                    System.out.println("Nombre: " + producto6.nombre);
                    System.out.println("Precio: " + producto6.precio);
                    System.out.println("Cantidad: " + producto6.cantidad);
                    System.out.println("SKU: " + producto6.sku);
                    System.out.println("Producto 7:");
                    System.out.println("Nombre: " + producto7.nombre);
                    System.out.println("Precio: " + producto7.precio);
                    System.out.println("Cantidad: " + producto7.cantidad);
                    System.out.println("SKU: " + producto7.sku);
                    System.out.println("-----------------------------------");
                    System.out.println("Producto 8:");
                    System.out.println("Nombre: " + producto8.nombre);
                    System.out.println("Precio: " + producto8.precio);
                    System.out.println("Cantidad: " + producto8.cantidad);
                    System.out.println("SKU: " + producto8.sku);
                    System.out.println("-----------------------------------");
                    System.out.println("Tiendas disponibles: " + tienda1.direccion + ", " + tienda2.direccion);

                    break;
                case 4:
                    // Aquí va el código para mostrar los últimos 3 productos añadidos
                    System.out.println("Últimos 3 productos añadidos:");
                    System.out.println("Producto 6:");
                    System.out.println("Nombre: " + producto6.nombre);
                    System.out.println("Precio: " + producto6.precio);
                    System.out.println("Cantidad: " + producto6.cantidad);
                    System.out.println("SKU: " + producto6.sku);
                    System.out.println("-----------------------------------");
                    System.out.println("Producto 7:");
                    System.out.println("Nombre: " + producto7.nombre);
                    System.out.println("Precio: " + producto7.precio);
                    System.out.println("Cantidad: " + producto7.cantidad);
                    System.out.println("SKU: " + producto7.sku);
                    System.out.println("-----------------------------------");
                    System.out.println("Producto 8:");
                    System.out.println("Nombre: " + producto8.nombre);
                    System.out.println("Precio: " + producto8.precio);
                    System.out.println("Cantidad: " + producto8.cantidad);
                    System.out.println("SKU: " + producto8.sku);
                    System.out.println("-----------------------------------");
                    System.out.println("Tiendas disponibles: " + tienda1.direccion + ", " + tienda2.direccion);

                    break;
                case 5:
                    // Aquí va el código para comprar productos
                    System.out.println("Comprando productos...");
                    System.out.println("Ingrese el SKU del producto que desea comprar: ");
                    String sku = scanner.next();
                    System.out.println("Ingrese la cantidad que desea comprar: ");
                    int cantidad = scanner.nextInt();
                    for (Producto producto : productos) {
                        if (producto.sku.equals(sku)) {
                            if (producto.cantidad >= cantidad) {
                                System.out.println("Compra exitosa!");
                                System.out.println("Tiendas disponibles: " + tienda1.direccion + ", " + tienda2.direccion);
                                producto.cantidad -= cantidad;
                            } else {
                                System.out.println("No hay suficiente cantidad de este producto.");
                            }
                            break;
                        }
                    }
                    break;
                case 6:
                    System.out.println("Saliendo...");
                    System.exit(0);
                default:
                    System.out.println("Opción no válida. Por favor, intente de nuevo.");
            }
        }
    }



}