package com.exovum.ludumdare;

import com.badlogic.gdx.Input;
import com.badlogic.gdx.InputAdapter;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.math.Vector3;

/**
 * Created by exovu_000 on 12/10/2016.
 */
public class GameInput extends InputAdapter {

    private final OrthographicCamera camera;

    private Vector3 touch;

    private GameWorld gameWorld;


    public GameInput(OrthographicCamera camera) {
        this.camera = camera;
        touch = new Vector3();
    }

    public GameInput(OrthographicCamera camera, GameWorld gameWorld) {
        this.camera = camera;
        this.gameWorld = gameWorld;
        touch = new Vector3();
    }

    // TODO: Add a GameWorld instance variable

//    public GameInput(OrthographicCamera camera, SampleSchoolWorld world) {
//        this.camera = camera;
//        this.world = world;
//        touch = new Vector3();
//    }

    @Override
    public boolean keyDown (int keycode) {
        if(keycode == Input.Keys.ESCAPE) {
            // exit please
            return true;
        }
        return false;
    }

    @Override
    public boolean touchDown(int x, int y, int pointer, int button) {

        camera.unproject(touch.set(x, y, 0));

        if(button == Input.Buttons.LEFT) {
            return true;
        }
        //if(button == Input.Buttons.RIGHT) {
            //world.create();
        //}

        return false;
    }

}
