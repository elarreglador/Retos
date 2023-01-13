/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Retos.R01Tenis;

/**
 *
 * @author arreglador
 *
 * Escribe un programa que muestre cómo transcurre un juego de tenis y quién lo ha ganado.
 * El programa recibirá una secuencia formada por "P1" (Player 1) o "P2" (Player 2), según quien
 * gane cada punto del juego.
 * 
 * - Las puntuaciones de un juego son "Love" (cero), 15, 30, 40, "Deuce" (empate), ventaja.
 * - Ante la secuencia [P1, P1, P2, P2, P1, P2, P1, P1], el programa mostraría lo siguiente:
 *   15 - Love
 *   30 - Love
 *   30 - 15
 *   30 - 30
 *   40 - 30
 *   Deuce
 *   Ventaja P1
 *   Ha ganado el P1
 * - Si quieres, puedes controlar errores en la entrada de datos.   
 * - Consulta las reglas del juego si tienes dudas sobre el sistema de puntos.   
 */
public class R01Tenis {
    public static void main (String[] args){
        String secuencia = "P1,P1,P2,P2,P1,P2,P1,P1";
        String sec[] = new String[Separa(secuencia).length];
        Marcador marcador = new Marcador();
        
        sec = Separa(secuencia);
        
        for (String juego:sec){
            System.out.print(juego+": ");
            if (juego.equalsIgnoreCase("P1")){
                marcador.Puntua(0);
            } else {
                marcador.Puntua(1);
            }
            System.out.println(marcador.ToString());
        }

                
    }
    
    //devuelve en un array cada una de las victorias de la secuencia
    public static String[] Separa(String secuencia){
        return secuencia.split(",", 0);
    }
}