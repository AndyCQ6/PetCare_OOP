package Modelo;

public abstract class Pet {
    String name;
    String age;
    String weight;
    String owner;

    public Pet(String name, String age, String weight, String owner){
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.owner = owner;
    }
}
