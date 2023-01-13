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
    int player0;
    int player1;
    
    public Marcador(){
        player0 = 0;
        player1 = 0;
    }
    
    public void Puntua (int player){
        if (player==0){
            player0++;
            if (player1==4){
                player1--;
            }
        } else {
            player1++;
            if (player0==4){
                player0--;
            }
        }
    }
    
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
