package com.lxisoft.controller;

import java.util.*;
import java.util.stream.*;
import org.slf4j.*;

import com.lxisoft.model.*;

public class PlayerController {

    private final Logger log = LoggerFactory.getLogger(LadderController.class);

    private List<Player> players;

    public PlayerController() {

        log.info("Initializing " + PlayerController.class);
        
        this.players = new ArrayList<>();
    }

    public void move(Player p , int steps) {

        log.info("Moving PlayerController ..." , p);
        
        int cid = p.getCurrentPos();

        p.setCurrentPos(cid + steps);
    }

    public List<Player> getPlayers()
	{
		return this.players;
	}

	public void setPlayers(List<Player> players)
	{
		this.players = players;
	}
}