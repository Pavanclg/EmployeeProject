class SalariedEmployee extends Employee {
    private double salary;

    public SalariedEmployee(String name, String dob, String pan, String aadhaar, String doj, double salary) {
        super(name, dob, pan, aadhaar, doj);
        this.salary = salary;
    }

    @Override
    void display() {
        System.out.println("Employee Details:");
        System.out.println("Name: " + getName());
        System.out.println("DOB: " + getDob());
        System.out.println("PAN: " + getPan());
        System.out.println("Aadhaar: " + getAadhaar());
        System.out.println("DOJ: " + getDoj());
        System.out.println("Salary: " + salary);
    }
}
