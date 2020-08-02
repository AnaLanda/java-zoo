public abstract class Animal implements Feed, Walk {
    String species;
    String sex;
    int age;
    String commonName;

    public Animal (String species, String sex, int age, String commonName) {
        this.species = species;
        this.sex = sex;
        this.age = age;
        this.commonName = commonName;
    }
}
