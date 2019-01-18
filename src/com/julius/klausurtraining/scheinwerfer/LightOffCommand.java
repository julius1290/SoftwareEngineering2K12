package com.julius.klausurtraining.scheinwerfer;

public class LightOffCommand implements ILightCommand {

    public void execute(Light light) {
        ILightState state = new Off();
        light.setState(state);
        state.execute();
    }
}
