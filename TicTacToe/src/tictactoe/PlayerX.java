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
public class PlayerX {

    static int score;
    String player = "PlayerX";
    static Image xImage = new Image("/tictactoe/images/x.png");

    public static Image getXImage() {
        return xImage;
    }
    
    public void incrementXScore(){
        score++;
    }
    
    public static int getXScore(){
        return score;
    }
}
