package lab04;

public class Lab04Main {
    public static void main(String[] args) {

        // System header
        StaffMember.showSystemName();
        UniversityPolicy.showPolicyHeader();

        // Create 3 staff objects (same as Q5)
        Lecturer lec1 = new Lecturer("Dr. Perera", "LEC001", "Computing",
                                      4, 15000.0);
        Lecturer lec2 = new Lecturer("Ms. Fernando", "LEC002", "Mathematics",
                                      3, 12000.0);
        LabAssistant la1 = new LabAssistant("Mr. Silva", "LA001", "Electronics",
                                             80, 350.0);

        // Change department of one object
        lec2.changeDepartment("Science");

        // Display all 3
        System.out.println("\n=== Lecturer 1 ===");
        lec1.displayLecturerDetails();

        System.out.println("\n=== Lecturer 2 ===");
        lec2.displayLecturerDetails();

        System.out.println("\n=== Lab Assistant ===");
        la1.displayLabAssistantDetails();

        // Monthly payments
        double pay1 = lec1.calculateMonthlyPayment();
        double pay2 = lec2.calculateMonthlyPayment();
        double pay3 = la1.calculateMonthlyPayment();

        System.out.println("\n--- Monthly Payments ---");
        System.out.println(lec1.getFullName() + ": " + pay1);
        System.out.println(lec2.getFullName() + ": " + pay2);
        System.out.println(la1.getFullName()  + ": " + pay3);
        System.out.println("Total: " + (pay1 + pay2 + pay3));

        // Staff count
        System.out.println("\nTotal staff created: " + StaffMember.getStaffCount());

        // Common notice for all 3
        System.out.println("\n--- Notices ---");
        lec1.showCommonNotice();
        lec2.showCommonNotice();
        la1.showCommonNotice();
    }
}
