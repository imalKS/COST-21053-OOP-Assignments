/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Question_01;

/**
 *
 * @author imal
 */

public class StudentAverageCalculator {
    private final int totalMarks;
    private final int numberOfStudents;

    public StudentAverageCalculator(int totalMarks, int numberOfStudents) {
        this.totalMarks = totalMarks;
        this.numberOfStudents = numberOfStudents;
    }

    public int calculateAverage() {
        return totalMarks / numberOfStudents;
    }
}