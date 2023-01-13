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
        String secuencia = "P1,p2,P1,P1,P1,P2,P2,P2,P2";
        String sec[] = new String[Separa(secuencia).length];
        Marcador marcador = new Marcador();
        
        sec = Separa(secuencia);
        
        for (String juego:sec){
            System.out.print(juego+": ");
            if (juego.equalsIgnoreCase("P1")){
                marcador.Puntua(0);
            } else if (juego.equalsIgnoreCase("P2")){
                marcador.Puntua(1);
            } else {
                System.out.println("ERROR: localizado en main, juego = "+juego);
            }
            
            System.out.println(marcador.ToString());
        }

                
    }
    
    //Verifica que la secuencia se avalida y la devuelve en forma de array
    public static String[] Separa(String secuencia){
        secuencia=secuencia.toUpperCase();
        String[] retorno = new String[secuencia.split(",", 0).length];
        retorno = secuencia.split(",", 0);
        for (String valor:retorno){
            if (!valor.equals("P1")&&!valor.equals("P2")){
                System.out.println("Error en la secuencia. valor = "+valor);
            } 
        }
        return retorno;
    }
}