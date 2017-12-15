package com.milk.gdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;

public class WorldRenderer{
	private EscapeTheRoom EscapeGame;
	World world;
	private Texture playerFront;
	private Texture playerBack;
	private Texture playerLeft;
	private Texture playerRight;
	
	private Texture room1;
	private Texture room2;
	private Texture room3;
	private Texture room4;
	private Texture room5;
	private Texture room6;
	private Texture room7;
	private Texture success;
	private Texture how_to_play;

	//Door
	private Texture door1;
	private Texture door2;
	private Texture door3;
	private Texture door4;
	private Texture door5;
	private Texture door6;
	private Texture door7;
	private Texture door8;
	
	//Key
	private Texture keyImg;

	WorldRenderer(EscapeTheRoom EscapeGame,World world) {
	    this.EscapeGame = EscapeGame;
	    this.world = world;
	    //Room//
	    room1 = new Texture("room1.png");
	    room2 = new Texture("room2.png");
	    room3 = new Texture("room3.png");
	    room4 = new Texture("room4.png");
	    room5 = new Texture("room5.png");
	    room6 = new Texture("room6.png");
	    room7 = new Texture("room7.png");
	    success = new Texture("success.png");
	    how_to_play = new Texture("how_to_play.png");
	    
	    
	    //Player//
	    playerFront = new Texture("charactor_01.png");
	    playerLeft = new Texture("charactor_02.png");
	    playerRight = new Texture("charactor_03.png");
	    playerBack = new Texture("charactor_04.png");
	    
	    //Key//
	    keyImg = new Texture("Key.png");
	    
	    //Door//
	    door1 = new Texture("Door1.png");
	    door2 = new Texture("Door2.png");
	    door3 = new Texture("Door3.png");
	    door4 = new Texture("Door4.png");
	    door5 = new Texture("Door5.png");
	    door6 = new Texture("Door6.png");
	    door7 = new Texture("Door7.png");
	    door8 = new Texture("Door8.png");
	   
	}
	
	public void render(float delta) {
		SpriteBatch batch = EscapeGame.batch;
	    batch.begin();
	    //VectorDoor
	    Vector2 DoorRight = world.getDoorRight().getPosition();
	    Vector2 DoorLeft = world.getDoorLeft().getPosition();
	    Vector2 DoorMid = world.getDoorMid().getPosition();
	    Vector2 key = world.getKey().getPosition();

	    //Draw background
	    if (world.Current_Room == 0) {
	    	batch.draw(how_to_play, 0 , 0, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
	    	batch.draw(playerFront, 200, 50);
	    }
	    else if (world.Current_Room == 1) {
	        batch.draw(room1, 0 , 0, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());    
	      //Draw door
		    batch.draw(door1, DoorRight.x, DoorRight.y);
		    batch.draw(door1, DoorLeft.x, DoorLeft.y);
		    batch.draw(door1, DoorMid.x, DoorMid.y);
	    }
	    else if (world.Current_Room == 2) {
	    	batch.draw(room2, 0 , 0, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
	    	//Draw door
		    batch.draw(door2, DoorRight.x, DoorRight.y);
		    batch.draw(door2, DoorLeft.x, DoorLeft.y);
		    batch.draw(door2, DoorMid.x, DoorMid.y);
	    }
	    else if (world.Current_Room == 3) {
	    	batch.draw(room3, 0 , 0, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
	    	//Draw door
		    batch.draw(door3, DoorRight.x, DoorRight.y);
		    batch.draw(door3, DoorLeft.x, DoorLeft.y);
		    batch.draw(door3, DoorMid.x, DoorMid.y);
	    }
	    else if (world.Current_Room == 4) {
	    	batch.draw(room4, 0 , 0, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
	    	//Draw door
		    batch.draw(door4, DoorRight.x, DoorRight.y);
		    batch.draw(door4, DoorLeft.x, DoorLeft.y);
	    }
	    else if (world.Current_Room == 5) {
	    	batch.draw(room5, 0 , 0, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
	    	//Draw door
		    batch.draw(door5, DoorRight.x, DoorRight.y);
		    batch.draw(door5, DoorLeft.x, DoorLeft.y);
		    batch.draw(door5, DoorMid.x, DoorMid.y);
	    }
	    else if (world.Current_Room == 6) {
	    	batch.draw(room6, 0 , 0, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
	    	//Draw door
		    batch.draw(door6, DoorRight.x, DoorRight.y);
		    batch.draw(door6, DoorLeft.x, DoorLeft.y);
		    //Draw key
		    if(!world.Has_Key) {
			batch.draw(keyImg, key.x, key.y);	
		    }
	    }
	    else if (world.Current_Room == 7) {
	    	batch.draw(room7, 0 , 0, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
	    	//Draw door
		    batch.draw(door7, DoorRight.x, DoorRight.y);
		    batch.draw(door7, DoorLeft.x, DoorLeft.y);
		    batch.draw(door8, DoorMid.x-15, DoorMid.y-5);
	    }
		else if (world.Current_Room ==8) {
			batch.draw(success, 0 , 0, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
		    }
	    

	    //Draw charactor
	    Vector2 pos = world.getPlayer().getPosition();
	    if(world.Current_Room != 0) {
		    if(world.Player_side==3) {
		    batch.draw(playerFront, pos.x, pos.y); }
		    if(world.Player_side==4) {
		    batch.draw(playerLeft, pos.x, pos.y); }
		    if(world.Player_side==2) {
		    batch.draw(playerRight, pos.x, pos.y); }
		    if(world.Player_side==1) {
		    batch.draw(playerBack, pos.x, pos.y); }
	    }
	    if(world.Has_Key && !world.Use_Key) {
	    	batch.draw(keyImg, 20, 189);
	    }
	    
	    batch.end();
	}
}