
package tiendaaa;

import java.util.Scanner;
public class Productos {
     private String nombre;
    private double precio;
    private int cantidad;

    Scanner sc = new Scanner(System.in);

    // mensaje de bienvenida
    public Productos(String nombre, double precio, int cantidad) {
        System.out.println("Bienvenido al sistema de gestion de productos.");
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        if (precio >= 0) {
            this.precio = precio;
        } else {
            System.out.println("El precio no puede ser negativo.");
        }
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        if (cantidad >= 0) {
            this.cantidad = cantidad;
        } else {
            System.out.println("La cantidad no puede ser menor a 0.");
        }
    }

    //  modificar datos
    private void modificarDatos() {

        int opcion;

        do {
            System.out.println("--Modificar datos --");
            System.out.println("1. Modificar nombre");
            System.out.println("2. Modificar precio");
            System.out.println("3. Modificar cantidad");
            System.out.println("4. Regresar al menu principal");
            System.out.print("Seleccione una opcion: ");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {

                case 1:
                    System.out.print("Ingrese el nuevo nombre: ");
                    setNombre(sc.nextLine());
                    break;

                case 2:
                    System.out.print("Ingrese el nuevo precio: ");
                    setPrecio(sc.nextDouble());
                    break;

                case 3:
                    System.out.print("Ingrese la nueva cantidad: ");
                    setCantidad(sc.nextInt());
                    break;

                case 4:
                    System.out.println("Regresando al menu principal..");
                    break;

                default:
                    System.out.println("Opcion no valida.");
            }

        } while (opcion != 4);
    }

    // Mostrar datos
    private void mostrarDatos() {
        System.out.println("- Informacion del producto --");
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: " + precio);
        System.out.println("Cantidad: " + cantidad);
    }

    // Menú principal
    public void menuPrincipal() {

        int opcion;

        do {
            System.out.println("--Menu principal: ");
            System.out.println("1. Modificar datos del producto");
            System.out.println("2. Mostrar datos");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opcion: ");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {

                case 1:
                    modificarDatos();
                    break;

                case 2:
                    mostrarDatos();
                    break;

                case 3:
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("Opcion no valida.");
            }

        } while (opcion != 3);
    }
    
}
