public abstract class AnimalNadador extends Animal{

    public abstract String showAgua();


    @Override
    public String show() {
        return showAgua();
    }
}
