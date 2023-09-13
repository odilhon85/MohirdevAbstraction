package uz.devior.animals;

public abstract class Animal {

    private String name;

    public Animal(String name) {
        this.name = name;
    }

    abstract void sound();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
