package com.milk.gdx.game;

import java.util.Random;

import com.badlogic.gdx.math.Vector2;

public class World {
    private Player player;
    private EscapeTheRoom EscapeGame;
    private Door doorRight;
    private Door doorLeft;
    private Door doorMid;
    
    private Key key;
    
    private Delay delay;
    
    int Current_Room = 0;
    int Player_side = 3;
    boolean Has_Key = false;
    boolean Use_Key = false;
    
    private Random rand = new Random();
    int n = rand.nextInt(7)+1;
    
    World(EscapeTheRoom EscapeGame) {
        this.EscapeGame = EscapeGame;
        player = new Player(200,50);
        doorRight = new Door(283,135);
        doorLeft = new Door(104,135);
        doorMid = new Door(195,135);
        key = new Key(50,50);
    }
 
    Player getPlayer() {
        return player;
    }
    
    Door getDoorRight() {
    return doorRight;
    }
    
    Door getDoorLeft() {
    return doorLeft;
    }
    
    Door getDoorMid() {
    return doorMid;
    }
    
    Key getKey() {
    return key;
    }
    
    Delay getDelay() {
    return delay;
    }
}
