public class Main {
    /**
     * Main class for instantiating classes and running the sequence of methods
     */
    public static void main(String[] args) {
        // Create Instance of Manager
        Manager exampleManager = new Manager(523L, "Bob");

        // Someone lodges a general enquiry with the system
        Enquiry exampleEnquiry = new Enquiry("Can I pay enrollement with potatoes?");
        // Enquiry is saved to database
        Database.saveEnquiry(exampleEnquiry);

        // A manager answers the enquiry
        exampleEnquiry.answerEnquiry("No we cannot take potatoes as payment.", exampleManager);
        // The enquiry is added to the manager's answered enquiries
        exampleManager.addAnsweredEnquiry(exampleEnquiry);
        // Changes are saved to database
        Database.saveEnquiry(exampleEnquiry);

        // If complete, the manager marks the enquiry as answered
        exampleEnquiry.setStatus(true);
        // Changes are saved to database
        Database.saveEnquiry(exampleEnquiry);
    }
}
