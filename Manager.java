// Import arraylist to store answered enquiries
import java.util.ArrayList;

public class Manager {
    /**
     * Manager class that represents a manager in the system
     */
    // Instance variables
    private Long managerID;
    private String name;
    private ArrayList<Enquiry> answeredEnquiries = new ArrayList<Enquiry>();

    public Manager(Long managerID, String name) {
        // Constructor for manager
        this.managerID = managerID;
        this.name = name;
        System.out.println("Created new manager object");
    }

    // Accessors
    public Long getManagerID() {
        return this.managerID;
    }
    public String getName() {
        return this.name;
    }
    public ArrayList getAnsweredEnquiries() {
        return answeredEnquiries;
    }

    public void addAnsweredEnquiry(Enquiry enquiry) {
        // Adds enquiry to answered enquries, links manager to multiple enquiries
        this.answeredEnquiries.add(enquiry);
        System.out.println("Added enquiry to manager: "+enquiry.getEnquiryID());
    }
}