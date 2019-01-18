package com.julius.klausurtraining.scheinwerfer;

public class Light {

    private ILightState state;

    public Light() {
        this.state = new Off();
    }
    public void setState(ILightState state) {
        this.state = state;
    }

    public String getState() {
        return state.print();
    }

}
