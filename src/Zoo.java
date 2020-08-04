import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private List<Animal> aviary = new ArrayList<>();
    private List<Animal> cage = new ArrayList<>();
    private List<Animal> aquarium = new ArrayList<>();

    public void addBird(Animal animal) {
        aviary.add(animal);
    }

    public void addAnimal(Animal animal) {
        cage.add(animal);
    }

    public void addFish(Animal animal) {
        aquarium.add(animal);
    }

    public void feed() {
        for (Animal animal : cage) {
            animal.feed();
        }
        for (Animal animal : aviary) {
            animal.feed();
        }
        for (Animal animal : aquarium) {
            animal.feed();
        }
        System.out.println();
    }

    public void move() {
        for (Animal animal : cage) {
            animal.walk();
        }
        for (Animal animal : aviary) {
            animal.fly();
            animal.walk();
            animal.swim();
        }
        for (Animal animal : aquarium) {
            animal.swim();
        }
        System.out.println();
    }
}
