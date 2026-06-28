/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab04;

public class Lecturer extends StaffMember {

    private final int courseCount;
    private final double paymentPerCourse;

    public Lecturer(String fullName, String staffId, String department,
                    int courseCount, double paymentPerCourse) {
        super(fullName, staffId, department);
        this.courseCount = courseCount;
        this.paymentPerCourse = paymentPerCourse;
    }

    @Override
    public double calculateMonthlyPayment() {
        return courseCount * paymentPerCourse;
    }

    public void displayLecturerDetails() {
        displayBasicDetails();  
        System.out.println("Courses    : " + courseCount);
        System.out.println("Pay/Course : " + paymentPerCourse);
    }
}

