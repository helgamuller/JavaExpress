package practice2;

public class Company {
        static String companyName = "Apple";
        final int employeeID;
        String employeeName;

        Company(int SomeEmployeeID, String SomeEmployeeName) {
            this.employeeID = SomeEmployeeID;
            this.employeeName = SomeEmployeeName;
        }

    public void setEmployeeName(String employeeName) {
    this.employeeName =employeeName;
        }

    public String getEmployeeName() {
           return this.employeeName;
    }

    public static void printCompanyName() {
        System.out.println("Company name is: "+ companyName);
    }

}
