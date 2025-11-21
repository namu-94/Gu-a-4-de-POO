
package principal;

public class Principal {

    public static void main(String[] args) {

        // Instanciar la cuenta (sin usar estáticos, sin estructuras de datos)
        CuentaBancaria cuenta = new CuentaBancaria("Monica Diaz", 1000);

        // ÚNICO método que se puede llamar → iniciar()
        cuenta.iniciar();
    }
    }
    
