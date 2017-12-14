package com.milk.gdx.game;

import com.badlogic.gdx.math.Vector2;

public class World {
    private Player player;
    private EscapeTheRoom EscapeGame;
    private Door doorRight;
    private Door doorLeft;
    private Door doorMid;
    
    private Key key;
    
    int Current_Room = 1;
    int Player_side = 3;
    boolean Has_Key = false;
 
    World(EscapeTheRoom EscapeGame) {
        this.EscapeGame = EscapeGame;
        player = new Player(100,100);
        doorRight = new Door(283,135);
        doorLeft = new Door(104,135);
        doorMid = new Door(195,135);
        key = new Key(250,500);
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
        
}
