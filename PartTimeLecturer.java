public class PartTimeLecturer extends Lecturer {

    private double teachingHours;
    private double hourlyRate;

    public PartTimeLecturer(
            String id,
            String name,
            double teachingHours,
            double hourlyRate) {

        super(id, name);
        this.teachingHours = teachingHours;
        this.hourlyRate = hourlyRate;
    }

    public double getTeachingHours() {
        return teachingHours;
    }

    public void setTeachingHours(double teachingHours) {
        this.teachingHours = teachingHours;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary() {
        return teachingHours * hourlyRate;
    }

    @Override
    public void displayInformation() {
        System.out.println("Employment Type: Part-time");
        System.out.println("Lecturer ID: " + getLecturerId());
        System.out.println("Name: " + getName());
        System.out.println("Teaching Hours: " + teachingHours);
        System.out.printf("Hourly Rate: $%,.2f%n", hourlyRate);
        System.out.printf("Total Salary: $%,.2f%n", calculateSalary());
    }
}
