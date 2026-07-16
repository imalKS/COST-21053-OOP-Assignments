/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Question_03;

/**
 *
 * @author imal
 */

public class StudentMarkReport {
    private final String[] marks;

    public StudentMarkReport(String[] marks) {
        this.marks = marks;
    }

    public int getMarkAt(int index) {
        String selected = marks[index];
        return Integer.parseInt(selected);
    }
}
