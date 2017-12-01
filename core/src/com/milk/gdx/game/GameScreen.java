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
	private Player player;
    private Texture playerImg;
    private Texture background;

	 
    public GameScreen(EscapeTheRoom EscapeGame) {
        this.EscapeGame = EscapeGame;
        background = new Texture("bg.png");
        playerImg = new Texture("charactor_01.png");
        player = new Player(100,100);
    }
    private void update(float delta) {
        if(Gdx.input.isKeyPressed(Keys.UP)) {
            player.move(Player.DIRECTION_UP);
        }
        if(Gdx.input.isKeyPressed(Keys.RIGHT)) {
            player.move(Player.DIRECTION_RIGHT);
        }
        if(Gdx.input.isKeyPressed(Keys.DOWN)) {
            player.move(Player.DIRECTION_DOWN);
        }
        if(Gdx.input.isKeyPressed(Keys.LEFT)) {
            player.move(Player.DIRECTION_LEFT);
        }
    } 
    
    @Override
    public void render(float delta) {
    	Gdx.gl.glClearColor(0, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

    	update(delta);
    	SpriteBatch batch = EscapeGame.batch;
        batch.begin();
        batch.draw(background, 0 , 0, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
        Vector2 pos = player.getPosition();
        batch.draw(playerImg, pos.x, pos.y);
        batch.end();
        
    }
}

