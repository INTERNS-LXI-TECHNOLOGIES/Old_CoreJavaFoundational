package com.lxisoft.controller;

import java.util.*;
import java.util.stream.*;
import org.slf4j.*;
import com.lxisoft.model.*;



public class SnakeController {
    
    private final Logger log = LoggerFactory.getLogger(SnakeController.class);

    private List<Snake> snakes;

    public SnakeController() {

        log.info("Initializing " + SnakeController.class);

        this.snakes = new ArrayList<>();
    }

    // Gettters

    public List<Snake> getSnakes(int count , List<String> scoords) {

        return createSnakes(count , scoords);
    }

    // Other

    private List<Snake> createSnakes(int count , List<String> scoords) {

        class AtomicCount {

            public int id = count;
        }

        AtomicCount acount = new AtomicCount();

        return scoords.stream().map(coord->{

            return coord.split(",");

        }).map(arr_coord->
        {   
            Snake tmp_snake = new Snake();
            tmp_snake.setId(--acount.id);

            List<Integer> coords = new ArrayList<>();

            for(int i = 0; i < arr_coord.length; i++) {

                coords.add(Integer.parseInt(arr_coord[i]));
            }

            tmp_snake.setBoxIds(coords);

            this.snakes.add(tmp_snake);

            return tmp_snake;
                
        }).collect(Collectors.toList());
    }

    public Snake hasSnake(int boxid) {

        Snake tmp = new Snake();

        Boolean isThere = this.snakes.stream().anyMatch(snake->{

            int start = (Integer)snake.getBoxIds().toArray()[0];

            if(start == boxid) {
                
                tmp.setId(snake.getId());
                tmp.setBoxIds(snake.getBoxIds());
                
                return true;
            }

            else return false;

        });

        if(isThere)  return tmp;

        return null;
    }
}