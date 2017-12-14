package com.milk.gdx.game;

import com.badlogic.gdx.math.Vector2;

public class World {
    private Player player;
    private EscapeTheRoom EscapeGame;
    private Furniture furniture1;
    private Furniture furniture2;
    private Furniture furniture3;
    private Key key;
    
    int Current_Room = 1;
    int Player_side = 3;
    boolean Has_Key = false;
 
    World(EscapeTheRoom EscapeGame) {
        this.EscapeGame = EscapeGame;
        player = new Player(100,100);
        furniture1 = new Furniture(300,300);
        furniture2 = new Furniture(400,300);
        furniture3 = new Furniture(500,300);
        key = new Key(250,500);
    }
 
    Player getPlayer() {
        return player;
    }
    
    Furniture getFurniture1() {
    return furniture1;
    }
    
    Furniture getFurniture2() {
    return furniture2;
    }
    
    Furniture getFurniture3() {
    return furniture3;
    }
    
    Key getKey() {
    return key;
    }
        
}
