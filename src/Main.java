public class Main {
    public static void main(String[] args) {

        Animal willy=new Leon();
        Zoo.hacerShow(willy);

        Animal paco=new Aguila();
        Zoo.hacerShow(paco);

        Animal donatelo= new Tortuga();
        Zoo.hacerShow(donatelo);

        Animal dori=new Ballena();
        Acuario.hacerShowAgua((AnimalNadador) dori);

        AnimalNadador dolp=new Delfin();
        Acuario.hacerShowAgua(dolp);

        Animal misi=new Gato();
        Acuario.hacerShowAgua((AnimalNadador) misi);

    }
}
