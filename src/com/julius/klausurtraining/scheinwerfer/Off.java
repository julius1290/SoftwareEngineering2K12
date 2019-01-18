package com.julius.klausurtraining.scheinwerfer;

public class Off implements ILightState {

    public void execute() {
        System.out.println("Das Licht ist aus.");
    }

    public String print() {
        return "Off";
    }
}
