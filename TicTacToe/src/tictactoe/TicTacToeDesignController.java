/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;

import com.jfoenix.controls.JFXButton;
import de.jensd.fx.glyphs.fontawesome.FontAwesomeIconView;
import java.lang.reflect.Field;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.animation.FadeTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.util.Duration;

/**
 *
 * @author Spark
 */
public class TicTacToeDesignController implements Initializable {

    @FXML
    private JFXButton cellOne;

    @FXML
    private JFXButton cellTwo;

    @FXML
    private JFXButton cellThree;

    @FXML
    private JFXButton cellFour;

    @FXML
    private JFXButton cellFive;

    @FXML
    private JFXButton cellSix;

    @FXML
    private JFXButton cellSeven;

    @FXML
    private JFXButton cellEight;

    @FXML
    private JFXButton cellNine;

    @FXML
    private JFXButton playerO;

    @FXML
    private JFXButton playerX;

    @FXML
    private StackPane choosePlayer;

    @FXML
    private ImageView cellImageOne;
    @FXML
    private ImageView cellImageTwo;
    @FXML
    private ImageView cellImageThree;
    @FXML
    private ImageView cellImageFour;
    @FXML
    private ImageView cellImageFive;
    @FXML
    private ImageView cellImageSix;
    @FXML
    private ImageView cellImageSeven;
    @FXML
    private ImageView cellImageEight;
    @FXML
    private ImageView cellImageNine;
    @FXML
    private FontAwesomeIconView currentPlayer;

    boolean flag = true;

    Image first;
    Image second;

    Object obj = new Object();

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        cellOne.setOnAction(this::click);
        cellTwo.setOnAction(this::click);
        cellThree.setOnAction(this::click);
        cellFour.setOnAction(this::click);
        cellFive.setOnAction(this::click);
        cellSix.setOnAction(this::click);
        cellSeven.setOnAction(this::click);
        cellEight.setOnAction(this::click);
        cellNine.setOnAction(this::click);

        playerO.setOnAction(this::checkFirstPlayer);
        playerX.setOnAction(this::checkFirstPlayer);

    }

    public void initializePlayers(Object playerDef) {
        Player<Object> player = new Player<>(playerDef);
        boolean isX = player.isPlayerX();
        boolean isO = player.isPlayerO();
        if (isX) {
            currentPlayer.setVisible(true);
            currentPlayer.setLayoutX(415);
            currentPlayer.setLayoutY(18);
            first = PlayerX.getXImage();
            second = PlayerO.getOImage();
        } else if (isO) {
            currentPlayer.setVisible(true);
            currentPlayer.setLayoutX(61);
            currentPlayer.setLayoutY(18);
            first = PlayerO.getOImage();
            second = PlayerX.getXImage();
        }
    }

    @FXML
    public void checkFirstPlayer(ActionEvent event) {
        PlayerX playerX1 = new PlayerX();
        PlayerO playerO1 = new PlayerO();

        if (event.getSource().equals(playerO)) {
            obj = playerO1;
            FadeTransition fade3 = new FadeTransition();
            fade3.setDuration(Duration.millis(300));
            fade3.setNode(choosePlayer);
            fade3.setFromValue(1);
            fade3.setToValue(0);
            fade3.play();
            fade3.setOnFinished((ActionEvent event1) -> {
                choosePlayer.setVisible(false);
            });
            System.out.println("PlayerO");
        } else if (event.getSource().equals(playerX)) {
            obj = playerX1;
            FadeTransition fade3 = new FadeTransition();
            fade3.setDuration(Duration.millis(300));
            fade3.setNode(choosePlayer);
            fade3.setFromValue(1);
            fade3.setToValue(0);
            fade3.play();
            fade3.setOnFinished((ActionEvent event1) -> {
                choosePlayer.setVisible(false);
            });
            System.out.println("PlayerX");
        }

        initializePlayers(obj);
    }

    public void click(ActionEvent event) {

        if (event.getSource().equals(cellOne)) {
            toggleXO(cellOne, cellImageOne);
        } else if (event.getSource().equals(cellTwo)) {
            toggleXO(cellTwo, cellImageTwo);
        } else if (event.getSource().equals(cellThree)) {
            toggleXO(cellThree, cellImageThree);
        } else if (event.getSource().equals(cellFour)) {
            toggleXO(cellFour, cellImageFour);
        } else if (event.getSource().equals(cellFive)) {
            toggleXO(cellFive, cellImageFive);
        } else if (event.getSource().equals(cellSix)) {
            toggleXO(cellSix, cellImageSix);
        } else if (event.getSource().equals(cellSeven)) {
            toggleXO(cellSeven, cellImageSeven);
        } else if (event.getSource().equals(cellEight)) {
            toggleXO(cellEight, cellImageEight);
        } else if (event.getSource().equals(cellNine)) {
            toggleXO(cellNine, cellImageNine);
        }

    }

    @FXML
    public void clearBoard(ActionEvent event) {
        cellImageOne.setImage(null);
        cellOne.setMouseTransparent(false);
        cellImageTwo.setImage(null);
        cellTwo.setMouseTransparent(false);
        cellImageThree.setImage(null);
        cellThree.setMouseTransparent(false);
        cellImageFour.setImage(null);
        cellFour.setMouseTransparent(false);
        cellImageFive.setImage(null);
        cellFive.setMouseTransparent(false);
        cellImageSix.setImage(null);
        cellSix.setMouseTransparent(false);
        cellImageSeven.setImage(null);
        cellSeven.setMouseTransparent(false);
        cellImageEight.setImage(null);
        cellEight.setMouseTransparent(false);
        cellImageNine.setImage(null);
        cellNine.setMouseTransparent(false);
    }

    public void toggleXO(JFXButton cell, ImageView img) {
        if (flag) {
//            currentPlayer.setLayoutX(415);
//            currentPlayer.setLayoutY(18);
            img.setImage(first);
            cell.setMouseTransparent(true);
            flag = false;
        } else if (!flag) {
//            currentPlayer.setLayoutX(61);
//            currentPlayer.setLayoutY(18);
            img.setImage(second);
            cell.setMouseTransparent(true);
            flag = true;
        }
    }

    @FXML
    public void checkWin(ActionEvent event) {
        
    }

    public void checkMoves() {
        if (cellImageOne.getImage() != null && cellImageTwo.getImage() != null && cellImageThree.getImage() != null) {
            System.out.println("Out of moves!");
        }
    }
}
