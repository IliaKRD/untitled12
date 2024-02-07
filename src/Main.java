import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Pet> petsMap = new HashMap<>();

        petsMap.put("Вася", new Cat("Вася"));
        petsMap.put("Бобик", new Dog("Бобик"));
        petsMap.put("Кеша", new Parrot("Кеша"));

        Pet cat = petsMap.get("Вася");
        System.out.println("Имя: " + cat.getName() + ", Звук: " + cat.sound());

        Pet dog = petsMap.get("Бобик");
        System.out.println("Имя: " + dog.getName() + ", Звук: " + dog.sound());

        Pet parrot = petsMap.get("Кеша");
        System.out.println("Имя: " + parrot.getName() + ", Звук: " + parrot.sound());
    }
}