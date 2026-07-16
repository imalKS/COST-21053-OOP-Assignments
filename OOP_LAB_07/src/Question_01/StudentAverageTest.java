/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Question_01;

/**
 *
 * @author imal
 */


public class StudentAverageTest {
    public static void main(String[] args) {
        StudentAverageCalculator calculator = new StudentAverageCalculator(150, 0);

        try {
            int average = calculator.calculateAverage();
            System.out.println("Average: " + average);
        }
        // ArithmeticException occurs because dividing an int by 0 is not allowed
        catch (ArithmeticException e) {
            System.out.println("Error: Number of students cannot be zero.");
        }
        finally {
            System.out.println("Average calculation completed.");
        }

        System.out.println("Program continues...");
    }
}