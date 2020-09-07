package src.zoo;

import src.animales.Animal;

public class Zoo {


    public static Acuario acuario= new Acuario();

    public static void hacerShow(Animal animal){
        System.out.println(animal.show());
    }

}
