/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Question_02;

public class VehicleRentalTest {

    public static void main(String[] args) {

        Vehicle vehicle1 = new Car(
                "C101",
                "Toyota Camry",
                3,
                6000);

        Vehicle vehicle2 = new Bike(
                "B202",
                "Honda CBR",
                12,
                600);

        vehicle1.displayVehicleInfo();
        System.out.println("Rental Cost : " +
                vehicle1.calculateRentalCost());

        System.out.println();

        vehicle2.displayVehicleInfo();
        System.out.println("Rental Cost : " +
                vehicle2.calculateRentalCost());

        // Runtime polymorphism because the overridden
        // method is selected based on the actual object.

    }

}