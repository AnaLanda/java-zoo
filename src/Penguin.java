public class Penguin extends Bird implements Feed, Fly {
    public Penguin(String species, String sex, int age, String commonName) {
        super(species, sex, age, commonName);
    }

    @Override
    public void feed() {
        System.out.println("The penguin has been fed...");
    }

    @Override
    public void fly() {
        System.out.println("The penguin can't fly, so it is swimming...");
    }
}
