
package principal;

import java.util.Scanner;

public class CuentaBancaria {
    
     // === PARTE 1: Variables privadas ===
    private String titular;
    private double saldo;

    // === PARTE 2: Constructor personalizado ===
    public CuentaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
        System.out.println("Bienvenido/a, " + titular + " a su cuenta bancaria.");
    }

    // === PARTE 3: ÚNICO método público llamado desde main ===
    public void iniciar() {
        menu();
    }

    // === PARTE 4: Método privado del menú ===
    private void menu() {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n=== MENU PRINCIPAL ===");
            System.out.println("1. Abonar dinero");
            System.out.println("2. Retirar dinero");
            System.out.println("3. Mostrar saldo");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opcion: ");

            while (!sc.hasNextInt()) {
                System.out.println("Entrada invalida.");
                sc.next();
            }
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    abonar(sc);
                    break;
                case 2:
                    retirar(sc);
                    break;
                case 3:
                    System.out.println("Saldo actual: $" + saldo);
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no valida.");
            }

        } while (opcion != 4);
    }

    // === PARTE 5: Método privado para abonar ===
    private void abonar(Scanner sc) {
        System.out.print("Ingrese monto a abonar: ");

        while (!sc.hasNextDouble()) {
            System.out.println("Monto invalido.");
            sc.next();
        }

        double monto = sc.nextDouble();

        if (monto <= 0) {
            System.out.println("El abono debe ser mayor que cero.");
        } else {
            saldo += monto;
            System.out.println("Abono exitoso. Nuevo saldo: $" + saldo);
        }
    }

    // === PARTE 6: Método privado para retirar ===
    private void retirar(Scanner sc) {
        System.out.print("Ingrese monto a retirar: ");

        while (!sc.hasNextDouble()) {
            System.out.println("Monto inválido.");
            sc.next();
        }

        double monto = sc.nextDouble();

        if (monto <= 0) {
            System.out.println("El retiro debe ser mayor que cero.");
        } else if (monto > saldo) {
            System.out.println("No tiene saldo suficiente.");
        } else {
            saldo -= monto;
            System.out.println("Retiro exitoso. Nuevo saldo: $" + saldo);
        }
    }
}
