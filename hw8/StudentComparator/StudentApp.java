import java.util.Arrays;

public class StudentApp {
    public static void main(String[] args) {

        Student s1 = new Student(110, "Ramil", "Huseynov", true, 92, 2000);
        Student s2 = new Student(108, "Leyla", "Mammadova", false, 88, 1999);
        Student s3 = new Student(129, "Nigar", "Aliyeva", false, 95, 2002);
        Student s4 = new Student(101, "Ilkin", "Qasimov", true, 85, 1998);
        Student s5 = new Student(114, "Gunel", "Jafarova", false, 90, 2001);
        Student s6 = new Student(106, "Kamran", "Sadigov", true, 98, 2000);

        Student[] students = {s1, s2, s3, s4, s5, s6};
        Checker checker = new Checker();

        Arrays.sort(students);
        System.out.println("\nIds ascending:");
        for (Student student : students) {
            System.out.println(student);
        }
        System.out.println("\n");
        System.out.println("\nGrade descending / Birth year ascending / Gender (female) / Surname ascending / Name descending / Id ascending:");
        Arrays.sort(students, checker);
        for (Student student : students) {
            System.out.println(student);
        }
    }
}