package Modelo;

public abstract class Person {
    private String nome;
    private String lastName;
    private int phoneNumber;
    private String email;

    public Person(String nome, String lastName, int phoneNumber, String email) {
        this.nome = nome;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }
}
