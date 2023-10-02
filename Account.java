abstract class Account {
    /**
     * This is an abstract class meant to share common variables for each account type.
     */
    // Instance variables
    private String name;
    private String address;
    private String email;
    private String phone;

    protected Account(String name, String address, String email, String phone) {
        // Constructor for account
        this.name = name;
        this.address = address;
        this.email = email;
        this.phone = phone;
    }

    // Accessors
    public String getName() {
        return this.name;
    }
    public String getAddress() {
        return this.address;
    }
    public String getEmail() {
        return this.email;
    }
    public String getPhone() {
        return this.phone;
    }
}


class InstructorAccount extends Account {
    /**
     * Instructor class used by instructors
     */
    // Instance variables
    private long instructorID;

    public InstructorAccount(String name, String address, String email, String phone, Long instructorID) {
        // Constructor and inherit from superclass
        super(name, address, email, phone);
        this.instructorID = instructorID;
    }

    // Accessor
    public Long getInstructorID() {
        return this.instructorID;
    }
    
    public void sendAutomaticEmail(String content) {
        // Sends an email to all students automatically
    }
}


class StudentAccount extends Account {
    /**
     * Student class used by students
     */
    // Instance variables
    private Long studentID;
    private String dob; // Should be datetime object but no need since not using
    private String emergencyContact;

    public StudentAccount(String name, String address, String email, String phone, Long studentID, String dob, String emergencyContact) {
        // Instructor and inherit from superclass
        super(name, address, email, phone);
        this.studentID = studentID;
        this.dob = dob;
        this.emergencyContact = emergencyContact;
    }

    // Accessors
    public Long getStudentID() {
        return this.studentID;
    }
    public String getDob() {
        return this.dob;
    }
    public String getEmergencyContact() {
        return this.emergencyContact;
    }
}
