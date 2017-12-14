package com.milk.gdx.game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.math.Rectangle;


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
    	//To control player and stop by collide
        if(Gdx.input.isKeyPressed(Keys.UP)) {
            world.getPlayer().move(Player.DIRECTION_UP);
            world.Player_side = 1; //Back
        }
        if(Gdx.input.isKeyPressed(Keys.RIGHT)) {
        	world.getPlayer().move(Player.DIRECTION_RIGHT);
        	world.Player_side = 2; //Right
        }
        if(Gdx.input.isKeyPressed(Keys.DOWN)) {
        	world.getPlayer().move(Player.DIRECTION_DOWN);
        	world.Player_side = 3; //Front
        }
        if(Gdx.input.isKeyPressed(Keys.LEFT)) {
        	world.getPlayer().move(Player.DIRECTION_LEFT);
        	world.Player_side = 4; //Left
        }
        
        Rectangle d1 = new Rectangle(world.getFurniture1().X ,world.getFurniture1().Y ,world.getFurniture1().Width ,world.getFurniture1().Height);
        Rectangle p = new Rectangle(world.getPlayer().getX() ,world.getPlayer().getY() ,world.getPlayer().Width ,world.getPlayer().Height);
        if (d1.overlaps(p)) {
        	world.getPlayer().getPosition().x = 100;
        	world.getPlayer().getPosition().y = 100; 
        	world.Current_Room = 2;
        }
        
        //To pick up items
        Rectangle k = new Rectangle(world.getKey().X ,world.getKey().Y ,world.getKey().Width ,world.getKey().Height);
        if (k.overlaps(p) && Gdx.input.isKeyPressed(Keys.SPACE)) {
        	world.Has_Key = true;
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