public class FullTimeLecturer extends Lecturer {

    private double basicSalary;
    private double researchAllowance;
    private double administrativeAllowance;

    public FullTimeLecturer(
            String id,
            String name,
            double basicSalary,
            double researchAllowance,
            double administrativeAllowance) {

        super(id, name);
        this.basicSalary = basicSalary;
        this.researchAllowance = researchAllowance;
        this.administrativeAllowance = administrativeAllowance;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public double getResearchAllowance() {
        return researchAllowance;
    }

    public void setResearchAllowance(double researchAllowance) {
        this.researchAllowance = researchAllowance;
    }

    public double getAdministrativeAllowance() {
        return administrativeAllowance;
    }

    public void setAdministrativeAllowance(double administrativeAllowance) {
        this.administrativeAllowance = administrativeAllowance;
    }

    @Override
    public double calculateSalary() {
        return basicSalary + researchAllowance + administrativeAllowance;
    }

    @Override
    public void displayInformation() {
        System.out.println("Employment Type: Full-time");
        System.out.println("Lecturer ID: " + getLecturerId());
        System.out.println("Name: " + getName());
        System.out.printf("Basic Salary: $%,.2f%n", basicSalary);
        System.out.printf("Research Allowance: $%,.2f%n", researchAllowance);
        System.out.printf("Administrative Allowance: $%,.2f%n", administrativeAllowance);
        System.out.printf("Total Salary: $%,.2f%n", calculateSalary());
    }
}
