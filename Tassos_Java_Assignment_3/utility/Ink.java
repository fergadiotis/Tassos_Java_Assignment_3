package utility;

import objects.Shelter;
import objects.User;
import java.util.Scanner;
import java.util.ArrayList;
import objects.Pet;

public class Ink {
    private Scanner input = new Scanner(System.in);
    private int choice;

    public void printWelcome() {
        // do nothing yet...
    } // printWelcome()

    public void printGoodday() {
        System.out.println("Have a great day pet lover");
    } // printGoodday()

    public int validateMainMenu() {
        boolean valid = false;

        while (!valid) {
            System.out.println("##### MAIN MENU #####");
            System.out.println("(1) View Pets\n(2) Shelter Details\n(3) Book Appointment\n(4) Exit");
            try {
                choice = input.nextInt();
                if (choice >= 1 && choice <= 4) {
                    valid = true; // escapes loop only if choice is correct dt and range
                } else {
                    System.out.println("Please enter a 1 - 4");
                }
            } catch (Exception e) { // runs on exception
                System.out.println("That's not a number!");
            } finally { // always runs!
                input.nextLine();
            }
        } // while
        return choice;
    } // printMenu()

    public void printPetDetails(Pet pet) {
        System.out.printf("Name: %s\n", pet.getName());
        System.out.printf("Age: %d\n", pet.getAge());
        System.out.printf("Breed: %s\n", pet.getBreed());
        System.out.printf("Color: %s\n", pet.getColor());
        System.out.printf("Owner: %s\n", pet.getOwner());
        System.out.printf("Is Adopted: %b\n", pet.getIsAdopted());
        System.out.println("Adopt this pet? Y/N");
    } // printPetDetails()

    public void printAvailablePets(ArrayList<Pet> pets) {
        for (int i = 0; i < pets.size(); i++) {
            if (!pets.get(i).getIsAdopted()) {
                System.out.printf("(%d) Name: %s Type: %s Age: %d\n", i + 1,
                        pets.get(i).getName(), pets.get(i).getType(), pets.get(i).getAge());
            }
        } // for
        System.out.println("Enter 0 to go back");
    } // printAvailablePets()

    public void printShelterDetails(Shelter shelter) {
        System.out.printf("Shelter Address: %s\n", shelter.getAddress());
        String[] hours = shelter.getHours();
        for (int i = 0; i < hours.length; i++) {
            System.out.println(hours[i]);
        } // for
        System.out.println("hit any key to go back");
    } // printShelterDetails

    public void printAppointmentMenu(User user){
        System.out.println("Select a day for appointment:");
        System.out.println("1. Monday\n2. Tuesday\n3. Wednesday\n4. Thursday\n5. Friday\n6. Saturday\n7. Sunday ");
    }

    public void bookAppointment(User user){
        int appointmentChoice = input.nextInt();
        String appointmentDay = "";
        switch (appointmentChoice){
            case 1:
            appointmentDay = "Monday";
            case 2:
            appointmentDay = "Tuesday";
            case 3:
            appointmentDay = "Wednesday";
            case 4:
            appointmentDay = "Thusday";
            case 5:
            appointmentDay = "Friday";
            case 6:
            appointmentDay = "Saturday";
            case 7:
            appointmentDay = "Sunday";
            break;
            default:
            System.out.println("Invalid numebr, Please enter a number between 1 and 7.");

        }
        user.setAppointmentDay(appointmentDay);

    }

} // class