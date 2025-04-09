package lesson6;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;

public class Main {
    public static void main(String[] args) {
        try {
            Teacher[] allTeachers = {
                    new Teacher("ProfessorSmith", "John", 45, "john.smith@mail.com", "055-123-45-67", "Physics"),
                    new Teacher("ProfessorWilliams", "Sarah", 38, "sarah.williams@mail.com", "055-765-43-21", "Biology")
            };


            Student[] allStudents = new Student[5];
            Course[] allCourses = new Course[10];
            Exam[] allExams = new Exam[10];

            for (int i = 0; i < allStudents.length; i++) {
                String id = "STU" + (100 + i);
                String name = "Student_" + (char) ('A' + i);
                int age = 19 + i;
                String email = "student" + i + "@bhos.edu.az";
                String phone = "050-123-45-" + (10 + i);
                allStudents[i] = new Student(id, name, age, email, phone);
            }

            int courseIndex = 0;
            int examIndex = 0;

            for (Student student : allStudents) {
                Course calculusCourse = new Course("C" + courseIndex, "Advanced Calculus_" + courseIndex, allTeachers[0]);
                Course cryptoCourse = new Course("C" + (courseIndex + 1), "Cryptography_" + (courseIndex + 1), allTeachers[1]);

                calculusCourse.addStudent(student);
                cryptoCourse.addStudent(student);

                int calculusScore = 70 + courseIndex;
                int cryptoScore = 80 + courseIndex;

                calculusCourse.grade(student, calculusScore);
                cryptoCourse.grade(student, cryptoScore);

                allCourses[courseIndex] = calculusCourse;
                allCourses[courseIndex + 1] = cryptoCourse;

                allExams[examIndex++] = new Exam("EXAM_" + examIndex, calculusCourse, student, calculusScore);
                allExams[examIndex++] = new Exam("EXAM_" + examIndex, cryptoCourse, student, cryptoScore);

                courseIndex += 2;
            }

            ObjectMapper objectMapper = new ObjectMapper();
            objectMapper.writerWithDefaultPrettyPrinter().writeValue(new File("students.json"), allStudents);
            objectMapper.writerWithDefaultPrettyPrinter().writeValue(new File("teachers.json"), allTeachers);
            objectMapper.writerWithDefaultPrettyPrinter().writeValue(new File("courses.json"), allCourses);
            objectMapper.writerWithDefaultPrettyPrinter().writeValue(new File("exams.json"), allExams);

            System.out.println("✅ Data successfully exported to JSON files.");

        } catch (Exception e) {
            System.err.println("❌ ERROR: " + e.getMessage());
        }
    }
}