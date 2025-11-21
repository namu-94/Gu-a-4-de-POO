
package mis_pasatiempos;

public class Mis_Pasatiempos {

    public static void main(String[] args) {
        //Instancia con Constructor por omisión
        new Pasatiempos();

        // (Anime)
        new Pasatiempos("Busu ni Hanataba wo");

        //(Música)
        new Pasatiempos("Run", "BTS");

        //(VideoJuego)
        new Pasatiempos("Honor of Kings", 2024);

        // Instanciación de Clase Datos_Privados
        Datos_Privados estudiante = new Datos_Privados();

        // Asignar valores a las variables
        estudiante.setNombre("Rosa Silva");
        estudiante.setCarnet("25-2265-2025");

        System.out.println("\n--- Datos del Estudiante ---");
        System.out.println("Nombre: " + estudiante.getNombre() + "\n Carnet: " + estudiante.getCarnet());
        System.out.println("--------------------------");
    }
    }

