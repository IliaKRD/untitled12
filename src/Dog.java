public class Dog extends Pet{
    public Dog(String name) {
        super(name);
    }

    @Override
    public String sound() {
        return "Гав";
    }
}
