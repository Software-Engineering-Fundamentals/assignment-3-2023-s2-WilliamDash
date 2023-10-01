// User class
class User {
    private String userId;

    public User(String userId) {
        this.userId = userId;
    }
// Tracking enquiry by its ID
    public String GenerateEnquiryID() {
        return userId;
    }

// LodgeEnquiry for storing or processing enquiry information
    public void lodgeEnquiry(String enquiry) {
        System.out.println("User lodges a general enquiry:\nEnquiryId: " + userId + "\n" + enquiry);
    }
}

// Instructor class inherited from User
class Instructor extends User {
    public Instructor(String userId) {
        super(userId);
    }
}

// Student class inherited from User
class Student extends User {
    public Student(String userId) {
        super(userId);
    }
}

// Manager class inherited from User
class Manager extends User {
    public Manager(String userId) {
        super(userId);
    }

    public void addressEnquiry(String enquiry) {
        System.out.println("\nManager addresses the enquiry:\nEnquiryId: " + GenerateEnquiryID() + "\n" + enquiry);
        // You can handle the enquiry addressing logic here
    }
}

// Main class for instantiating classes and run the sequence of methods
public class Main {
    public static void main(String[] args) {
        // Instantiate objects
        Student student = new Student("s1234567");
        Instructor instructor = new Instructor("e0123456");
        Manager manager = new Manager("s1234567");

        // Student lodges a general enquiry
        student.lodgeEnquiry("Hello Manager, I want to leave this course. Will I be fully refunded if so?");

        // Manager addresses the enquiry
        manager.addressEnquiry("Hello Student, depending on your chosen course, you may be eligible for a refund. Please email the finance manager for further discussion.\n");

        // Instructor lodges a general enquiry
        instructor.lodgeEnquiry("Hello Manager, how many courses can I register in this portal?");

        // Manager addresses the enquiry
        manager.addressEnquiry("Hello Instructor, you can have one at most.\n");
    }
}
