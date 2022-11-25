import java.io.FileWriter;
import java.io.IOException;

public class HTMLStudentWriter extends HTMLPersonWriter {

    private Student student;

    public HTMLStudentWriter(Student student, String fileName) {
        // Вызов базового конструктора
        super(student, fileName);
        this.student = student;
    }

    protected void printAddedInfo(FileWriter writer) throws IOException {
        writer.write("<div>" + student.getGroup() + "</div>\n");
        writer.write("<div>" + student.getYear() + "</div>\n");
    }

}