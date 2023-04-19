package System;

import Vehicle.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

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

        private static void addJeep(ArrayList<TransportationVehicle> dealership, Scanner sc) {
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
            dealership.add(new Jeep(model, maxPassengers, maxSpeed, avgFuelConsumption, avgLifetime));
        }

    private static void addFrigate(ArrayList<TransportationVehicle> dealership, Scanner sc) {
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
        } while (dealership == null);
    }

    private static void addSpyGilder(ArrayList<TransportationVehicle> dealership, Scanner sc) {
        System.out.println("Please enter power source of the spy glider:");
        String powerSource = sc.nextLine();
        dealership.add(new SpyGlider(powerSource));
    }

    private static void addToyGilder(ArrayList<TransportationVehicle> dealership, Scanner sc) {
        dealership.add(new ToyGlider());
    }

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
            TransportationVehicle vehicle = dealership.remove(buyChoice - 1);
            System.out.println("You have bought a " + vehicle.getmodel() + "!");
        } else {
            System.out.println("Invalid choice!");
        }
    }

    private static void testDriveVehicle(ArrayList<TransportationVehicle> dealership, Scanner sc) {
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

