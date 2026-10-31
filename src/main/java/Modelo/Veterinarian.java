package Modelo;

public class Veterinarian extends Person{
    String veterinarian_id;
    String specialism;

    public Veterinarian (String name, String lasName, int phoneNumber, String email){
        super(name, lasName, phoneNumber, email);
        this.veterinarian_id = veterinarian_id;
        this.specialism = specialism;
    }
}
