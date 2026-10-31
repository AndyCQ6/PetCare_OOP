package modelo;

public class Dog extends Pet {
    private String breed;
    private String energyLevel;

    public Dog(String name, String age, String weight, String owner){
        super(name, age, weight, owner);
        this.breed = breed;
        this.energyLevel = energyLevel;
    }
}
