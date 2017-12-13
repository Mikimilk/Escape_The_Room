package com.milk.gdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;

public class WorldRenderer{
	private EscapeTheRoom EscapeGame;
	World world;
	private Texture playerImg;
	private Texture background;

	//private SpriteBatch batch;
	
	WorldRenderer(EscapeTheRoom EscapeGame,World world) {
	    this.EscapeGame = EscapeGame;
	    this.world = world;
	    background = new Texture("bg.png");
	    playerImg = new Texture("charactor_01.png");
	}
	
	public void render(float delta) {
		SpriteBatch batch = EscapeGame.batch;
	    batch.begin();
	    batch.draw(background, 0 , 0, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
	    Vector2 pos = world.getPlayer().getPosition();
	    batch.draw(playerImg, pos.x, pos.y);
	    batch.end();
	}
}