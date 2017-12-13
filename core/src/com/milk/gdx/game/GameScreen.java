package com.milk.gdx.game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;

public class GameScreen extends ScreenAdapter{
	private EscapeTheRoom EscapeGame;
    World world;
    WorldRenderer worldRenderer;

	 
    public GameScreen(EscapeTheRoom EscapeGame) {
        this.EscapeGame = EscapeGame;
        world = new World(EscapeGame);
        worldRenderer = new WorldRenderer(EscapeGame,world);
    }
    private void update(float delta) {
        if(Gdx.input.isKeyPressed(Keys.UP)) {
            world.getPlayer().move(Player.DIRECTION_UP);
        }
        if(Gdx.input.isKeyPressed(Keys.RIGHT)) {
        	world.getPlayer().move(Player.DIRECTION_RIGHT);
        }
        if(Gdx.input.isKeyPressed(Keys.DOWN)) {
        	world.getPlayer().move(Player.DIRECTION_DOWN);
        }
        if(Gdx.input.isKeyPressed(Keys.LEFT)) {
        	world.getPlayer().move(Player.DIRECTION_LEFT);
        }
    } 
    
    @Override
    public void render(float delta) {
        update(delta);
 
        Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
 
        worldRenderer.render(delta);
    }   
}