package com.julius.klausurtraining.scheinwerfer;

public class ShortDistance implements ILightState {

    public void execute() {
        System.out.println("Das Licht normal an.");
    }

    public String print() {
        return "Short";
    }
}
