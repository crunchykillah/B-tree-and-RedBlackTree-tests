
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Formatter;

public class HTMLFileWriter {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("hello.html");

            writer.write("aasadsfdsf\n");
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            FileWriter writer = new FileWriter("hello.html", true);

            String str = new Formatter().format("hello %s\n", "world!").toString();

            writer.append(str);
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        try {
            PrintWriter writer = new PrintWriter(new FileWriter("hello.html", true));

            writer.printf("hello 2 %s", "world!");

            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}