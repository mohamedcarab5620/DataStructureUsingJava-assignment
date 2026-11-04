public class UniversityPayrollSystem {

    private Lecturer[] lecturers;

    public UniversityPayrollSystem() {
        lecturers = new Lecturer[50];
    }

    public void addLecturer(Lecturer lecturer) {
        if (lecturer == null) {
            System.out.println("Cannot add a null lecturer.");
            return;
        }

        for (int i = 0; i < lecturers.length; i++) {
            if (lecturers[i] == null) {
                lecturers[i] = lecturer;
                System.out.println("Lecturer added successfully.");
                return;
            }
        }

        System.out.println("Payroll system is full.");
    }

    public void displayAllLecturers() {
        boolean found = false;

        for (int i = 0; i < lecturers.length; i++) {
            if (lecturers[i] != null) {
                lecturers[i].displayInformation();
                System.out.println("------------------------------");
                found = true;
            }
        }

        if (!found) {
            System.out.println("No lecturers registered.");
        }
    }

    public void displayHighestPaidLecturer() {
        Lecturer highestPaid = null;

        for (int i = 0; i < lecturers.length; i++) {
            if (lecturers[i] != null) {
                if (highestPaid == null
                        || lecturers[i].calculateSalary() > highestPaid.calculateSalary()) {
                    highestPaid = lecturers[i];
                }
            }
        }

        if (highestPaid == null) {
            System.out.println("No lecturers registered.");
            return;
        }

        System.out.println("\nHighest-Paid Lecturer");
        highestPaid.displayInformation();
    }

    public double calculateFullTimePayroll() {
        double total = 0;

        for (int i = 0; i < lecturers.length; i++) {
            if (lecturers[i] instanceof FullTimeLecturer) {
                total += lecturers[i].calculateSalary();
            }
        }

        return total;
    }

    public double calculatePartTimePayroll() {
        double total = 0;

        for (int i = 0; i < lecturers.length; i++) {
            if (lecturers[i] instanceof PartTimeLecturer) {
                total += lecturers[i].calculateSalary();
            }
        }

        return total;
    }

    public void displayLecturersEarningMoreThan(double amount) {
        boolean found = false;

        System.out.printf("%nLecturers earning more than $%,.2f%n", amount);

        for (int i = 0; i < lecturers.length; i++) {
            if (lecturers[i] != null && lecturers[i].calculateSalary() > amount) {
                lecturers[i].displayInformation();
                System.out.println("------------------------------");
                found = true;
            }
        }

        if (!found) {
            System.out.println("No lecturers found.");
        }
    }
}
