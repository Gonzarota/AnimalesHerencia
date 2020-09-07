package src.animales;

import src.interfaces.iNadable;

public class Tortuga extends Animal implements iNadable {


    @Override
    public String show() {
        return "Pasito a pasito";
    }

    @Override
    public String realizarShowAcuatico() {
        return show();
    }
}
