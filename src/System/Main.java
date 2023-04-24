package System;

import Vehicle.*;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * The Main class is responsible for building a car dealership and providing a main menu
 * for buying and test driving vehicles, resetting the distance traveled for all vehicles,
 * and changing the flag for all vehicles. It uses an ArrayList to store the dealership's
 * inventory and a Scanner object to read input from the user.
 */
public class Main {
    /**
     * he main method creates an empty ArrayList of TransportationVehicle objects and a
     * Scanner object to read input from the user. It then prompts the user to build the
     * car dealership by adding vehicles of different types to the ArrayList. Once the
     * dealership is built, the main menu is displayed, allowing the user to buy and test
     * drive vehicles, reset the distance traveled for all vehicles, and change the flag
     * for all vehicles. The method exits when the user chooses to exit the program.
     * @param arg arg an array of command-line arguments for the program (not used)
     */
    public static void main(String[] arg) {
        ArrayList<TransportationVehicle> dealership = new ArrayList<TransportationVehicle>();
        Scanner sc = new Scanner(System.in);

        //building the car dealership
        System.out.println("Welcome to the car dealership builder");
        boolean building = true;
        while (building) {
            System.out.println("Please choose a vehicle type to add: ");
            System.out.println("1. Jeep");
            System.out.println("2. Frigate");
            System.out.println("3. Spy glider");
            System.out.println("4. Toy glider");
            System.out.println("5. Exit");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1: {
                    addJeep(dealership, sc);

                    break;
                }
                case 2: {
                    addFrigate(dealership, sc);
                    break;
                }
                case 3: {
                    addSpyGilder(dealership, sc);
                    break;
                }
                case 4: {
                    addToyGilder(dealership, sc);
                    break;
                }
                case 5: {
                    building = false;
                    break;
                }
                default: {
                    System.out.println("Invalid choice!");
                    break;
                }
            }
        }

        // main menu for buying and test driving vehicles
        boolean running = true;
        while (running) {
            System.out.println("Please choose an option: ");
            System.out.println("1. Buy a vehicle");
            System.out.println("2. Test drive a vehicle");
            System.out.println("3. Reset distance traveled for all vehicles");
            System.out.println("4. Change flag for all vehicles");
            System.out.println("5. Exit");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1: {
                    buyVehicle(dealership, sc);
                    break;
                }
                case 2: {
                    testDriveVehicle(dealership, sc);
                        break;
                    }
                    case 3: {
                       resetDistance(dealership);
                        break;
                    }
                    case 4: {
                        changeFlag(dealership, sc);
                        break;
                    }
                    case 5: {
                        System.out.println("Thank you for visiting our dealership!");
                        running = false;
                        break;
                    }
                    default: {
                        System.out.println("Invalid choice!");
                        break;
                    }
                }
            }
            sc.close();
        }

    /**
     * Adds a Jeep object to the given ArrayList of TransportationVehicle objects, with
     * the specified model, max passengers, max speed, average fuel consumption, and
     * average lifetime. If an error occurs during the creation of the Jeep object, an
     * error message is printed to the console.
     * @param dealership an ArrayList of TransportationVehicle objects representing the
     *                   car dealership's inventory
     * @param sc a Scanner object used to read input from the user
     */
        private static void addJeep(ArrayList<TransportationVehicle> dealership, Scanner sc) {
                try {
                    System.out.println("Enter model: ");
                    String model = sc.nextLine();
                    System.out.println("Please enter the  max passengers:");
                    int maxPassengers = sc.nextInt();
                    System.out.println("Please enter the  max speed:");
                    int maxSpeed = sc.nextInt();
                    System.out.println("Please enter the avg fuel consumption:");
                    int avgFuelConsumption =  sc.nextInt();
                    System.out.println("Please enter the avg lifetime:");
                    int avgLifetime = sc.nextInt();
                    sc.nextLine();
                    dealership.add(new Jeep(model, maxPassengers, maxSpeed, avgFuelConsumption, avgLifetime));
                    System.out.println("Jeep created successfully!");
                } catch (Exception e) {
                    System.out.println("Error creating Jeep: " + e.getMessage());
                }
        }

    /**
     * Adds a Frigate object to the given ArrayList of TransportationVehicle objects,
     * with the specified model, max passengers, max speed, average fuel consumption, and
     * wind direction. The wind direction can be either with the wind or against the wind.
     * If an error occurs during the creation of the Frigate object, an error message is
     * printed to the console.
     * @param dealership an ArrayList of TransportationVehicle objects representing the
     *                   car dealership's inventory
     * @param sc a Scanner object used to read input from the user
     */
    private static void addFrigate(ArrayList<TransportationVehicle> dealership, Scanner sc) {
        try {
            System.out.println("Enter the model of frigate:");
            String model = sc.nextLine();
            System.out.println("Please enter the  max passengers:");
            int maxPassengers = sc.nextInt();
            System.out.println("Please enter the  max speed:");
            int maxSpeed = sc.nextInt();
            System.out.println("Please enter the avg fuel consumption:");
            int avgLifetime = sc.nextInt();
            do {
                System.out.println("Please enter the wind direction:");
                System.out.println("1. with the wind");
                System.out.println("2. against the wind");
                System.out.println("Please enter your option:");
                int windDirection = sc.nextInt();
                if (windDirection == 1) {
                    dealership.add(new Frigate(model, maxPassengers, maxSpeed, true));
                } else if (windDirection == 2) {
                    dealership.add(new Frigate(model, maxPassengers, maxSpeed, false));
                } else {
                    System.out.println("Invalid option. Please choose again.");
                }
                System.out.println("Frigate creating successfully!");
            } while (dealership == null);
        } catch (Exception e) {
            System.out.println("Error creating Frigate: " + e.getMessage());
        }

    }

    /**
     * Adds a SpyGlider object to the given ArrayList of TransportationVehicle objects,
     * with the specified power source. If an error occurs during the creation of the
     * SpyGlider object, an error message is printed to the console.
     * @param dealership an ArrayList of TransportationVehicle objects representing the
     *                   car dealership's inventory
     * @param sc a Scanner object used to read input from the user
     */
    private static void addSpyGilder(ArrayList<TransportationVehicle> dealership, Scanner sc) {
        try {
            System.out.println("Please enter power source of the spy glider:");
            String powerSource = sc.nextLine();
            dealership.add(new SpyGlider(powerSource));
            System.out.println("SpyGilder creating successfully!");
        } catch (Exception e) {
            System.out.println("Error creating SpyGilder: " + e.getMessage());
        }

    }

    /**
     * Adds a ToyGlider object to the given ArrayList of TransportationVehicle objects.
     * If an error occurs during the creation of the ToyGlider object, an error message
     * is printed to the console.
     * @param dealership an ArrayList of TransportationVehicle objects representing the
     *                   car dealership's inventory
     * @param sc sc a Scanner object used to read input from the user
     */
    private static void addToyGilder(ArrayList<TransportationVehicle> dealership, Scanner sc) {
        try {
            dealership.add(new ToyGlider());
            System.out.println("ToyGilder creating successfully!");
        } catch (Exception e) {
            System.out.println("Error creating ToyGilder: " + e.getMessage());
        }
    }

    /**
     * Allows the user to buy a vehicle from the dealership. Displays a list of available vehicles,
     * prompts the user to select a vehicle to buy, and then prompts the user to enter the details
     * of the vehicle they want to buy. If the entered details match a vehicle in the dealership,
     * that vehicle is removed from the dealership and the user is informed that they have bought
     * a vehicle of the same type. Otherwise, the user is informed that the entered details do not
     * match any vehicle in the dealership. If the dealership is empty or the user enters an invalid
     * choice, an appropriate message is displayed.
     * @param dealership an ArrayList of TransportationVehicle objects representing the vehicles
     *                   available for purchase at the dealership.
     * @param sc a Scanner object used to read input from the user.
     */
     private static void buyVehicle(ArrayList<TransportationVehicle> dealership, Scanner sc) {
         System.out.println("Please choose a vehicle to buy: ");
         if (dealership.isEmpty()) {
             System.out.println("There are no vehicles to buy.");
         }
         for (int i = 0; i < dealership.size(); i++) {
             System.out.println("Vehicle #" + (i+1) + ": " + dealership.get(i).toString());
         }
         int buyChoice = sc.nextInt();
         sc.nextLine();
         if (buyChoice > 0 && buyChoice <= dealership.size()) {
             TransportationVehicle vehicle = dealership.get(buyChoice - 1);
             System.out.println("Enter the details of the vehicle you want to buy: ");
             TransportationVehicle purchasedVehicle = null;
             if (vehicle instanceof Jeep) {
                 purchasedVehicle = createJeep(sc);
             } else if (vehicle instanceof Frigate) {
                 purchasedVehicle = createFrigate(sc);
             } else if (vehicle instanceof SpyGlider) {
                 purchasedVehicle = createSpyGlider(sc);
             } else if (vehicle instanceof ToyGlider) {
                 purchasedVehicle = createToyGlider();
             }
             if (purchasedVehicle != null && vehicle.equals(purchasedVehicle)) {
                 dealership.remove(vehicle);
                 System.out.println("You have bought a " + vehicle.getType() + "!");
             } else {
                 System.out.println("The entered details do not match any vehicle in the dealership.");
             }
         } else {
             System.out.println("Invalid choice!");
         }
     }

    /**
     * Creates a Jeep object with the specified details.
     * @param sc a Scanner object used to get user input
     * @return a new Jeep object with the specified details
     */
     private static Jeep createJeep(Scanner sc) {
         System.out.println("Enter model: ");
         String model = sc.nextLine();
         System.out.println("Please enter the max passengers:");
         int maxPassengers = sc.nextInt();
         System.out.println("Please enter the max speed:");
         int maxSpeed = sc.nextInt();
         System.out.println("Please enter the avg fuel consumption:");
         int avgFuelConsumption = sc.nextInt();
         System.out.println("Please enter the avg lifetime:");
         int avgLifetime = sc.nextInt();
         return new Jeep(model, maxPassengers, maxSpeed, avgFuelConsumption, avgLifetime);
     }

     private static Frigate createFrigate(Scanner sc) {
         System.out.println("Enter the model of frigate:");
         String model = sc.nextLine();
         System.out.println("Please enter the max passengers:");
         int maxPassengers = sc.nextInt();
         System.out.println("Please enter the max speed:");
         int maxSpeed = sc.nextInt();
         System.out.println("Please enter the avg fuel consumption:");
         int avgFuelConsumption = sc.nextInt();
         System.out.println("Please enter the wind direction (with/against the wind):");
         boolean isWindDirectionWithWind = false;
         sc.nextLine(); // Consume the new line character
         String windDirection = sc.nextLine();
         if (windDirection.equalsIgnoreCase("with the wind")) {
             isWindDirectionWithWind = true;
         } else if (!windDirection.equalsIgnoreCase("against the wind")) {
             return null;
         }
         return new Frigate(model, maxPassengers, maxSpeed, isWindDirectionWithWind);
     }

     private static SpyGlider createSpyGlider(Scanner sc) {
         System.out.println("Please enter power source of the spy glider:");
         String powerSource = sc.nextLine();
         return new SpyGlider(powerSource);
     }

     private static ToyGlider createToyGlider() {
         return new ToyGlider();
     }

    private static void testDriveVehicle(ArrayList<TransportationVehicle> dealership, Scanner sc) {
        for (int i = 0; i < dealership.size(); i++) {
            System.out.println("Vehicle #" + (i+1) + ": " + dealership.get(i).toString());
        }
        System.out.println("Please enter the details of the vehicle for the test drive: ");
        System.out.println("Vehicle type: ");
        String vehicleType = sc.nextLine();
        System.out.println("Vehicle model: ");
        String vehicleModel = sc.nextLine();
        TransportationVehicle vehicle = null;
        for (int i = 0; i < dealership.size(); i++) {
            if (dealership.get(i).getType().equalsIgnoreCase(vehicleType) && dealership.get(i).getmodel().equalsIgnoreCase(vehicleModel)) {
                vehicle = dealership.get(i);
                break;
            }
        }
        if (vehicle == null) {
            System.out.println("Vehicle not found!");
        }
        else {
            System.out.println("Distance of test drive (in km): ");
            double distance = sc.nextDouble();
            sc.nextLine();
            if (vehicle instanceof TransportationVehicle) {
                ((TransportationVehicle) vehicle).move(distance);
                System.out.println("Test drive completed! Distance traveled: " + ((TransportationVehicle) vehicle).getDistanceTraveled() + " km.");
            } else {
                System.out.println("This vehicle is not a normal vehicle and cannot be test driven!");
            }
        }
    }

    private static void resetDistance(ArrayList<TransportationVehicle> dealership) {
        for (int i = 0; i < dealership.size(); i++) {
            if (dealership.get(i) instanceof TransportationVehicle) {
                ((TransportationVehicle) dealership.get(i)).resetDistanceTraveled();
            }
        }
        System.out.println("Distance traveled reset complete.");
    }

    private static void changeFlag(ArrayList<TransportationVehicle> dealership, Scanner sc) {
        System.out.println("Please enter the flag details: ");
        System.out.println("Country: ");
        String country = sc.nextLine();
        for (TransportationVehicle vehicle : dealership) {
            if (vehicle instanceof SeaTransport) {
                ((SeaTransport) vehicle).setFlag(country);
            }
        }
        System.out.println("Flag changed for all the sailing vessel.");
    }
}

