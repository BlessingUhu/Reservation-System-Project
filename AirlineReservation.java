import java.util.*;
public class AirlineReservation {
    public static Scanner input = new Scanner(System.in);

    // An airline Reservation System.
    // Program will assign seats to passengers, if available. I would use One dimensional arrays to perform this action.
    // Passengers will have the option to choose an Economy or First Class section.

    public static void main(String[] args) {

        //Global Variables

        int[] firstClassSeats = {1, 2, 3, 4, 5};
        int[] economySeats = {6, 7, 8, 9, 10};
        boolean[] unavailableSeats = new boolean[10];
        int numSeats = 0;
        int classType = 0;
        int i;
        String response = "";

        //user inputs

        System.out.println("First class seat section would contain seats 1-5");
        System.out.println("Economy seat section would contain seats 6-10");

        System.out.println("Please type 1 for First Class and Please type 2 for Economy.");
        classType = input.nextInt();

        for (int j = 0; j >= 0; j++) {
            if (classType != 1 && classType != 2) {
                System.out.println("Please enter the correct class type: 1 for First Class and 2 for Economy");
                classType = input.nextInt();
            }

            //First Class section

            if (classType == 1) {
                System.out.println("How many number of seats would you like to reserve?");
                numSeats = input.nextInt();

                // Seats transfer
                if (numSeats > 5) {
                    System.out.println("Oh no. Seats for the first Class is filled. Enter 2 if you would like to reserve a seat in the economy instead");
                    classType = input.nextInt();
                    continue;
                }

                for (i = 0; i < numSeats; i++) {
                    System.out.println("Seat number " + firstClassSeats[i]);

                    //seats no longer available.
                    unavailableSeats[i] = true;
                }
                System.out.println("Congratulations!");
                System.out.println("Seats reserved. You are now at the first-class section of the plane.");
                System.out.println("Would you like to start over? Yes or no?");
                response = input.next();

                // Starting over
                if (response.equalsIgnoreCase("yes")) {
                    System.out.println("Enter 1 for first class or enter 2 for economy");
                    classType = input.nextInt();
                    continue;
                }
                else if (response.equalsIgnoreCase("No")) {
                    System.out.println("Plane leaves in 4 hours!");
                    break;
                }
                else {
                    break;
                }
            }

            //Economy Class section

            if (classType == 2) {
                System.out.println("How many number of seats would you like to reserve?");
                numSeats = input.nextInt();

                //Seats transfer
                if (numSeats > 5) {
                    System.out.println("Oh no. Seats for the economy class is filled. Enter 1 if you would like to reserve a seat in the first class instead");
                    classType = input.nextInt();
                    continue;
                }

                for (i = 0; i < numSeats; i++) {
                    System.out.println("Seat number " + economySeats[i]);

                    //seats no longer available.
                    unavailableSeats[i] = true;
                }
                    System.out.println("Congratulation!!");
                    System.out.println("Seats reserved. You are now at the economy section of the plane.");
                    System.out.println("Would you like to start over? Yes or no?");
                    response = input.next();

                    //User starting over.

                    if (response.equalsIgnoreCase("yes")) {
                        System.out.println("Enter 1 for first class or enter 2 for economy");
                        classType = input.nextInt();
                        continue;
                    }
                    else if (response.equalsIgnoreCase("No")) {
                        System.out.println("Plane leaves in 4 hours! Safe Journey.");
                        break;
                    }
                    else {
                        break;
                    }
                }
            }

        input.close();
    }
}
