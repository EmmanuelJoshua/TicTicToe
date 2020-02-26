/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;

/**
 *
 * @author Spark
 */
public final class FirstPlayerLogic {

    static Player<Object> player;
    static Object firstPlayer;

    public static void checkFirstPlayer(Object obj) {
        player = new Player(obj);

        if (player.isPlayerO()) {
            firstPlayer = new PlayerO();
            System.out.println("PlayerO");
        } else if (player.isPlayerX()) {
            firstPlayer = new PlayerX();
            System.out.println("PlayerX");
        }
    }

    public void toggleNextPlayer() {
        if (firstPlayer == new PlayerO()) {
            firstPlayer = new PlayerX();
        } else if (firstPlayer == new PlayerX()) {
            firstPlayer = new PlayerO();
        }
    }
    
    public static void main(String[]args){
        checkFirstPlayer(new PlayerO());
    }

}
