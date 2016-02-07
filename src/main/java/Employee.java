public class Employee extends Person {
    private String company;

    public Employee(String name, String surname, int age, String company) {
        super(name, surname, age);
        this.company = company;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Company: " + company);
    }

}
