package Modelo;

public class Receptionist extends Person {
    private String shift;

    public Receptionist (String name, String lasName, int phoneNumber, String email, String shift){
        super(name, lasName, phoneNumber, email);
        this.shift = shift;
    }

    public  String getShift() {
        return shift;
    }
    public void setShift(String shift) {}

    public static void addOwnerPet(){
        System.out.println("Pendiente");
    }
}
