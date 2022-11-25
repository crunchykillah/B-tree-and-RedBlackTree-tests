import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var x = scanner.nextInt();
        if (x == 1){
            Student student = new Student();

            student.setFio("Михаил Сергеевич");
            student.setBirthDate("2000-01-01");
            student.setGender("M");

            student.setYear(2022);
            student.setGroup("11-200");

            HTMLPersonWriter writer
                    = new HTMLStudentWriter(student, "student.html");
            writer.print();

        }else{
            Teacher teacher = new Teacher();

            teacher.setFio("Наталья Юрьевна");
            teacher.setBirthDate("1973-02-20");
            teacher.setGender("Ж");
            teacher.setCources(new String[]{"Russian Language", "Literature"});
            teacher.setPosition("Учитель");
            HTMLPersonWriter writer
                    = new HTMLTeacherWriter(teacher, "teacher2.html");
            writer.print();

        }
    }
}
