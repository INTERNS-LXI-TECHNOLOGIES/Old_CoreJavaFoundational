package com.lxisoft.controller;

import org.slf4j.*;
import javafx.scene.paint.*;

import com.lxisoft.util.*;
import com.lxisoft.model.*;
import java.util.*;

public class GameInitController {

    private final Logger log = LoggerFactory.getLogger(GameInitController.class);

    private BoardController bController;

    private Mode mode;

    public GameInitController() {
        
        log.info("Initaializing " + GameInitController.class);

        this.bController = new BoardController(10, 10);
        bController.initBoard();    

    }

    public void setPlayer(String name , Color color , int ...type) {

        try {

            
            if(type.length == 1) {

                this.bController.addPlayer(name , color , type[0]);    
                      
            } else{

                this.bController.addPlayer(name , color);          

            }

        } catch (Exception e) {

            log.error("Exception in setPlayer()");

            for (StackTraceElement ste : e.getStackTrace()) {

                log.error(ste.toString());
            }
        }
    }

    public void addWinner(Player player) {

        this.bController.removePlayer(player);

        this.bController.addWinner(player);
    }

    public List<Player> getWinners() {

        return this.bController.getWinners();
    }

    public void setMode(Mode mode) {

        this.mode = mode;
    }

    public Mode getMode() {

        return this.mode;
    }

    public BoardController getBoardController()
	{
		return this.bController;
	}

}
