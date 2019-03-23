package com.test.game;


import com.badlogic.gdx.Game;
import com.test.screens.GameScreen;


public class TestGame extends Game {

    @Override
    public void create() {
        setScreen(new GameScreen());
    }
}
