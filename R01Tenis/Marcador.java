/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Retos.R01Tenis;

/**
 *
 * @author arreglador
 */
public class Marcador {
    //puntuaciones de ambos jugadores (P1=player0 y P2=player1)
    int player0;
    int player1;
    
    //constructor del objeto Marcador
    public Marcador(){
        player0 = 0;
        player1 = 0;
    }
    
    /*
    Puntua() gestiona los puntos de cada jugador:
    por motivos practicos se emplea esta tabla de puntuacion - valor
    
    love (0) - 0
    15 - 1
    30 - 2
    40 - 3
    ventaja - 4
    juego (gana) - 5

    si cuando uno de los jugadores tiene ventaja (==4), el otro puntua, su puntuacion
    pasa a ser de nuevo de 40 puntos
    */
    public void Puntua (int player){
        if (player==0){
            player0++;
            if (player1==4){
                player1--;
            }
        } else if (player==1){
            player1++;
            if (player0==4){
                player0--;
            }
        } else {
            System.out.println("ERROR: localizado en Puntua("+player+")");
        }
    }
    
    // Hace peticion de traducir ToHuman() e indica si hay ventaja o si ha ganado un jugador
    public String ToString(){
        String retorno;
        retorno = this.ToHuman(player0)+" - "+ this.ToHuman(player1);
        if ((player0==3)&&(player1==3)){ //empate a 40 (deuce)
            retorno = "deuce";
        }
        
        if (player0==4){ //uno de los jugadores obtiene ventaja
            retorno = "Ventaja P1";
        } else if (player1==4){
            retorno = "Ventaja P2";
        }
        
        if (player0==5){ //ha ganado uno de los jugadores
            retorno = "Ha ganado el P1";
        } else if (player1==5){
            retorno = "Ha ganado el P2";
        }
        
        return retorno;
    }
    
    // Convierte los valores de puntuacion 1-5 en valores 'tenisticos'.
    public String ToHuman(int valor){
        String retorno = switch (valor){
            case 0 -> "love";
            case 1 -> "15";
            case 2 -> "30";
            case 3 -> "40";
            case 4 -> "add";
            default -> "win";
        };
        return retorno;
    }
}
