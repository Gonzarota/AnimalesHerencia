package src.animales;

import src.interfaces.iNadable;

public class Delfin extends Animal implements iNadable {


    @Override
    public String show() {
        return "Salto haciendo arcos en el agua";
    }

    @Override
    public String realizarShowAcuatico() {
        return show();
    }
}
