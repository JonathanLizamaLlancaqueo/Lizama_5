package ContextoProblema;

/**
 *
 * @author JonathanLizama
 */
public class Cancion {

      //Atributos de la clase canción.
      private int identificador;
      private String nombre;
      private String interprete;
      private String nombreAlbum;
      private String añoLanzamiento;
      private String letra;

     

      public Cancion() {
      }

      public Cancion(int identificador, String nombre, String interprete, String nombreAlbum, String añoLanzamiento, String letra) {
            this.identificador = identificador;
            this.nombre = nombre;
            this.interprete = interprete;
            this.nombreAlbum = nombreAlbum;
            this.añoLanzamiento = añoLanzamiento;
            this.letra = letra;

      }

      // metodo get para cada atributo
      public int getIdentificador() {
            return identificador;
      }

      public String getNombre() {
            return nombre;
      }

      public String getInterprete() {
            return interprete;
      }

      public String getNombreAlbum() {
            return nombreAlbum;
      }

      public String getAñoLanzamiento() {
            return añoLanzamiento;
      }
       public String getLetra() {
            return letra;
      }

      // metodo set para cada atributo
      public void setIdentificador(int identificador) {
            this.identificador = identificador;
      }

      public void setNombre(String nombre) {
            this.nombre = nombre;
      }

      public void setInterprete(String interprete) {
            this.interprete = interprete;
      }

      public void setNombreAlbum(String nombreAlbum) {
            this.nombreAlbum = nombreAlbum;
      }

      public void setAñoLanzamiento(String añoLanzamiento) {
            this.añoLanzamiento = añoLanzamiento;
      }
}
