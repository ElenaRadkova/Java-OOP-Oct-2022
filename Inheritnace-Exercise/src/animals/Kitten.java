package animals;

public class Kitten extends Cat{
    private static final String KITTEN_GENDER = "Female";
    public Kitten(String name, int age) {
        super(name, age, KITTEN_GENDER);
    }
    public String produceSound() {
        return "Meow";
    }
}
