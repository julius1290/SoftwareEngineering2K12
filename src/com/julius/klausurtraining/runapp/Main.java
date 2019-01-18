package com.julius.klausurtraining.runapp;

import com.julius.klausurtraining.scheinwerfer.Light;
import com.julius.klausurtraining.scheinwerfer.Switch;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Light> lightList = new ArrayList<>();
        lightList.add(new Light());
        lightList.add(new Light());

        Switch switchForLamps = new Switch(lightList);
        switchForLamps.press();
        switchForLamps.press();
        switchForLamps.press();
        switchForLamps.press();
        switchForLamps.press();
    }
}
