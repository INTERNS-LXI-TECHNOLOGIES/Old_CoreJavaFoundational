package com.lxisoft.controller;

import java.util.*;
import java.util.stream.*;
import org.slf4j.*;
import com.lxisoft.model.*;


public class LadderController {
    
    private final Logger log = LoggerFactory.getLogger(LadderController.class);

    private List<Ladder> ladders;

    public LadderController() {

        log.info("Initializing " + LadderController.class);

        this.ladders = new ArrayList<>();
    }

    // Gettters

    public List<Ladder> getLadders(int count , List<String> lcoords) {

        return createLadders(count , lcoords);
    }

    // Other

    private List<Ladder> createLadders(int count , List<String> lcoords) {

        class AtomicCount {

            public int id = count;
        }

        AtomicCount acount = new AtomicCount();

        return lcoords.stream().map(coord->{

            return coord.split(",");

        }).map(arr_coord->
        {   
            Ladder tmp_ladder = new Ladder();
            tmp_ladder.setId(--acount.id);

            List<Integer> coords = new ArrayList<>();

            for(int i = 0; i < arr_coord.length; i++) {

                coords.add(Integer.parseInt(arr_coord[i]));
            }

            tmp_ladder.setBoxIds(coords);

            this.ladders.add(tmp_ladder);

            return tmp_ladder;
                
        }).collect(Collectors.toList());
    }

    public Ladder hasLadder(int boxid) {

        Ladder tmp = new Ladder();

        Boolean isThere = this.ladders.stream().anyMatch(ladder->{

            int start = (Integer)ladder.getBoxIds().get(ladder.getBoxIds().size() - 1);

            if(start == boxid) {
                
                tmp.setId(ladder.getId());
                tmp.setBoxIds(ladder.getBoxIds());

                return true;
            }

            else return false;

        });

        if(isThere)  return tmp;

        return null;
    }
}