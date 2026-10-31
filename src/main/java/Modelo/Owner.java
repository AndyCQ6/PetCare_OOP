package Modelo;

public class Owner extends Person{
    private String location;

    public Owner (String name, String lasName, int phoneNumber, String email, String location){
        super(name, lasName, phoneNumber, email);
        this.location = location;
    }
}
