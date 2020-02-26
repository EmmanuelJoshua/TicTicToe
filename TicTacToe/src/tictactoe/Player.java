/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;

import java.lang.reflect.Field;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Spark
 */
class Player<X> {

    X player;

    public Player(X player) {
        this.player = player;
    }

    public boolean isPlayerX() {
        boolean flag = false;
        try {
            Field playerField = player.getClass().getDeclaredField("player");

            Object playerValue = playerField.get(player);

            flag = playerValue.equals("PlayerX");
        } catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException ex) {
            Logger.getLogger(Player.class.getName()).log(Level.SEVERE, null, ex);
        }

        return flag;
    }

    public boolean isPlayerO() {
        boolean flag = false;
        try {
            Field playerField = player.getClass().getDeclaredField("player");

            Object playerValue = playerField.get(player);

            flag = playerValue.equals("PlayerO");
        } catch (NoSuchFieldException | SecurityException | IllegalArgumentException | IllegalAccessException ex) {
            Logger.getLogger(Player.class.getName()).log(Level.SEVERE, null, ex);
        }
        return flag;
    }

}
