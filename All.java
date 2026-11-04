public class All {

    public static void main(String[] args) {
        UniversityPayrollSystem payroll = new UniversityPayrollSystem();

        Lecturer lecturer1 = new FullTimeLecturer(
                "C1200675", "anaseeti", 180, 300, 2500);
        Lecturer lecturer2 = new FullTimeLecturer(
                "c12389", "Fadumeeti", 150, 10, 1500);

        Lecturer lecturer3 = new PartTimeLecturer(
                "c12408", "Mohamed yaasir", 600, 4000);
        Lecturer lecturer4 = new PartTimeLecturer(
                "c12409", "Amina Yusuf", 405, 305);
        Lecturer lecturer5 = new PartTimeLecturer(
                "c12406", "Abdi yaxye", 50, 45);

        payroll.addLecturer(lecturer1);
        payroll.addLecturer(lecturer2);
        payroll.addLecturer(lecturer3);
        payroll.addLecturer(lecturer4);
        payroll.addLecturer(lecturer5);

        System.out.println("\n=== ALL LECTURERS ===");
        payroll.displayAllLecturers();

        payroll.displayHighestPaidLecturer();

        System.out.println("\n=== PAYROLL SUMMARY ===");
        System.out.printf("Full-Time Payroll: $%,.2f%n",
                payroll.calculateFullTimePayroll());
        System.out.printf("Part-Time Payroll: $%,.2f%n",
                payroll.calculatePartTimePayroll());
        System.out.printf("Total Payroll: $%,.2f%n",
                payroll.calculateFullTimePayroll()
                        + payroll.calculatePartTimePayroll());

        payroll.displayLecturersEarningMoreThan(2000);
    }
}
