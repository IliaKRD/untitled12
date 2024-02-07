public class Cat extends Pet{
    public Cat(String name) {
        super(name);
    }

    @Override
    public String sound() {
        return "Мяу";
    }
}
