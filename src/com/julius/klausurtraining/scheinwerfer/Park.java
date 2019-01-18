package com.julius.klausurtraining.scheinwerfer;

public class Park implements ILightState {

    public void execute() {
        System.out.println("Das Parklicht ist an");
    }

    public String print() {
        return "Park";
    }
}
