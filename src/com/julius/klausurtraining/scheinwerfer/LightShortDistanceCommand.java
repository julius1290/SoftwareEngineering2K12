package com.julius.klausurtraining.scheinwerfer;

public class LightShortDistanceCommand implements ILightCommand {
    public void execute(Light light) {
        ILightState state = new ShortDistance();
        light.setState(state);
        state.execute();
    }
}
