package modelo;

public class Owner extends Person{
    private String address;

    public Owner (String name, String lasName, String phoneNumber, String email, String location){
        super(name, lasName, phoneNumber, email);
        this.address = address;
    }
}
