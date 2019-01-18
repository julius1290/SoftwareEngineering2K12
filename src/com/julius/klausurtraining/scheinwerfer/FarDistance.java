package com.julius.klausurtraining.scheinwerfer;

public class FarDistance implements ILightState {

    public void execute() {
        System.out.println("Das Licht ist auf Fernlicht.");
    }


    public String print() {
        return "Far";
    }
}
