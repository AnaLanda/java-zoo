public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();

        zoo.addBird(new Penguin("Spheniscus demersus", "male", 3, "Penguin"));
        zoo.addBird(new Sparrow("Passer domesticus", "female", 2, "Sparrow"));
        zoo.addAnimal(new Tiger("Panthera tigris tigris", "female", 5, "Tiger"));
        zoo.addFish(new Shark("Carcharodon carcharias", "female", 4, "Shark"));

        zoo.feed();
        zoo.move();
    }
}
