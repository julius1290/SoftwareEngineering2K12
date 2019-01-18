package com.julius.klausurtraining.scheinwerfer;

import java.util.ArrayList;


public class Switch {
    private ILightCommand commandOff = new LightOffCommand();
    private ILightCommand commandPark = new LightParkCommand();
    private ILightCommand commandShort = new LightShortDistanceCommand();
    private ILightCommand commandFar = new LightFarDistanceCommand();

    private ArrayList<Light> light;

    public Switch(ArrayList<Light> light) {
        this.light = light;
    }

    public void press() {
        light.forEach(elem -> {
            switch (elem.getState()) {
                case "Off":
                    commandPark.execute(elem);
                    break;
                case "Park":
                    commandShort.execute(elem);
                    break;
                case "Short":
                    commandFar.execute(elem);
                    break;
                case "Far":
                    commandOff.execute(elem);
                default:
                    break;
            }
        });
    }
}
