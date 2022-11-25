import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class HTMLTeacherWriter extends HTMLPersonWriter{
    private Teacher teacher;

    public HTMLTeacherWriter(Teacher teacher, String fileName) {
        super(teacher, fileName);
        this.teacher = teacher;
    }
    protected void printAddedInfo(FileWriter writer) throws IOException {
        writer.write("<div>" + teacher.getPosition() + "</div>\n");
        writer.write("<div>" + Arrays.toString(teacher.getCources()) + "</div>\n");
    }




}
