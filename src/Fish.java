public abstract class Fish implements Feed, Swim {
    String species;
    String sex;
    int age;
    String commonName;

    public Fish(String species, String sex, int age, String commonName) {
        this.species = species;
        this.sex = sex;
        this.age = age;
        this.commonName = commonName;
    }
}
