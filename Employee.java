abstract class Employee {
    private String name;
    private String dob;
    private String pan;
    private String aadhaar;
    private String doj;

    public Employee(String name, String dob, String pan, String aadhaar, String doj) {
        this.name = name;
        this.dob = dob;
        this.pan = pan;
        this.aadhaar = aadhaar;
        this.doj = doj;
    }

    public String getName() { return name; }
    public String getDob() { return dob; }
    public String getPan() { return pan; }
    public String getAadhaar() { return aadhaar; }
    public String getDoj() { return doj; }

    abstract void display();
}
