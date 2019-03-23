package com.test.screens;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.gameworld.GameRender;
import com.gameworld.GameWorld;

public class GameScreen implements Screen {
    private GameWorld world;
    private GameRender renderer;

    public GameScreen() {
        Gdx.app.log("GameScreen", "Attached");
        world = new GameWorld(); // initialize world
        renderer = new GameRender(world); // initialize renderer
    }

    @Override
    public void show() {
        Gdx.app.log("GameScreen", "show called");
    }

    @Override
    public void render(float delta) {
        world.update(delta); // GameWorld updates
        renderer.render(); // GameRenderer renders
    }

    @Override
    public void resize(int width, int height) {

    }
    @Override
    public void pause() {
        Gdx.app.log("GameScreen", "pause called");
    }
    @Override
    public void resume() {
        Gdx.app.log("GameScreen", "resume called");
    }
    @Override
    public void hide() {
        Gdx.app.log("GameScreen", "hide called");
    }
    @Override
    public void dispose() {

    }
}
