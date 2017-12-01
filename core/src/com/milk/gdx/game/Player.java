package com.milk.gdx.game;

import com.badlogic.gdx.math.Vector2;

public class Player {
    public static final int DIRECTION_UP = 1;
    public static final int DIRECTION_RIGHT = 2;
    public static final int DIRECTION_DOWN = 3;
    public static final int DIRECTION_LEFT = 4;
    public static final int DIRECTION_STILL = 0;
    private Vector2 position;
    
    public Player(int x, int y) {
        position = new Vector2(x,y);
    }    
 
    public Vector2 getPosition() {
        return position;    
    }
    
    public void move(int dir) { 
        switch(dir) {
        case DIRECTION_UP:
            position.y += 5;
            break;
        case DIRECTION_RIGHT:
            position.x += 5;
            break;
        case DIRECTION_DOWN:
            position.y -= 5;
            break;
        case DIRECTION_LEFT:
            position.x -= 5;
            break;
        }
    }
}

