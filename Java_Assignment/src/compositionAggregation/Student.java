package compositionAggregation;
import java.util.ArrayList;
import java.util.List;
/*
 *  * Aggregation has a Weak relation 
 * */

// Course class

class Course {
    private String name;

    public Course(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

// Student class
class Student {
    private String name;
    private List<Course> courses;  // Student has many Courses

    public Student(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public void enroll(Course course) {
        courses.add(course);
    }

    public List<String> listCourses() {
        List<String> courseNames = new ArrayList<>();
        for (Course course : courses) {
            courseNames.add(course.getName());
        }
        return courseNames;
    }

    public static void main(String[] args) {
        Course math = new Course("Mathematics");
        Course science = new Course("Science");

        Student student = new Student("John");

        // Enrolling the student in courses
        student.enroll(math);
        student.enroll(science);

        // Listing the student's courses
        System.out.println(student.listCourses());  // Output: ["Mathematics", "Science"]
    }
}
