package src;

import src.animales.*;
import src.zoo.*;


public class Main {
    public static void main(String[] args) {

        Animal willy=new Leon();
        Zoo.hacerShow(willy);

        Animal paco=new Aguila();
        Zoo.hacerShow(paco);

        Animal donatelo= new Tortuga();
        Zoo.hacerShow(donatelo);

        Ballena dory=new Ballena();
        Zoo.acuario.hacerShowAgua(dory);



    }
}
