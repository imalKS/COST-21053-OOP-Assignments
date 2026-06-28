/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab04;

public final class UniversityPolicy {

    public static final String UNIVERSITY_NAME = "University of Kelaniya";
    public static final double BONUS_RATE = 0.10;  // 10% bonus

    public static void showPolicyHeader() {
        System.out.println("==============================");
        System.out.println("  " + UNIVERSITY_NAME);
        System.out.println("  Staff Payment System");
        System.out.println("==============================");
    }

    public static double calculateBonus(double monthlyPayment) {
        return monthlyPayment * BONUS_RATE;
    }
}
