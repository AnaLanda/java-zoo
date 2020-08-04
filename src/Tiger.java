public class Tiger extends Animal {
    public Tiger(String species, String sex, int age, String commonName) {
        super(species, sex, age, commonName);
    }

    @Override
    public void feed() {
        System.out.println("The tiger has been fed...");
    }

    @Override
    public void walk() {
        System.out.println("The tiger is pacing...");
    }

    @Override
    public void fly() {};

    @Override
    public void swim() {};
}
