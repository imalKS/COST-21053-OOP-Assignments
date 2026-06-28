/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab04;

public abstract class StaffMember {

    private final String fullName;
    private final String staffId;
    protected String department;

   
    private static int staffCount = 0;

    public StaffMember(String fullName, String staffId, String department) {
        this.fullName = fullName;
        this.staffId = staffId;
        this.department = department;
        staffCount++;  
    }

    public String getFullName()    { return fullName; }
    public String getStaffId()     { return staffId; }
    public String getDepartment()  { return department; }

    public static void showSystemName() {
        System.out.println("System: Campus Staff Payment System");
    }

    public static int getStaffCount() {
        return staffCount;
    }

    public final void displayBasicDetails() {
        System.out.println("Name       : " + fullName);
        System.out.println("Staff ID   : " + staffId);
        System.out.println("Department : " + department);
    }

        public abstract double calculateMonthlyPayment();


    // changeDepartment is useful because it controls how the department value is updated.
    public void changeDepartment(String newDepartment) {
        if (newDepartment == null || newDepartment.isEmpty()) {
            System.out.println("Invalid department name. No change made.");
        } else {
            this.department = newDepartment;
        }
    }

    public final void showCommonNotice() {
        System.out.println("[Notice] All staff must submit monthly reports.");
    }
    // StaffMember is abstract because it represents a general concept of a staff member
    // staffCount is static because it belongs to the StaffMember class itself,
}  

    

