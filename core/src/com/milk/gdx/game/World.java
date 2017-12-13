package com.milk.gdx.game;

import com.badlogic.gdx.math.Vector2;

public class World {
    private Player player;
    private EscapeTheRoom EscapeGame;
 
    World(EscapeTheRoom EscapeGame) {
        this.EscapeGame = EscapeGame;
        player = new Player(100,100);
    }
 
    Player getPlayer() {
        return player;
    }

}
