public class Sparrow extends Animal {
    public Sparrow(String species, String sex, int age, String commonName) {
        super(species, sex, age, commonName);
    }

    @Override
    public void feed() {
        System.out.println("The sparrow has been fed...");
    }

    @Override
    public void fly() {
        System.out.println("The sparrow is flying...");
    }

    @Override
    public void walk() {};

    @Override
    public void swim() {};
}
