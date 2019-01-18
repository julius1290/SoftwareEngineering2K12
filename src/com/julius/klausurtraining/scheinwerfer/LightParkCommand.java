package com.julius.klausurtraining.scheinwerfer;

public class LightParkCommand implements ILightCommand {

    public void execute(Light light) {
        ILightState state = new Park();
        light.setState(state);
        state.execute();
    }
}
