public class Cat {

    private int age;
    private boolean dead;
    private boolean male;
    private String name;
    private String colour;
    private String breed;
    private Cat mother;

    public Cat(int age, boolean dead, boolean male, String name, String colour, String breed, Cat mother) {
        this.age = age;
        this.dead = dead;
        this.male = male;
        this.name = name;
        this.colour = colour;
        this.breed = breed;
        this.mother = mother;
    }

    public String getName() {
        return name;
    }

    public String getColour() {
        return colour;
    }

    public String getBreed() {
        return breed;
    }

    public int getAge() {
        return age;
    }

    public boolean isDead() {
        return dead;
    }

    public boolean isMale() {
        return male;
    }

    public Cat getMother() {
        return mother;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void die() {
        if (!dead) {
            dead = true;
        } else {
            System.out.println("Stop, stop! It's already dead!");
        }
    }
}
