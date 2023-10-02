public class Enquiry {
    /**
     * Enquiry class used to store enquiries and their information
     */
    // Instance variables
    private Long enquiryID;
    private String information;
    private Boolean status;

    public Enquiry(String information, Boolean status) {
        // Constructor for enquiry
        this.information = information;
        this.status = status;
        generateEnquiryID();
    }

    private void generateEnquiryID() {
        // Generating an ID for the enquiry
        this.enquiryID = 100L; // Dummy fixed ID instead of generating
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

    // Mutator
    public void setStatus(Boolean status) {
        this.status = status;
    }
}
