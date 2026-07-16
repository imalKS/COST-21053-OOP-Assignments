/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Question_03;

/**
 *
 * @author imal
 */

public class StudentMarkReportTest {
    public static void main(String[] args) {
        String[] marks = {"78", "82", "absent", "90"};
        StudentMarkReport report = new StudentMarkReport(marks);

        try {
            int mark = report.getMarkAt(6);
            System.out.println("Mark: " + mark);
        }
        // Index 6 does not exist in the array (array only has indexes 0 to 3)
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Selected mark position does not exist.");
        }
        finally {
            System.out.println("Array access checking completed.");
        }

        try {
            int mark = report.getMarkAt(2);
            System.out.println("Mark: " + mark);
        }
        // Index 2 contains "absent", which cannot be converted into an int
        catch (NumberFormatException e) {
            System.out.println("Error: Selected mark is not a valid number.");
        }
        finally {
            System.out.println("Number conversion checking completed.");
        }

        System.out.println("Report checking completed.");
    }
}
