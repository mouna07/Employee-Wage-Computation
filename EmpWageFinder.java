import java.util.Scanner;

public class EmpWageFinder {
    public static void main(String[] args) throws Exception {

        // Welcome message
        System.out.println("Welcome to Employee Wedge Builder...");
        System.out.println("************************************\n");

        int num;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter No. of Companies");
        num = scanner.nextInt();
        // Objects
        EmpWageCalculation empWageBuilder = new EmpWageBuilderArray(num);
        for (int i = 0; i < num; i++) {
            System.out.println(
                    "Enter Company Details as given:\n CompanyName EmployeeRatePerHr NoOfWorkingDays MaxHrsPerMonth");
            empWageBuilder.addCompanyEmpWage(scanner.next(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
        }
        System.out.println("");
        // Method calls
        empWageBuilder.computeEmpWage();

    }// End main
}
