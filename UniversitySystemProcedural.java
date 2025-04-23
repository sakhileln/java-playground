import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UniversitySystemProcedural {

    // Data structures to hold university information
    static List<Map<String, String>> students = new ArrayList<>();
    static List<Map<String, String>> courses = new ArrayList<>();
    static Map<String, String> departments = new HashMap<>(); // Department name -> Head name
    static Map<String, List<String>> departmentCourses = new HashMap<>(); // Department name -> List of course codes
    static Map<String, String> studentEnrollments = new HashMap<>(); // Student ID -> Course Code

    // Functions to manage students
    static void addStudent(String name, String studentId, String major) {
        Map<String, String> student = new HashMap<>();
        student.put("name", name);
        student.put("studentId", studentId);
        student.put("major", major);
        students.add(student);
        System.out.println("Student " + name + " added.");
    }

    static Map<String, String> getStudent(String studentId) {
        for (Map<String, String> student : students) {
            if (student.get("studentId").equals(studentId)) {
                return student;
            }
        }
        return null;
    }

    static void enrollStudent(String studentId, String courseCode) {
        studentEnrollments.put(studentId, courseCode);
        Map<String, String> student = getStudent(studentId);
        Map<String, String> course = getCourse(courseCode);
        if (student != null && course != null) {
            System.out.println(student.get("name") + " enrolled in " + course.get("name"));
        } else {
            System.out.println("Error: Student or course not found.");
        }
    }

    static String getEnrolledCourse(String studentId) {
        return studentEnrollments.get(studentId);
    }

    // Functions to manage courses
    static void addCourse(String name, String courseCode, String departmentName) {
        Map<String, String> course = new HashMap<>();
        course.put("name", name);
        course.put("courseCode", courseCode);
        courses.add(course);

        departmentCourses.computeIfAbsent(departmentName, k -> new ArrayList<>()).add(courseCode);
        System.out.println("Course " + name + " added to " + departmentName + ".");
    }

    static Map<String, String> getCourse(String courseCode) {
        for (Map<String, String> course : courses) {
            if (course.get("courseCode").equals(courseCode)) {
                return course;
            }
        }
        return null;
    }

    // Functions to manage departments
    static void addDepartment(String name, String headName) {
        departments.put(name, headName);
        System.out.println("Department " + name + " created with head " + headName + ".");
    }

    static String getDepartmentHead(String departmentName) {
        return departments.get(departmentName);
    }

    static void listDepartmentCourses(String departmentName) {
        List<String> codes = departmentCourses.get(departmentName);
        System.out.println("Courses offered by " + departmentName + ":");
        if (codes != null) {
            for (String code : codes) {
                Map<String, String> course = getCourse(code);
                if (course != null) {
                    System.out.println("- " + course.get("name") + " (" + course.get("courseCode") + ")");
                }
            }
        } else {
            System.out.println("No courses offered by this department.");
        }
    }

    public static void main(String[] args) {
        addDepartment("Computer Science", "Dr. Sakhile");

        addCourse("Introduction to Programming", "CS101", "Computer Science");
        addCourse("Data Structures and Algorithms", "CS201", "Computer Science");

        listDepartmentCourses("Computer Science");

        addStudent("Katie", "12345", "Computer Science");
        enrollStudent("12345", "CS101");

        Map<String, String> katieInfo = getStudent("12345");
        if (katieInfo != null) {
            System.out.println(katieInfo.get("name") + " is majoring in " + katieInfo.get("major"));
            String enrolledCourseCode = getEnrolledCourse("12345");
            if (enrolledCourseCode != null) {
                Map<String, String> enrolledCourse = getCourse(enrolledCourseCode);
                System.out.println("Katie is enrolled in: " + enrolledCourse.get("name"));
            }
        }

        addStudent("Moise", "67890", ""); // Moise's major is not specified yet
        if (getEnrolledCourse("67890") == null) {
            Map<String, String> moiseInfo = getStudent("67890");
            if (moiseInfo != null) {
                System.out.println(moiseInfo.get("name") + " is not currently enrolled in a course.");
            }
        }
    }
}