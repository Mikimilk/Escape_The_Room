package com.milk.gdx.game;

import com.badlogic.gdx.math.Vector2;

class Key {
	int Width = 30;
	int Height = 30;
	int X;
	int Y;
	public Vector2 position;
	    
	public Key(int x, int y) {
	    X = x;
	    Y = y;
	    position = new Vector2(x,y);
	} 
	    
	public Vector2 getPosition() {
	    return position;
	}
	    	
}
