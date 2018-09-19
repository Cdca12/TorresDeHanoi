/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package torresdehanoi;

public class Recursividad {

    static int contador = 0;

    public static void hanoi(char torreIncial, char torreCentral, char torreFinal, int numeroDiscos) {

        if (numeroDiscos == 1) {
            contador++;
            System.out.println("Movimiento " + contador + " | Se mueve disco " + numeroDiscos
                    + " de la torre " + torreIncial
                    + " a la torre " + torreFinal);
            return;
        }
        hanoi(torreIncial, torreFinal, torreCentral, numeroDiscos - 1);
        contador++;
        System.out.println("Movimiento " + contador + " | Se mueve disco " + numeroDiscos
                + " de la torre " + torreIncial
                + " a la torre " + torreFinal);
        hanoi(torreCentral, torreIncial, torreFinal, numeroDiscos - 1);
    }

}
