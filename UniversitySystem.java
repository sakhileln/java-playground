// Encapsulation: Student class bundles data (name, studentId) and behavior (enroll)
class Student {
    private String name;
    private String studentId;
    private Course enrolledCourse; // Composition/Aggregation: A student *might* be enrolled in a course

    public Student(String name, String studentId) {
        this.name = name;
        this.studentId = studentId;
        this.enrolledCourse = null; // Initially not enrolled
    }

    public String getName() {
        return name;
    }

    public String getStudentId() {
        return studentId;
    }

    public void enroll(Course course) {
        this.enrolledCourse = course;
        System.out.println(name + " enrolled in " + course.getName());
    }

    public Course getEnrolledCourse() {
        return enrolledCourse;
    }
}

// Abstraction: Course class focuses on what a course is (name, code)
class Course {
    private String name;
    private String courseCode;

    public Course(String name, String courseCode) {
        this.name = name;
        this.courseCode = courseCode;
    }

    public String getName() {
        return name;
    }

    public String getCourseCode() {
        return courseCode;
    }
}

// Inheritance: UndergraduateStudent *is a* Student, inheriting basic student properties
class UndergraduateStudent extends Student {
    private String major;

    public UndergraduateStudent(String name, String studentId, String major) {
        super(name, studentId); // Call the constructor of the superclass
        this.major = major;
    }

    public String getMajor() {
        return major;
    }

    // Polymorphism: UndergraduateStudent might have a different way of "study" compared to a GraduateStudent (if we had one)
    public void study() {
        System.out.println(getName() + " is studying for their " + major + " exams.");
    }
}

// Composition: Department *has-a* Head (strong relationship - if the department is gone, the head's role within it is gone)
class Head {
    private String name;

    public Head(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Department {
    private String name;
    private Head head; // Composition
    private java.util.List<Course> courses; // Aggregation (a course can exist independently)

    public Department(String name, Head head) {
        this.name = name;
        this.head = head;
        this.courses = new java.util.ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public Head getHead() {
        return head;
    }

    public void addCourse(Course course) {
        this.courses.add(course);
    }

    public void listCourses() {
        System.out.println("Courses offered by " + name + ":");
        for (Course course : courses) {
            System.out.println("- " + course.getName() + " (" + course.getCourseCode() + ")");
        }
    }
}

public class UniversitySystem {
    public static void main(String[] args) {
        Head csHead = new Head("Dr. Sakhile");
        Department computerScience = new Department("Computer Science", csHead);

        Course introToProgramming = new Course("Introduction to Programming", "CS101");
        Course dataStructures = new Course("Data Structures and Algorithms", "CS201");

        computerScience.addCourse(introToProgramming);
        computerScience.addCourse(dataStructures);
        computerScience.listCourses();

        UndergraduateStudent moise = new UndergraduateStudent("Moise", "12345", "Computer Science");
        moise.enroll(introToProgramming);
        moise.study();

        Student nwables = new Student("Nwables", "67890");
        if (nwables.getEnrolledCourse() == null) {
            System.out.println(nwables.getName() + " is not currently enrolled in a course.");
        }
    }
}