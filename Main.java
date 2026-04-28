public class Main {
    public static void main(String[] args) {

        Employee emp = new SalariedEmployee(
                "Pavan",
                "01-01-2000",
                "ABCDE1234F",
                "123456789012",
                "10-10-2024",
                50000
        );

        emp.display();
    }
}
