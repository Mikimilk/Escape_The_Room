package com.milk.gdx.game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.ScreenAdapter;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class GameScreen extends ScreenAdapter{
	private EscapeTheRoom EscapeGame;
    private Texture charactorImg;
    private Texture background;
    private int x;
    private int y;
	 
    public GameScreen(EscapeTheRoom EscapeGame) {
        this.EscapeGame = EscapeGame;
        background = new Texture("C:\\Users\\user\\EscapeTheRoom\\core\\assets\\bg.png");
        charactorImg = new Texture("C:\\Users\\user\\EscapeTheRoom\\core\\assets\\charactor_01.png");
        x = 100;
        y = 100;
    }
    private void update(float delta) {
    	if(Gdx.input.isKeyPressed(Keys.LEFT)) {
            x -= 5;
        }
        if(Gdx.input.isKeyPressed(Keys.RIGHT)) {
            x += 5;
        }
        if(Gdx.input.isKeyPressed(Keys.UP)) {
            y += 5;
        }
        if(Gdx.input.isKeyPressed(Keys.DOWN)) {
            y -= 5;
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
        batch.draw(charactorImg, x, y);
        batch.end();
        
    }
}

