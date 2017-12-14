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
	
	private Texture background;
	private Texture background2;
	private Texture furnitureImg;
	private Texture keyImg;

	//private SpriteBatch batch;
	
	WorldRenderer(EscapeTheRoom EscapeGame,World world) {
	    this.EscapeGame = EscapeGame;
	    this.world = world;
	    //Room//
	    background = new Texture("bg.png");
	    background2 = new Texture("bg2.jpg");
	    
	    //Player//
	    playerFront = new Texture("charactor_01.png");
	    playerLeft = new Texture("charactor_02.png");
	    playerRight = new Texture("charactor_03.png");
	    playerBack = new Texture("charactor_04.png");
	    
	    furnitureImg = new Texture("Tree_05.png");
	    keyImg = new Texture("Key.png");
	    
	    
	}
	
	public void render(float delta) {
		SpriteBatch batch = EscapeGame.batch;
	    batch.begin();
	    //Draw background
	    if (world.Current_Room == 1) {
	        batch.draw(background, 0 , 0, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());    }
	    else if (world.Current_Room == 2) {
	    	batch.draw(background2, 0 , 0, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
	    }
	    //Draw door
	    Vector2 tree1 = world.getFurniture1().getPosition();
	    batch.draw(furnitureImg, tree1.x, tree1.y);
	    Vector2 tree2 = world.getFurniture2().getPosition();
	    batch.draw(furnitureImg, tree2.x, tree2.y);
	    Vector2 tree3 = world.getFurniture3().getPosition();
	    batch.draw(furnitureImg, tree3.x, tree3.y);

	    //Draw charactor
	    Vector2 pos = world.getPlayer().getPosition();
	    if(world.Player_side==3) {
	    batch.draw(playerFront, pos.x, pos.y); }
	    if(world.Player_side==4) {
	    batch.draw(playerLeft, pos.x, pos.y); }
	    if(world.Player_side==2) {
	    batch.draw(playerRight, pos.x, pos.y); }
	    if(world.Player_side==1) {
	    batch.draw(playerBack, pos.x, pos.y); }
	    
	    //Draw key
	    Vector2 key = world.getKey().getPosition();
	    if(!world.Has_Key) {
		batch.draw(keyImg, key.x, key.y);	
	    }
	    batch.end();
	}
}