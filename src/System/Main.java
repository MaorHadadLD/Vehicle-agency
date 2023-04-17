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
                    System.out.println("Enter model, max passengers, max speed, avg fuel consumption, avg lifetime: ");
                    String model = sc.nextLine();
                    int maxPassengers = sc.nextInt();
                    int maxSpeed = sc.nextInt();
                    double avgFuelConsumption = sc.nextDouble();
                    int avgLifetime = sc.nextInt();
                    dealership.add(new Jeep(model, maxPassengers, maxSpeed, avgFuelConsumption, avgLifetime));
                    break;
                }
                case 2: {
                    System.out.println("Enter model, max passengers, max speed, avg fuel consumption, avg lifetime: ");
                    String model = sc.nextLine();
                    int maxPassengers = sc.nextInt();
                    int maxSpeed = sc.nextInt();
                    double avgFuelConsumption = sc.nextDouble();
                    int avgLifetime = sc.nextInt();
                    dealership.add(new Frigate(model, maxPassengers, maxSpeed, avgFuelConsumption, avgLifetime));
                    break;
                }
                case 3: {
                    System.out.println("Enter model, maximum speed: ");
                    String model = sc.nextLine();
                    int maxSpeed = sc.nextInt();
                    dealership.add(new SpyGlider(model, maxSpeed));
                    break;
                }
                case 4: {
                    System.out.println("Enter model, maximum speed: ");
                    String model = sc.nextLine();
                    int maxSpeed = sc.nextInt();
                    dealership.add(new ToyGlider(model, maxSpeed));
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
                    System.out.println("Please choose a vehicle to buy: ");
                    for (int i = 0; i < dealership.size(); i++) {
                        System.out.println((i + 1) + ". " + dealership.get(i).getmodel());
                    }
                    int buyChoice = sc.nextInt();
                    sc.nextLine();
                    if (buyChoice > 0 && buyChoice <= dealership.size()) {
                        TransportationVehicle vehicle = dealership.remove(buyChoice - 1);
                        System.out.println("You have bought a " + vehicle.getmodel() + "!");
                    } else {
                        System.out.println("Invalid choice!");
                    }
                    break;
                }
                case 2: {

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
                            break;
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
                        break;
                    }
                    case 3: {
                        for (int i = 0; i < dealership.size(); i++) {
                            if (dealership.get(i) instanceof TransportationVehicle) {
                                ((TransportationVehicle) dealership.get(i)).resetDistanceTraveled();
                            }
                        }
                        System.out.println("Distance traveled reset complete.");
                        break;
                    }
                    case 4: {
                        System.out.println("Please enter the flag details: ");
                        System.out.println("Country: ");
                        String country = sc.nextLine();
                        System.out.println("Code: ");
                        String code = sc.nextLine();
                        for (TransportationVehicle vehicle : dealership) {
                            if (vehicle instanceof SeaTransport) {
                                ((SeaTransport) vehicle).setFlag(country);
                            }
                        }
                        System.out.println("Flag changed for all vehicles.");
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
    }

