public class Penguin extends Animal {
    public Penguin(String species, String sex, int age, String commonName) {
        super(species, sex, age, commonName);
    }

    @Override
    public void feed() {
        System.out.println("The penguin has been fed...");
    }

    @Override
    public void walk() {
        System.out.println("The penguin can't fly, so it is walking...");
    }

    @Override
    public void swim() {
        System.out.println("Also, the penguin is swimming...");
    };

    @Override
    public void fly() {};

}
