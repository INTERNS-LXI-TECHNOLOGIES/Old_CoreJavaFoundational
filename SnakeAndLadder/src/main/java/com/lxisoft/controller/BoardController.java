package com.lxisoft.controller;

import java.util.*;
import java.io.*;
import org.slf4j.*;
import javafx.scene.paint.*;

import com.lxisoft.model.*;

public class BoardController {

    private final Logger log = LoggerFactory.getLogger(BoardController.class);

    private Board board;

    private SnakeController snakeController;

    private LadderController ladderController;

    private PlayerController playerController;

    private DiceController diceController;

    private static int playerCountId = 0;

    List<Player> winners;

    public BoardController(int sizex, int sizey) {

        log.info("Initaializing " + BoardController.class);

        try {

            this.board = new Board();

            this.snakeController = new SnakeController();

            this.ladderController = new LadderController();

            this.playerController = new PlayerController();

            this.diceController = new DiceController();

            this.winners = new ArrayList<>();

            int i = 1;

            for (int col = 1; col <= sizey; col++) {

                for (int row = 1; row <= sizex; row++) {

                    Box box = new Box();
                    box.setColId(col);
                    box.setRowId(row);
                    box.setId(i);

                    this.board.addBox(box);

                    i++;
                }

            }

        } catch (Exception e) {

            log.error("Exception in BoardController()");

            for (StackTraceElement ste : e.getStackTrace()) {

                log.error(ste.toString());
            }
        }

    }

    public boolean initBoard() {

        /**
         * Change this code to randomly create snake head and tail box_ids
         * Change this code to randomly create ladder start and end box_ids
         * 
         * 
         * Get the property file Loads all the snake coordinates into a set of list
         * loads all the ladder coordinates into a set of list
         * 
         * Call the snake controller with the list Call the snake controller with the
         * list
         * 
         */

        log.info(BoardController.class + " -> InitBoard() Running");

        try {

            InputStream is = getClass().getClassLoader().getResourceAsStream("boardType1.properties");
            Properties props = new Properties();
            props.load(is);
            is.close();

            String board_id = props.getProperty("id");
            int scount = Integer.parseInt(props.getProperty("snakeCount"));
            int lcount = Integer.parseInt(props.getProperty("ladderCount"));

            List<String> snake_coords = new ArrayList<>();

            for (int i = 1; i <= scount; i++) {

                String scoords = props.getProperty("snake" + i);
                snake_coords.add(scoords);
            }

            List<String> ladder_coords = new ArrayList<>();

            for (int j = 1; j <= lcount; j++) {

                String lcoords = props.getProperty("ladder" + j);
                ladder_coords.add(lcoords);
            }

            List<Snake> snakes = this.snakeController.getSnakes(scount, snake_coords);
            List<Ladder> ladders = this.ladderController.getLadders(lcount, ladder_coords);

            snakes.stream().forEach(snake -> {

                this.getBoard().addSnake(snake);
            });

            ladders.stream().forEach(ladder -> {

                this.getBoard().addLadder(ladder);
            });

        } catch (IOException e) {

            log.error("IOException in initBoard()");

            for (StackTraceElement ste : e.getStackTrace()) {

                log.error(ste.toString());
            }
            ;
        }

        log.info(BoardController.class + " -> InitBoard() End");

        return true;
    }

    // Setters

    public void setBoard(Board board) {

        this.board = board;
    }

    public void removePlayer(Player player) {

        this.board.removePlayer(player);
    }

    public void addWinner(Player player) {

        this.winners.add(player);
    }

    public List<Player> getWinners() {

        return this.winners;
    }

    public void setSnakeController(SnakeController snakeController) {

        this.snakeController = snakeController;
    }

    public void setLadderController(LadderController ladderController) {

        this.ladderController = ladderController;
    }

    public void setPlayercontroller(PlayerController playerController) {
        this.playerController = playerController;
    }

    public void setDicecontroller(DiceController diceController)
	{
		this.diceController = diceController;
	}


    // Getters

    public Board getBoard() {

        return this.board;
    }

    public List<Snake> getSnakes() {

        return this.getBoard().getSnakes();
    }

    public List<Ladder> getLadders() {

        return this.getBoard().getLadders();
    }

    public List<Player> getPlayers() {

        return this.getBoard().getPlayers();
    }

    // API

    public Snake hasSnake(int boxid) {

        return this.snakeController.hasSnake(boxid);
    }

    public Ladder hasLadder(int boxid) {

        return this.ladderController.hasLadder(boxid);
    }

    public void movePlayer(Player p, int steps) {

        this.playerController.move(p, steps);
    }
    

    public int rollDice() {

        return this.diceController.getRandom();
    }

    public void addPlayer(String name , Color color , int ...type) {

        Player tmp = new Player();
        tmp.setName(name);
        tmp.setId(BoardController.playerCountId);
        tmp.setColor(color);

        if(type.length == 1) {

            tmp.setType(type[0]);
        }

        this.board.addPlayer(tmp);

        BoardController.playerCountId++;
    }

}
