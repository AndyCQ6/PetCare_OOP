package Modelo;

public class Cat extends Pet{
    private boolean isDomestic;

    public Cat(String name, String age, String weight, String owner){
        super(name, age, weight, owner);
        this.isDomestic = true;
    }
}
