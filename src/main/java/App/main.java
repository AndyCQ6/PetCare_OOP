package App;

import modelo.Person;
import modelo.Veterinarian;
import modelo.Receptionist;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Person vet1 = new Veterinarian("Derek Alexander", "Rodriguez", "921 291 6736", "dotecap2007@gmail.com", "12345678", "Surgery");
        Person vet2 = new Veterinarian("Luis Donaldo", "Mijangos", "921 409 1976", "luisdona17@gmail.com", "87654321", "Oncology");
        Person vet3 = new Veterinarian("Jonathan", "Cruz", "921 111 3832", "golddigger@gmail.com", "00000001", "Oncology");

        Scanner scanner = new Scanner(System.in);
        int option;
        option = scanner.nextInt();

        do{
            System.out.println("=== PetCare ===\n");
            System.out.println("1. Add owner and pet\n");
            System.out.println("2. Register veterinary and assing them to a clinic\n");
            System.out.println("3. To book an appointment\n");
            System.out.println("4. Attend or cancel an appointment\n");
            System.out.println("5. To generate an appointment receipt\n");
            System.out.println("6. View pet medical history\n");
            System.out.println("7. List every pet and their sound\n");
            System.out.println("8. View total billed by veterinarian\n");
            System.out.println("9. Drop pet");
            System.out.println("0. Exit");
            System.out.println("Choose an option: ");

            switch (option) {
                case 1:
                    System.out.println("=== Register owner ===\n");
                    System.out.println("Enter owner name: ");
                    String name = scanner.next();
                    System.out.println("Enter last name: ");
                    String lastName = scanner.next();
                    System.out.println("Enter phone number: ");
                    String phoneNumber = scanner.next();
                    System.out.println("Enter email: ");
                    String email = scanner.next();
                    System.out.println("Enter address: ");
                    String address = scanner.next();
                    Receptionist.addOwnerPet();
                    break;
                case 2:
                    registerAssignVeterinary();
                    break;
                case 3:
                    bookAppointment();
                    break;
                case 4:
                    attendCancelAppointment();
                    break;
                case 5:
                    generateAppointmentReceipt();
                    break;
                case
            }
        } while (option != 0);


);
    }
}
