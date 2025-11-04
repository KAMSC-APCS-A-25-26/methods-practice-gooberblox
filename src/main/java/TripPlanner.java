import java.text.DecimalFormat;
import java.util.Scanner;

public class TripPlanner {
    public static void main(String[] args) {
        // TODO: Get user input for trip details
        // - Distance (miles)
        // - Average speed (mph)
        // - Fuel efficiency (miles per gallon)
        // - Fuel price per gallon
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter trip distance (miles): ");
        double dist = scan. nextDouble();
        System.out.print("Enter average speed (mph): ");
        double speedAvg = scan.nextDouble();
        System.out.print("Enter fuel efficiency (miles per gallon): ");
        double mpg = scan.nextDouble();
        System.out.print("Enter fuel price per gallon ($): ");
        double fprice = scan.nextDouble();

        displayResults(
                calculateTravelTime(speedAvg,dist),
                calculateFuelNeeded(mpg,fprice,dist),
                calculateTripCost(fprice,calculateFuelNeeded(mpg,fprice,dist))
        );

        // TODO: Calculate travel time using a return method
        
        // TODO: Calculate fuel needed using a return method
        
        // TODO: Calculate trip cost using a return method
        
        // TODO: Display results using a void method
        
    }
    
    // TODO: Implement calculateTravelTime method
    static double calculateTravelTime(double avgSpeed,double distance) {return distance/avgSpeed;}
    // TODO: Implement calculateFuelNeeded method
    static double calculateFuelNeeded(double mpg, double price, double dist) {return (dist/mpg);}
    // TODO: Implement calculateTripCost method
    static double calculateTripCost(double price, double fuelNeeded) {return fuelNeeded*price;}
    // TODO: Implement displayResults method
    static void displayResults(double travelTime, double fuelNeeded, double tripCost) {
        DecimalFormat format = new DecimalFormat("0.00");
        System.out.println("\nResults:");
        System.out.println("Travel time: "+format.format(travelTime)+" hours");
        System.out.println("Fuel needed: "+format.format(fuelNeeded)+" gallons");
        System.out.println("Trip Cost: $"+format.format(tripCost));
    }
}
