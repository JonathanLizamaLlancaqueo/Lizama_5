/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GestorArchivos;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author JonathanLizama
 */
public class Menu {

      Lector lec = new Lector();

      public Menu() {

            boolean salir = false;
            while (!salir) {
                  System.out.println("------------------------------------------------------------------------");
                  System.out.println("Bienvenido al Administrador de música");
                  System.out.println("------------------------------------------------------------------------");

                  System.out.println("[1].-|Moostrar Canciones | ");
                  System.out.println("[2].-|Añadir Canción| ");
                  System.out.println("[3].- |Eliminar Canción|");

                  int opcion = leerEntero();
                  switch (opcion) {
                        case 1: {

                              lec.mostrarCanciones();

                              break;
                        }
                        case 2: {
                              lec.crearCancion();
                            
                              break;
                        }
                        case 3: {

                              break;
                        }
                        case 4: {

                              salir = true;
                              break;
                        }
                        default:
                              System.out.println("Ingrese una opción correcta...");
                              break;
                  }
            }
      }

      /**
       * Función que lee un numero entero.
       *
       * @return [número] si el número el entero ,ó [-1] si es cualquier otra cosa .
       *
       */
      private int leerEntero() {

            Scanner leer = new Scanner(System.in);
            int num;
            try {
                  do {
                        System.out.println("");
                        System.out.println("Ingrese una opción: ");
                        num = leer.nextInt();
                  } while (num < 1);
                  return num;
            } catch (InputMismatchException e) {
                  System.out.println(e);
                  System.out.println("Ingrese un valor de acuerdo al tipo");
                  return -1;
            }
      }

}
