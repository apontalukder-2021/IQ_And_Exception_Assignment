
import java.util.Scanner;

public class Runner2 {
    public static void main(String[] args) {
        StudentDatabase db = new StudentDatabase();
        db.loadFromFile("students.csv"); // Load the data from CSV file

        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n1. Display All Students\n2. Search Student\n3. Update Marks\n4. Delete Student\n5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    db.displayAllStudents();
                    break;
                case 2:
                    System.out.print("Enter roll number to search: ");
                    int searchRoll = scanner.nextInt();
                    Student student = db.searchStudent(searchRoll);
                    System.out.println((student != null) ? student : "Student not found.");
                    break;
                case 3:
                    System.out.print("Enter roll number to update: ");
                    int updateRoll = scanner.nextInt();
                    System.out.print("Enter new marks: ");
                    double newMarks = scanner.nextDouble();
                    boolean updated = db.updateStudent(updateRoll, newMarks);
                    System.out.println(updated ? "Update successful." : "Student not found.");
                    break;
                case 4:
                    System.out.print("Enter roll number to delete: ");
                    int deleteRoll = scanner.nextInt();
                    boolean deleted = db.deleteStudent(deleteRoll);
                    System.out.println(deleted ? "Deletion successful." : "Student not found.");
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 5);

        scanner.close();
    }
}
