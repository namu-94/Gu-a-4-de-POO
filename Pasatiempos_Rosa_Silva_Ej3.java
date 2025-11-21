
package mis_pasatiempos;

public class Pasatiempos {
    // Constructor por omisión
    public Pasatiempos() {
        System.out.println("----------Bienvenid@----------");
        System.out.println("Un gusto te dire algunos de mis pasatiempos ^^.");
        System.out.println("-----------------------------");
    }

    // Constructor personalizado de mi Anime Favorito
    public Pasatiempos(String anime) {
        System.out.println("Mi pasatiempo favorito es ver animes.");
        System.out.println("Actualmente, mi serie favorita es: " + anime + " del 2025");
    }

    // Constructor personalizado de Canción y Artista favorito
    public Pasatiempos(String cancion, String artista) {
        System.out.println("Me encanta escuchar musica mientras hago mis actividades diarias.");
        System.out.println("Mi cancion favorita es: " + cancion + " de " + artista + " del 2016.");
    }

    // Constructor personalizado VideoJuego favorito
    public Pasatiempos(String VideoJuego, int año ) {
        System.out.println("Uno de mis VideoJuegos favoritos.");
        System.out.println("Me gusta jugar: " + VideoJuego + " del " + año);
    }
}
