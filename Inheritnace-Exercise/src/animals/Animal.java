package animals;

public class Animal {
    private String name;
    private int age;
    private String gender;

    public Animal(String name, int age, String gender) {
        setName(name);
        setAge(age);
        setGender(gender);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.length() < 1 || name.equals(" ")) {
            throw new IllegalArgumentException("Invalid input!");
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age < 1) {
            throw new IllegalArgumentException("Invalid input!");
        }
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        if(gender.equals("Male") || gender.equals("Female")) {
            this.gender = gender;
        } else {
            throw new IllegalArgumentException("Invalid input!");
        }
    }

    public String produceSound() {
        return "";
        }

    @Override
    public String toString() {
        StringBuilder animals = new StringBuilder();
        animals.append(getClass().getSimpleName()).append(System.lineSeparator());
        animals.append(String.format("%s %d %s%n", name, age, gender));
        animals.append(produceSound());

        return animals.toString();
    }
}
