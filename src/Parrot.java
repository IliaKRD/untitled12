public class Parrot extends Pet{
    public Parrot(String name) {
        super(name);
    }

    @Override
    public String sound() {
        return "Кеша хороший!";
    }
}
