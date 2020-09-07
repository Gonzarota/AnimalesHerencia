package src.animales;

import src.interfaces.iNadable;

public class Ballena extends Animal implements iNadable {


    @Override
    public String realizarShowAcuatico() {
        return show();
    }

    @Override
    public String show() {
        return "Voy llena";
    }
}
