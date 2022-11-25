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
        for (int i = 0; i < teacher.getCources().length; ++i){
            writer.write("<div>" + teacher.getCources()[i] + "</div>\n");
        }
    }

}
