
/**
 * 
 *  HINT : This class Has become bloated and unmanagable , its better to split this class into multiple ones
 *  in future version.This class has also has too much repetition has listener/event handling codes.
 */

package com.lxisoft.view.controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.*;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.ImageView;
import javafx.scene.paint.*;
import javafx.scene.control.ToolBar;
import javafx.geometry.Insets;
import javafx.util.*;

import com.lxisoft.controller.GameInitController;
import com.lxisoft.model.Board;
import com.lxisoft.model.Ladder;
import com.lxisoft.model.Player;
import com.lxisoft.model.Snake;
import com.lxisoft.view.util.*;

import javafx.fxml.FXML;
import javafx.scene.layout.*;
import javafx.event.*;
import javafx.scene.input.*;
import javafx.stage.Window;
import javafx.animation.*;
import javafx.animation.PathTransition.*;
import javafx.scene.effect.*;
import javafx.scene.canvas.*;
import javafx.scene.image.Image;

import javafx.scene.shape.*;
import javafx.scene.text.*;
import javafx.scene.*;

import org.slf4j.*;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.*;
import java.util.Random;
import java.util.stream.*;

public class BoardViewController {

    private final Logger log = LoggerFactory.getLogger(BoardViewController.class);

    public static GameInitController gameInitController;

    @FXML
    public Canvas boardCanvas;

    @FXML
    public Pane playerContainer;

    @FXML
    public Pane boardContainer;

    @FXML
    public Pane objectContainer;

    @FXML
    private BorderPane diceContainer;

    @FXML
    private ImageView dice;

    @FXML
    public Label chanceLabel;

    @FXML
    public BorderPane gameOverBoard;

    @FXML
    public VBox winnerBox;

    @FXML
    public Button exitGame;

    @FXML
    public Button restartGame;

    public double boxSizeX;

    public double boxSizeY;

    public static int currentPlayerId = 0;

    private static VBox appContainer;

    public EventHandler<KeyEvent> kevent = (kev) -> {

        if (kev.getCode() == KeyCode.ENTER) {

            this.boardContainer.getScene().removeEventFilter(KeyEvent.KEY_PRESSED, this.kevent);

            this.startLogic();

            // Resets the event in SLPathTransition function
            // After all the animations are completed
        }

        if (kev.getCode() == KeyCode.ESCAPE) {

            // Show Game Exit Dialog

            this.stop();
        }

    };

    public EventHandler<MouseEvent> load = new EventHandler<>() {

        public void handle(MouseEvent event) {

            /**
             * 
             * Only needed to set Player and dice in default position , can't seem to find a
             * way to automatically call any method after the fxml document has been
             * inserted into Scene
             * 
             */

            log.info("Inside load event");

            dice.setVisible(true);

            gameOverBoard.setVisible(false);

            var img = new Image(getClass().getResource("/dice1.png").toString());

            dice.setImage(img);

            setPlayers();

            boardContainer.getScene().addEventFilter(KeyEvent.KEY_PRESSED, kevent);

            playerContainer.removeEventHandler(MouseEvent.MOUSE_ENTERED, this);
        }

    };

    // Had to use anonymous class instead of lambda expression as there is nof this
    // inside lambda

    public EventHandler<MouseEvent> loadRemoverAndAutoPlayer = new EventHandler<>() {

        public void handle(MouseEvent ev) {

            /*
             * Removes the load event and set the Automatic dice rolling for Game in Human
             * vs PC mode
             */

            log.info("Inside loadRemoveAndAutoPlayer event");

            if (BoardViewController.gameInitController.getBoardController().getPlayers()
                    .size() > BoardViewController.currentPlayerId) {
                Player pc = BoardViewController.gameInitController.getBoardController().getPlayers()
                        .get(BoardViewController.currentPlayerId);

                if (pc.getType() == 2) {

                    // Fire an automated keyboard event if the player is PC

                    KeyEvent keyEvent = new KeyEvent(KeyEvent.KEY_PRESSED, KeyCode.ENTER.toString(),
                            KeyCode.ENTER.toString(), KeyCode.ENTER, false, false, false, false);

                    boardContainer.fireEvent(keyEvent);

                }

                playerContainer.removeEventHandler(MouseEvent.MOUSE_ENTERED, this);

            }
        }

    };

    public VBox getAppContainer() {
        return BoardViewController.appContainer;
    }

    public static void setAppContainer(VBox appContainer) {
        BoardViewController.appContainer = appContainer;
    }

    @FXML
    public void initialize() {

        try {

            this.boxSizeX = boardCanvas.getWidth() / 10;
            this.boxSizeY = boardCanvas.getHeight() / 10;

            this.exitGame.addEventHandler(MouseEvent.MOUSE_CLICKED, ev -> {

                this.exit();
            });

            this.restartGame.addEventHandler(MouseEvent.MOUSE_CLICKED, ev -> {

                this.restart();
            });

            DropShadow dropShadow = new DropShadow();
            dropShadow.setRadius(8.0);
            dropShadow.setOffsetX(3.0);
            dropShadow.setOffsetY(3.0);
            dropShadow.setColor(Color.web("#273746", 1));

            this.dice.setEffect(dropShadow);

            this.drawBoard();

        } catch (Exception e) {

            e.printStackTrace();
        }
    }

    public static void setGameInitController(GameInitController gameInitController) {

        BoardViewController.gameInitController = gameInitController;
    }

    // Class to map Boxes into Board

    static class BoxPoints {

        double x = 0;
        double y = 0;

        double rect_width;
        double rect_height;

        int row_count = 1;

        int col_count = 1;

        boolean option = false;

        int incrementer = 0;

        BoxPoints(double boxSizeX, double boxSizeY) {

            this.rect_width = boxSizeX;
            this.rect_height = boxSizeY;
            this.y = boxSizeY * 9;
        }
    };

    @FXML
    protected void drawBoard() {

        this.drawBoxes();
        this.drawSnakes();
        this.drawLadders();

        // Some how automate this;

        this.playerContainer.addEventHandler(MouseEvent.MOUSE_ENTERED, load);

        this.playerContainer.addEventHandler(MouseEvent.MOUSE_ENTERED, loadRemoverAndAutoPlayer);

        this.showHelp();
    }

    protected void drawBoxes() {

        GraphicsContext gc = boardCanvas.getGraphicsContext2D();

        BoxPoints points = new BoxPoints(boxSizeX, boxSizeY);

        BoardViewController.gameInitController.getBoardController().getBoard().getBoxes().stream().forEach(box -> {

            if (points.col_count > 10) {

                points.row_count++;

                points.col_count = 1;

                if (points.row_count % 2 == 0) {

                    points.x = this.boxSizeX * 9;
                } else {

                    points.x = 0;
                }

                points.y = points.y - points.rect_height;

            }
            if (points.option == true) {

                gc.setFill(Color.web("#52BE80", 1));
                points.option = false;

            } else {

                gc.setFill(Color.web("#DC7633", 1));
                points.option = true;

            }

            gc.fillRect(points.x, points.y, points.rect_width, points.rect_height);
            box.setRowId(points.x);
            box.setColId(points.y);

            gc.setFill(Color.WHITE);
            gc.fillText(box.getId() + "", points.x + points.rect_width / 2 - 5, points.y + points.rect_height / 2);

            if (points.row_count % 2 == 0) {

                points.x = points.x - points.rect_width;
            } else {

                points.x = points.rect_width + points.x;
            }

            points.col_count++;

        });

    }

    class SnakeHead {

        Image image;

        public SnakeHead() {
            try {

                image = new Image(getClass().getResourceAsStream("/snakeHead.png"));

            } catch (Exception e) {
                // TODO: handle exception
            }

        }
    }

    public void drawSnakes() {

        var a = new Path();

        GraphicsContext gc = boardCanvas.getGraphicsContext2D();

        BoxPoints points = new BoxPoints(boxSizeX, boxSizeY);

        SnakeHead head = new SnakeHead();

        BoardViewController.gameInitController.getBoardController().getSnakes().stream().forEach(snake -> {

            ImageView snakeHead = null;
            snakeHead = new ImageView(head.image);
            snakeHead.setFitWidth(points.rect_width);
            snakeHead.setFitHeight(points.rect_height);

            points.incrementer = 10;

            double xx = getBoxX(snake.getBoxIds().get(0));
            double yy = getBoxY(snake.getBoxIds().get(0));

            xx = xx + points.rect_width / 2;
            yy = yy + points.rect_height / 2;

            double x = getBoxX(snake.getBoxIds().get((snake.getBoxIds().size() - 1)));
            double y = getBoxY(snake.getBoxIds().get((snake.getBoxIds().size() - 1)));

            x = x + points.rect_width / 2;
            y = y + points.rect_height / 2;

            snakeHead.setLayoutX(xx - 45);
            snakeHead.setLayoutY(yy - 30);

            MoveTo moveTo = new MoveTo();
            moveTo.setX(xx);
            moveTo.setY(yy);

            Path snakePath = new Path();
            snakePath.setStrokeWidth(10);
            snakePath.setStroke(Color.GREEN);
            snakePath.getStrokeDashArray().addAll(1d);

            snakePath.setSmooth(true);

            /*
             * snakePath.setStyle("-fx-background-color: palegreen; " +
             * "-fx-background-insets: 10; " + "-fx-background-radius: 10; " +
             * "-fx-effect: dropshadow(three-pass-box, purple, 10, 0, 0, 0);" +
             * "-fx-backgound-image:url('snake.png');");
             */

            snakePath.getElements().add(moveTo);

            CubicCurveTo quadraticCurve = new CubicCurveTo();

            quadraticCurve.setX(x);
            quadraticCurve.setY(y);

            quadraticCurve.setControlX1(x);
            quadraticCurve.setControlY1(y);
            quadraticCurve.setControlX2(x);
            quadraticCurve.setControlY2(y);

            snakePath.getElements().add(quadraticCurve);

            this.objectContainer.getChildren().addAll(snakePath, snakeHead);

        });
    }

    public void drawLadders() {

        GraphicsContext gc = boardCanvas.getGraphicsContext2D();

        BoxPoints points = new BoxPoints(boxSizeX, boxSizeY);

        BoardViewController.gameInitController.getBoardController().getLadders().stream().forEach(ladder -> {

            gc.beginPath();

            int startBox = ladder.getBoxIds().get(0);
            int endBox = ladder.getBoxIds().get(ladder.getBoxIds().size() - 1);

            double startx = this.getBoxX(startBox) + points.rect_width / 2;
            double starty = this.getBoxY(startBox) + points.rect_height / 2;

            double endx = this.getBoxX(endBox) + points.rect_width / 2;
            double endy = this.getBoxY(endBox) + +points.rect_height / 2;

            gc.setStroke(Color.BROWN);
            gc.lineTo(startx, starty);
            gc.lineTo(endx, endy);
            gc.stroke();

            DrawLadder.draw(gc, startx, starty, endx, endy);

        });

    }

    public double getBoxX(int boxid) {

        BoxPoints points = new BoxPoints(boxSizeX, boxSizeY);

        return BoardViewController.gameInitController.getBoardController().getBoard().getBoxes().stream().filter(box ->

        box.getId() == boxid

        ).collect(Collectors.toList()).get(0).getRowId();

    }

    public double getBoxY(int boxid) {

        return BoardViewController.gameInitController.getBoardController().getBoard().getBoxes().stream().filter(box ->

        box.getId() == boxid

        ).collect(Collectors.toList()).get(0).getColId();
    }

    public void setPlayers() {

        BoxPoints points = new BoxPoints(boxSizeX, boxSizeY);

        DropShadow dropShadow = new DropShadow();
        dropShadow.setRadius(8.0);
        dropShadow.setOffsetX(3.0);
        dropShadow.setOffsetY(3.0);
        dropShadow.setColor(Color.web("#273746", 1));

        BoardViewController.gameInitController.getBoardController().getBoard().getBoxes().stream().forEach(box -> {

            Pane container;

            if (BoardViewController.gameInitController.getBoardController().getPlayers().size() == 2) {

                container = new HBox();
                ((HBox) container).setSpacing(2);
                ((HBox) container).setPrefSize(points.rect_width, points.rect_height);

            } else {
                container = new FlowPane();
                ((FlowPane) container).setHgap(3);
                ((FlowPane) container).setVgap(3);
                ((FlowPane) container).setPrefWrapLength(points.rect_width - 10);
            }

            container.setId("box" + box.getId());
            container.setLayoutX(box.getRowId());
            container.setLayoutY(box.getColId());

            String cssLayout = "-fx-padding:5px";

            // String cssLayout = " -fx-border-olor:red;" +
            // "-fx-border-width:5;" +
            // "-fx-border-style:segments(10, 15, 15, 15) line-cap round ;";

            container.setStyle(cssLayout);

            this.playerContainer.getChildren().add(container);
        });

        Scene scene = this.boardContainer.getScene();

        Pane box = (Pane) scene.lookup("#box1");

        int noOfPlayers = BoardViewController.gameInitController.getBoardController().getPlayers().size();

        BoardViewController.gameInitController.getBoardController().getPlayers().stream().forEach(player -> {

            double x = this.getBoxX(1);
            double y = this.getBoxY(1);

            // Set emoji or something like that

            var playerSymbol = new Circle();
            playerSymbol.setId("player" + player.getId());
            playerSymbol.setEffect(dropShadow);

            playerSymbol.setFill(player.getColor());

            playerSymbol.setRadius((points.rect_height / noOfPlayers - 10));

            box.getChildren().add(playerSymbol);

        });
    }

    public void showHelp() {

        // Press any key to throw the dice and dissappear

    }

    public void startLogic() {

        int pid = BoardViewController.currentPlayerId;

        if (pid > BoardViewController.gameInitController.getBoardController().getPlayers().size() - 1) {

            BoardViewController.currentPlayerId = 0;

            pid = 0;
        }

        Player nPlayer = BoardViewController.gameInitController.getBoardController().getPlayers().get(pid);

        this.chanceLabel.setText(nPlayer.getName());

        this.throwDice();

    }

    static class LambdaTest {

        public static boolean option = true;
    }

    public int throwDice() {

        this.dice.setOpacity(1);

        int roll = BoardViewController.gameInitController.getBoardController().rollDice();

        // Add animation here or somewhere else

        Random random = new Random();

        Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(.3), (actionEvent) -> {

            int tempRandom = random.nextInt(6) + 1;

            var img = new Image(getClass().getResource("/dice" + tempRandom + ".png").toString());

            this.dice.setImage(img);

            if (LambdaTest.option == true) {

                LambdaTest.option = false;

                this.dice.setTranslateX(this.dice.getTranslateX() + 50);
                this.dice.setTranslateY(this.dice.getTranslateY() - 50);

            } else {

                LambdaTest.option = true;

                this.dice.setTranslateX(this.dice.getTranslateX() - 50);
                this.dice.setTranslateY(this.dice.getTranslateY() + 50);
            }

        }));

        timeline.setCycleCount(10);
        timeline.play();

        timeline.setOnFinished(actionEvent -> {

            var img = new Image(getClass().getResource("/dice" + roll + ".png").toString());

            this.dice.setImage(img);

            this.dice.setOpacity(0.3);

            Player nPlayer = BoardViewController.gameInitController.getBoardController().getPlayers()
                    .get(BoardViewController.currentPlayerId);

            if (BoardViewController.gameInitController.getBoardController().getPlayers().size() != 1) {

                BoardViewController.currentPlayerId += 1;

                log.info("Incrementing BoardViewController.currentPlayerId : " + BoardViewController.currentPlayerId);

                if (nPlayer.getCurrentPos() + roll <= 100) {

                    this.movePlayer(nPlayer, roll);

                    log.info(nPlayer.getName() + " -> Moved " + nPlayer.getCurrentPos());

                } else {

                    this.boardContainer.getScene().addEventFilter(KeyEvent.KEY_PRESSED, kevent);

                    if (BoardViewController.gameInitController.getBoardController().getPlayers()
                            .size() > BoardViewController.currentPlayerId) {

                        Player pc = BoardViewController.gameInitController.getBoardController().getPlayers()
                                .get(BoardViewController.currentPlayerId);

                        log.info("Checking if pc " + pc.getName());

                        try {

                            Thread.currentThread().sleep(700);

                        } catch (Exception e) {

                            e.printStackTrace();
                        }

                        if (pc.getType() == 2) {

                            log.info("Firing Event if roll + pos > 100");

                            // Fire an automated keyboard event if the player is PC

                            KeyEvent keyEvent = new KeyEvent(KeyEvent.KEY_PRESSED, KeyCode.ENTER.toString(),
                                    KeyCode.ENTER.toString(), KeyCode.ENTER, false, false, false, false);

                            boardContainer.fireEvent(keyEvent);

                        }

                    }
                }

            } else {
                log.info("Only one player left Game Over");
                this.gameOver();
            }

        });

        return 0;
    }

    public boolean checkSnakeAndLadder(Player nPlayer) {

        Snake tmpSnake = BoardViewController.gameInitController.getBoardController().hasSnake(nPlayer.getCurrentPos());

        Ladder tmpLadder = BoardViewController.gameInitController.getBoardController()
                .hasLadder(nPlayer.getCurrentPos());

        if (tmpSnake != null) {

            this.downTheSnake(nPlayer, tmpSnake.getBoxIds());

            return true;

        } else if (tmpLadder != null) {

            this.climbLadder(nPlayer, tmpLadder.getBoxIds());

            return true;

        }

        return false;
    }

    public void movePlayer(Player player, int roll) {

        int oboxid = player.getCurrentPos();

        BoardViewController.gameInitController.getBoardController().movePlayer(player, roll);

        int cboxId = player.getCurrentPos();

        Pane cbox = (Pane) this.playerContainer.getScene().lookup("#box" + cboxId);

        var cplayer = (Circle) this.playerContainer.getScene().lookup("#player" + player.getId());

        // Add Transition effects here

        Path path = new Path();

        path.getElements().add(new MoveTo(this.getBoxX(oboxid), this.getBoxY(oboxid)));

        for (var i = (oboxid + 1); i <= cboxId; i++) {

            path.getElements().add(new LineTo(this.getBoxX(i), this.getBoxY(i)));
        }

        this.SLPathTransition(cbox, cplayer, player, path);

    }

    public void downTheSnake(Player player, List<Integer> boxid) {

        int cpos = player.getCurrentPos();

        int snakeHead = boxid.get(0);

        int lastBoxId = boxid.get(boxid.size() - 1);

        player.setCurrentPos(0);
        player.setCurrentPos(lastBoxId);

        Pane cbox = (Pane) this.playerContainer.getScene().lookup("#box" + lastBoxId);

        var cplayer = (Circle) this.playerContainer.getScene().lookup("#player" + player.getId());

        // Add Transition effects here

        Path path = new Path();

        path.getElements().add(new MoveTo(this.getBoxX(snakeHead), this.getBoxY(snakeHead)));

        for (var i = 1; i < boxid.size(); i++) {

            path.getElements().add(new LineTo(this.getBoxX(boxid.get(i)), this.getBoxY(boxid.get(i))));
        }

        this.SLPathTransition(cbox, cplayer, player, path);
    }

    public void climbLadder(Player player, List<Integer> boxid) {

        BoxPoints points = new BoxPoints(boxSizeX, boxSizeY);

        int cpos = player.getCurrentPos();

        int ladderStart = boxid.get(boxid.size() - 1);

        int lastBoxId = boxid.get(0);

        player.setCurrentPos(0);

        player.setCurrentPos(lastBoxId);

        log.info(player.getName() + " Climbing ladder " + lastBoxId);
        log.info(player.getName() + " Current position " + player.getCurrentPos());

        Pane cbox = (Pane) this.playerContainer.getScene().lookup("#box" + lastBoxId);

        var cplayer = (Circle) this.playerContainer.getScene().lookup("#player" + player.getId());

        // Add Transition effects here

        Path path = new Path();

        path.getElements().add(new MoveTo(this.getBoxX(ladderStart) + (points.rect_width / 2) - 10,
                this.getBoxY(ladderStart) + (points.rect_height / 2) - 15));

        path.getElements().add(new LineTo(this.getBoxX(lastBoxId) + (points.rect_width / 2) - 10,
                this.getBoxY(lastBoxId) + (points.rect_height / 2) - 15));

        this.SLPathTransition(cbox, cplayer, player, path);

    }

    public void SLPathTransition(Pane cbox, Circle cplayer, Player player, Path path) {

        path.setOpacity(0);

        PathTransition pathTransition = new PathTransition();
        pathTransition.setDuration(Duration.millis(500));
        pathTransition.setPath(path);
        pathTransition.setNode(cplayer);
        pathTransition.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
        pathTransition.setCycleCount(1);
        pathTransition.setAutoReverse(false);
        pathTransition.play();

        this.playerContainer.getChildren().addAll(path, cplayer);

        pathTransition.setOnFinished(ev -> {

            pathTransition.stop();
            cplayer.setVisible(true);
            cplayer.setTranslateX(0);
            cplayer.setTranslateY(0);
            this.playerContainer.getChildren().removeAll(path, cplayer);
            cbox.getChildren().add(cplayer);

            if (!this.checkSnakeAndLadder(player)) {

                log.info(" SLPathTransition");
                this.dice.setVisible(true);

                // Resets the keyPressed fevent filter
                // If there are no snake or ladder animations

                this.boardContainer.getScene().addEventFilter(KeyEvent.KEY_PRESSED, kevent);

                if (BoardViewController.gameInitController.getBoardController().getPlayers()
                        .size() > BoardViewController.currentPlayerId) {
                    Player pc = BoardViewController.gameInitController.getBoardController().getPlayers()
                            .get(BoardViewController.currentPlayerId);

                    if (player.getCurrentPos() == 100) {

                        BoardViewController.gameInitController.addWinner(player);

                        log.info(player.getName() + " Won");

                    }

                    if (BoardViewController.gameInitController.getBoardController().getPlayers().size() == 1) {

                        // Remove Listener after Game Over

                        this.boardContainer.getScene().removeEventFilter(KeyEvent.KEY_PRESSED, kevent);

                        // Show game over
                        // Bring that window to front with restart and quit
                        // Print the details in winner arry and show exit and restart button

                        this.gameOver();

                        return;

                    }

                    try {

                        Thread.currentThread().sleep(700);

                    } catch (Exception e) {

                        e.printStackTrace();
                    }

                    if (pc.getType() == 2) {

                        // Fire an automated keyboard event if the player is PC

                        log.info("Firing Event if No Winner");

                        KeyEvent keyEvent = new KeyEvent(KeyEvent.KEY_PRESSED, KeyCode.ENTER.toString(),
                                KeyCode.ENTER.toString(), KeyCode.ENTER, false, false, false, false);

                        boardContainer.fireEvent(keyEvent);
                    }
                }

            }

        });
    }

    public void gameOver() {

        this.gameOverBoard.setVisible(true);
        this.gameOverBoard.toFront();

        List<Player> winners = BoardViewController.gameInitController.getBoardController().getWinners();

        for (var i = 0; i < winners.size(); i++) {

            HBox pbox = new HBox();

            pbox.setPadding(new Insets(5, 5, 5, 5));

            Label plabel = new Label();
            plabel.setText((i + 1) + "  " + winners.get(i).getName());

            var imoji = new Circle(10);
            imoji.setFill(winners.get(i).getColor());

            plabel.setFont(new Font(20));

            pbox.getChildren().add(plabel);

            this.winnerBox.getChildren().add(pbox);
        }
    }

    public void restart() {

        try {

            BoardViewController.currentPlayerId = 0;

            BoardViewController.gameInitController.getWinners().forEach(player -> {

                BoardViewController.gameInitController.setPlayer(player.getName(), player.getColor(), player.getType());
            });

            BoardViewController.gameInitController.getBoardController().getPlayers().stream().forEach(player -> {
                player.setCurrentPos(1);
            });

            BoardViewController.gameInitController.getWinners().clear();

            FXMLLoader boardLoader = new FXMLLoader();

            Pane board = (Pane) boardLoader.load(getClass().getResource("/model/board.fxml"));

            appContainer.getChildren().remove(this.boardContainer);

            appContainer.getChildren().add(board);

        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    public void exit() {

        try {

            FXMLLoader a = new FXMLLoader();

            a.setLocation(getClass().getResource("/model/menu.fxml"));

            Pane menuContainer = (Pane) a.load();

            this.getAppContainer().getScene().setRoot(menuContainer);

        } catch (Exception e) {

            e.printStackTrace();
        }
    }

    public void stop() {

        // If the user press ESC show this menu

        Alert alert = new Alert(AlertType.CONFIRMATION);

        alert.setTitle("Exit Game");
        alert.setHeaderText("The Current Game Will Be Lost");
        alert.setContentText("Press Ok to exit.....");

        Optional<ButtonType> result = alert.showAndWait();

        if (result.get() == ButtonType.OK) {

            this.boardContainer.getScene().removeEventFilter(KeyEvent.KEY_PRESSED, kevent);
            this.exit();
        }
    }

}
