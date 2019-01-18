package com.julius.klausurtraining.scheinwerfer;

public class LightFarDistanceCommand implements ILightCommand {
    public void execute(Light light) {
        ILightState state = new FarDistance();
        light.setState(state);
        state.execute();
    }
}
