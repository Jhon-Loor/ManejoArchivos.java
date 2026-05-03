import java.io.File;
import java.util.Scanner;

public class Productos {
    public static void main(String[] args) throws Exception {
        File archivo = new File("productos.txt");
        Scanner sc = new Scanner(archivo);

        String nombre, productoMayor = "";
        double precio, subtotal, mayor = 0, total = 0;
        int cantidad;

        while (sc.hasNext()) {
            nombre = sc.next();
            precio = sc.nextDouble();
            cantidad = sc.nextInt();

            subtotal = precio * cantidad;

            System.out.println("Producto: " + nombre);
            System.out.println("Subtotal: " + subtotal);
            System.out.println("------------------");

            total += subtotal;

            if (subtotal > mayor) {
                mayor = subtotal;
                productoMayor = nombre;
            }
        }

        System.out.println("Total general: " + total);
        System.out.println("Producto con mayor venta: " + productoMayor);

        sc.close();
    }
}

