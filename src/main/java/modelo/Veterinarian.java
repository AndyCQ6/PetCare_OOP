package modelo;

public class Veterinarian extends Person{
    String veterinarian_id;
    String specialism;

    public Veterinarian (String name, String lasName, String phoneNumber, String email, String veterinarian_id, String specialism){
        super(name, lasName, phoneNumber, email);
        this.veterinarian_id = veterinarian_id;
        this.specialism = specialism;
    }
}
