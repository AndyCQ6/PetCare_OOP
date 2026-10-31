package App;

import Modelo.Person;
import Modelo.Receptionist;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Person 
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
                    System.out.println("Enter owner name: ");
                    String name = scanner.next();
                    System.out.println("Enter last name: ");
                    String lastName = scanner.next();
                    System.out.println("Enter phone number: ");
                    int phoneNumber = scanner.nextInt();
                    System.out.println("Enter email: ");
                    String email = scanner.next();
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
