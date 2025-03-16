package practice2;

public class Person {
    private String firstName;
    private String lastName;
    private final String ssn;

    Person(String firstName, String lastName, String ssn) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ssn = ssn;
    }
    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSsn() {
        return ssn;
    }
    public void setFirstName(String newFirstName) {
        this.firstName = newFirstName;
    }
    public  void setLastName(String newLastName) {
        this.lastName = newLastName;
    }
    public void printPersonInfo() {
        System.out.println("Name: " + this.firstName + ", LastName: " + this.lastName + ", SSN: " + this.ssn);


    }
}
