public class StudentManager {

    private static final int MAX_STUDENTS = 5; // Constant (best practice)
    private String[] students;
    private int count;

    // Constructor
    public StudentManager() {
        students = new String[MAX_STUDENTS];
        count = 0;
    }

    // Add a student if space is available
    public boolean addStudent(String name) {
        if (name == null || name.isBlank()) return false; // Input validation
        if (count < MAX_STUDENTS) {
            students[count++] = name.trim(); // Trim input (common issue)
            return true;
        }
        return false;
    }

    // Print all student names
    public void printStudents() {
        System.out.println("Registered Students:");
        for (int i = 0; i < count; i++) {
            System.out.printf("%d. %s%n", i + 1, students[i]);
        }
    }

    // Search for a student
    public int findStudent(String name) {
        if (name == null) return -1;
        for (int i = 0; i < count; i++) {
            if (students[i].equalsIgnoreCase(name.trim())) return i;
        }
        return -1; // Not found
    }

    // Entry point
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();
        manager.addStudent(" Alice ");
        manager.addStudent("bob");
        manager.addStudent("Charlie");
        manager.printStudents();

        int index = manager.findStudent("  bob ");
        System.out.println(index >= 0 ? "Student found at index: " + index : "Student not found.");
    }
}

