// Interface for lodging an enquiry
interface LodgeEnquiry {
    void lodgeEnquiry(String enquiryId, String information);
}

// Interface for addressing an enquiry
interface AddressEnquiry {
    void addressEnquiry(String enquiryId, String information);
}

// LodgeEnquiry is implemented by the User class
class User implements LodgeEnquiry {
    @Override
    public void lodgeEnquiry(String enquiryId, String information) {
        System.out.println("Enquiry ID: " + enquiryId + "\nUser lodges an enquiry: " + information);
    }
}

// Enquiry class
class Enquiry {
    // Methods related to Enquiry
}

// AddressEnquiry is implemented by the Manager class
class Manager implements AddressEnquiry {
    @Override
    public void addressEnquiry(String enquiryId, String information) {
        System.out.println("\nEnquiry ID: " + enquiryId + "\nManager addresses the enquiry: " + information);
    }
}

// Main class for instantiating classes and run the sequence of methods
public class Main {
    public static void main(String[] args) {
        // Instantiate objects
        User user = new User();
        Enquiry enquiry = new Enquiry();
        Manager manager = new Manager();

        // User lodges an enquiry
        user.lodgeEnquiry("s1234567","Hello Manager, I want to leave this course. Will I be fully refunded if so?");

        // Manager addresses the enquiry
        manager.addressEnquiry("s1234567","Hello User, depending on your chosen course, you may be eligible for a refund. Please email the finance manager for further discussion.");
    }
}
