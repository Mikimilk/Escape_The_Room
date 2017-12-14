package com.milk.gdx.game;

import com.badlogic.gdx.math.Vector2;

class Door {
    int Width = 20;
    int Height = 20;
    int X;
    int Y;
	public Vector2 position;
    
    public Door(int x, int y) {
    	X = x;
    	Y = y;
        position = new Vector2(x,y);
    } 
    
    public Vector2 getPosition() {
    	return position;
    }
    
}