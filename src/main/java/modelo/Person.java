package modelo;

public abstract class Person {
    protected String nome;
    protected String lastName;
    protected String phoneNumber; // Es mejor que sea un string
    protected String email;

    public Person(String nome, String lastName, String phoneNumber, String email) {
        this.nome = nome;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }
}
