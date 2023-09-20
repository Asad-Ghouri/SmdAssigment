abstract class Person {
    private int aadharId;
    private String name;
    private String address;
    private int phone;
    private String profession;

    public Person(int aadharId, String name, String address, int phone, String profession) {
        this.aadharId = aadharId;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.profession = profession;
    }

    public abstract String register(String UID);
    public abstract String perform(String duty);
    public abstract String include(String service);
    public abstract String like(String items);
}

class Student extends Person {
    private int studentId;
    private int major;
    private int semester;
    private String college;
    private int grade;

    public Student(int aadharId, String name, String address, int phone, String profession,
                   int studentId, int major, int semester, String college, int grade) {
        super(aadharId, name, address, phone, profession);
        this.studentId = studentId;
        this.major = major;
        this.semester = semester;
        this.college = college;
        this.grade = grade;
    }

    @Override
    public String register(String course) {
        return "Registered for course: " + course;
    }

    @Override
    public String perform(String duty) {
        return "Performed duty: " + duty;
    }

    @Override
    public String include(String service) {
        return "Included service: " + service;
    }

    @Override
    public String like(String items) {
        return "Likes: " + items;
    }

    public int getGrade(String course) {
        // Implement logic to get the grade for a specific course
        return grade;
    }

    public String attend(String className) {
        return "Attended class: " + className;
    }

    public String learn() {
        return "Learned something new";
    }
}

class PGStudent extends Student {
    private String rollNo;
    private String specialization;

    public PGStudent(int aadharId, String name, String address, int phone, String profession,
                     int studentId, int major, int semester, String college, int grade,
                     String rollNo, String specialization) {
        super(aadharId, name, address, phone, profession, studentId, major, semester, college, grade);
        this.rollNo = rollNo;
        this.specialization = specialization;
    }

    public String submitThesis() {
        return "Thesis submitted";
    }
}

class Staff extends Person {
    private String empId;
    private String empRole;
    private String empDept;
    private float empSalary;
    private int empExp;

    public Staff(int aadharId, String name, String address, int phone, String profession,
                 String empId, String empRole, String empDept, float empSalary, int empExp) {
        super(aadharId, name, address, phone, profession);
        this.empId = empId;
        this.empRole = empRole;
        this.empDept = empDept;
        this.empSalary = empSalary;
        this.empExp = empExp;
    }

    @Override
    public String register(String UID) {
        return "Registered UID: " + UID;
    }

    @Override
    public String perform(String duty) {
        return "Performed duty: " + duty;
    }

    @Override
    public String include(String service) {
        return "Included service: " + service;
    }

    @Override
    public String like(String items) {
        return "Likes: " + items;
    }

    public String attendDuty(String duty) {
        return "Attended duty: " + duty;
    }

    public String getPromotion() {
        // Implement logic to determine promotion
        return "Promoted";
    }

    public int getSalary() {
        return (int) empSalary;
    }
}

class Faculty extends Staff {
    private String facultySpecialization;
    private String section;
    private int noOfStudents;
    private String qualification;

    public Faculty(int aadharId, String name, String address, int phone, String profession,
                   String empId, String empRole, String empDept, float empSalary, int empExp,
                   String facultySpecialization, String section, int noOfStudents, String qualification) {
        super(aadharId, name, address, phone, profession, empId, empRole, empDept, empSalary, empExp);
        this.facultySpecialization = facultySpecialization;
        this.section = section;
        this.noOfStudents = noOfStudents;
        this.qualification = qualification;
    }

    public String teach(String course) {
        return "Teaching course: " + course;
    }

    public String assess(String studentGrade) {
        return "Assessing student grade: " + studentGrade;
    }
}

class Technician extends Staff {
    private String techType;

    public Technician(int aadharId, String name, String address, int phone, String profession,
                      String empId, String empRole, String empDept, float empSalary, int empExp,
                      String techType) {
        super(aadharId, name, address, phone, profession, empId, empRole, empDept, empSalary, empExp);
        this.techType = techType;
    }

    public String maintainLab() {
        return "Maintaining the lab";
    }

    public String install(String system) {
        return "Installing: " + system;
    }
}

public class Q2 {
    public static void main(String[] args) {
        // Example usage
        Student student = new Student(12345, "Alice", "123 Main St", 987654321, "Student", 1001, 1, 2, "ABC College", 90);
        System.out.println(student.register("Java Programming"));
        System.out.println(student.perform("Homework"));
        System.out.println(student.attend("Math Class"));
        System.out.println(student.learn());

        Faculty faculty = new Faculty(54321, "Bob", "456 Elm St", 987654322, "Faculty", "F101", "Professor", "Computer Science", 75000, 10, "Computer Science", "A", 50, "Ph.D.");
        System.out.println(faculty.teach("Data Structures"));
        System.out.println(faculty.assess("A"));

        Technician technician = new Technician(7890, "Charlie", "789 Oak St", 987654323, "Technician", "T001", "Technician", "Electronics", 60000, 5, "Electronics Lab");
        System.out.println(technician.maintainLab());
        System.out.println(technician.install("Lab Equipment"));
    }
}
