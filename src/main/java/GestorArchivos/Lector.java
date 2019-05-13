package GestorArchivos;

import ContextoProblema.Cancion;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author JonathanLizama
 */
public class Lector {

      private ArrayList<Cancion> cancion = new ArrayList();

      public Lector() {
            agregarCancion(identificador(), "Put You on the Game", "The Game", "The Documentary", "2005", leerLetraCancion("put_you_on_the_game.txt"));
            agregarCancion(identificador(), "Dreams", "The Game", "The Documentary", "2015", leerLetraCancion("dreams.txt"));
            agregarCancion(identificador(), "Space Bound", "Eminem", "Recovery", "2010", leerLetraCancion("space_bound.txt"));
            agregarCancion(identificador(), "Maquiavelico", "Canserbero", "Merte", "2012", leerLetraCancion("maquavelico.txt"));

      }

      private int identificador() {
            return cancion.size() + 1;
      }

      private void agregarCancion(int identificador, String nombre, String artista, String album, String año, String letra) {
            cancion.add(new Cancion(identificador, nombre, artista, album, año, letra));
      }

      private String leerLetraCancion(String ruta) {
            Path directorio = Paths.get(ruta);
            String texto = "";
            try {
                  texto = new String(Files.readAllBytes(directorio));
            } catch (IOException e) {
                  System.out.println(e);
                  System.out.println("El archivo no pudo ser leido | verifique la ruta introducida");

            }
            return texto;
      }

      public String nombreCancion() {
            Scanner leer = new Scanner(System.in);
            System.out.println("Ingrese el nombre de la canción: ");
            return leer.nextLine();
      }

      public String nombreInterprete() {
            Scanner leer = new Scanner(System.in);
            System.out.println("Ingrese el nombre del interprete: ");
            return leer.nextLine();
      }

      public String nombreAlbum() {
            Scanner leer = new Scanner(System.in);
            System.out.println("Ingrese el nombre del album: ");
            return leer.nextLine();
      }

      public String añoLanzamiento() {
            Scanner leer = new Scanner(System.in);
            System.out.println("Ingrese el año de lanzamiento: ");
            return leer.nextLine();
      }
       public String letraCancion() {
            Scanner leer = new Scanner(System.in);
            System.out.println("Ingrese letra de la canción: ");
            return leer.nextLine();
      }

      public void mostrarCanciones() {
            for (int i = 0; i < this.cancion.size(); i++) {
                  System.out.println("Identificador: " + this.cancion.get(i).getIdentificador());
                  System.out.println("Nombre: " + this.cancion.get(i).getNombre());
                  System.out.println("Interprete: " + this.cancion.get(i).getInterprete());
                  System.out.println("Album: " + this.cancion.get(i).getNombreAlbum());
                  System.out.println("Año lanzamiento: " + this.cancion.get(i).getAñoLanzamiento());
                  System.out.println("Letra: " + this.cancion.get(i).getLetra());
                  System.out.println();
            }
      }

      public void crearCancion() {
            int codigo = cancion.size() + 1;
            String nombre = nombreCancion();
            System.out.println("Ingrese nombre del artista");
            String artista = nombreInterprete();
            System.out.println("Ingrese album de la canción");
            String album = nombreAlbum();
            System.out.println("Ingrese el año de la canción");
            String año = añoLanzamiento();
            System.out.println("Ingrese letra de la canción");
            String letra = letraCancion();
            agregarCancion(codigo, nombre, artista, album, año, letra);
      }

}
