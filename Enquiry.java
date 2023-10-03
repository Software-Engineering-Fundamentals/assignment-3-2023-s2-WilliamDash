public class Enquiry {
    /**
     * Enquiry class used to store enquiries and their information
     * Includes all variables and functions mentioned in the class diagram
     * Some accessors and mutators have been included (they were not required in the class diagram)
     * Visibility of variables and methods should match class diagram
     */
    // Instance variables
    private Long enquiryID;
    private String information;
    private Boolean status;
    private Manager addressing;
    private String answer;

    public Enquiry(String information) {
        // Constructor for enquiry
        this.information = information;
        this.status = false;
        System.out.println("Created new Enquiry object");
        generateEnquiryID();
    }

    private void generateEnquiryID() {
        // Generating an ID for the enquiry, since this enquiry didn't already exist before now.
        this.enquiryID = 101L; // Dummy fixed ID instead of generating
        System.out.println("Generated (fixed) enquiry ID of: "+this.enquiryID);
    }

    // Accessors
    public Long getEnquiryID() {
        return this.enquiryID;
    }
    public String getInformation() {
        return this.information;
    }
    public Boolean getStatus() {
        return this.status;
    }
    public Manager getAddressing() {
        return this.addressing;
    }
    public String getAnswer() {
        return this.answer;
    }

    // Mutator
    public void setStatus(Boolean status) {
        this.status = status; // false - not answered, true - answered
        System.out.println("Set status of enquiry to: "+status);
    }

    public void answerEnquiry(String answer, Manager addressing) {
        // Answer the enquiry
        this.answer = answer;
        this.addressing = addressing;
        System.out.println("Set enquiry answer to: "+answer);
        System.out.println("Set enquiry addressing to: "+addressing.getName());
    }
}