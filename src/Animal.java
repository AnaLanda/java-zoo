public abstract class Animal implements Feed, Walk, Fly, Swim {
    public String species;
    public String sex;
    public int age;
    public String commonName;

    public Animal (String species, String sex, int age, String commonName) {
        this.species = species;
        this.sex = sex;
        this.age = age;
        this.commonName = commonName;
    }
}
