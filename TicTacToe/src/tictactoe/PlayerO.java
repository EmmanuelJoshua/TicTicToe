/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;

import javafx.scene.image.Image;

/**
 *
 * @author Spark
 */
public class PlayerO {

    static int score;
    String player = "PlayerO";
    static Image oImage = new Image("/tictactoe/images/o.png");

    public static Image getOImage() {
        return oImage;
    }
    
    public void incrementOScore(){
        score++;
    }
    
    public static int getOScore(){
        return score;
    }
}
