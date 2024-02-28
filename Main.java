public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String nameStudent;
        double gradeStudent;

        while (true) {
            System.out.print("Enter name of student or type 'exit' to finish.");
            if (nameStudent.equalsIgnoreCase("exit")) {
                break;
            }

            System.out.print("Enter " + nameStudent + "'s grade: ");
            gradeStudent = scanner.nextDouble();

            students.add(new Student(nameStudent, gradeStudent));
        }

    }

}
