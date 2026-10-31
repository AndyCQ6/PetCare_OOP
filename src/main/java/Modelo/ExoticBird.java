package Modelo;

public class ExoticBird extends Pet {
    private int wingsLenght;
    private String sound;

    public ExoticBird(String name, String age, String weight, String owner, int wingsLenght, String sound) {
        super(name, age, weight, owner);
        this.wingsLenght = wingsLenght;
        this.sound = sound;
    }
}
