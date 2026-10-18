package negocio;

import java.util.Scanner;

public class Pruebafactura {
    public static void main() {
        Scanner entrada = new Scanner(System.in);

        System.out.print("> Numero de pieza: ");
        String numero = entrada.nextLine();
        while (numero == null || numero.isBlank()) {
            System.out.print("No puede estar vacio. Numero de pieza: ");
            numero = entrada.nextLine();
        }

        System.out.print("> Descripcion: ");
        String descripcion = entrada.nextLine();
        while (descripcion == null || descripcion.isBlank()) {
            System.out.print("No puede estar vacia. Descripcion: ");
            descripcion = entrada.nextLine();
        }

        System.out.print("> Cantidad: ");
        int cantidad = entrada.nextInt();

        System.out.print("> Precio por artículo: ");
        double precio = entrada.nextDouble();

        Factura factura = new Factura(numero, descripcion, cantidad, precio);

        System.out.println("\n=== DATOS DE LA FACTURA ===");
        mostrar(factura);

        System.out.println("--------------------------------");
        System.out.println("=== PRUEBAS DE VALIDACIONES ===");
        System.out.println("\n--- Probando cantidad y precio no positivos ---");
        factura.setCantidad(-5);
        factura.setPrecio(-2.5);
        mostrar(factura);

        System.out.println("\n--- Probando descripcion en blanco ---");
        factura.setDescripcion("   ");
        System.out.println("Descripcion actual: " + factura.getDescripcion());

        System.out.println("\n--- Nuevos valores validos ---");
        factura.setCantidad(10);
        factura.setPrecio(3.75);
        mostrar(factura);

        entrada.close();
    }

    public static void mostrar(Factura f) {
        System.out.println("Pieza: " + f.getNumeroPieza());
        System.out.println("Descripcion: " + f.getDescripcion());
        System.out.println("Cantidad: " + f.getCantidad());
        System.out.println("Precio: $" + f.getPrecio());
        System.out.println("Monto de la factura: $" + f.getMontoFactura());
    }

}