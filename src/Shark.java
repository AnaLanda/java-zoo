public class Shark extends Fish implements Feed,Swim {
    public Shark (String species, String sex, int age, String commonName) {
        super(species, sex, age, commonName);
    }

    @Override
    public void feed() {
        System.out.println("The shark has been fed...");
    }

    @Override
    public void swim() {
        System.out.println("The shark is swimming...");
    }
}
