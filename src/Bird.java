public abstract class Bird implements Feed, Fly {
    String species;
    String sex;
    int age;
    String commonName;

    public Bird (String species, String sex, int age, String commonName) {
        this.species = species;
        this.sex = sex;
        this.age = age;
        this.commonName = commonName;
    }
}
