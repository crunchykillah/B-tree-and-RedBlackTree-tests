import java.io.FileWriter;
import java.io.IOException;

public class HTMLPersonWriter {

    private Person person;

    private String fileName;

    public void setPerson(Person person) {
        this.person = person;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public HTMLPersonWriter(Person person, String fileName) {
        this.person = person;
        this.fileName = fileName;
    }

    private void printHeader(FileWriter writer) throws IOException {
        writer.write("<!DOCTYPE html>\n");
        writer.write("<html lang='en'>\n");
        writer.write("<head>\n");
        writer.write("<meta charset='UTF-8'>\n");
        writer.write("<title>Персональная страница</title>\n");
        writer.write("</head>\n");
    }

    private void printBody(FileWriter writer) throws IOException {
        writer.write("<body>\n");

        writer.write("<div>" + person.getFio() + "</div>\n");
        writer.write("<div>" + person.getBirthDate() + "</div>\n");
        writer.write("<div>" + person.getGender() + "</div>\n");
        printAddedInfo(writer);
        writer.write("</body>\n");
    }

    protected void printAddedInfo(FileWriter writer) throws IOException  {

    }

    private void printFoter(FileWriter writer) throws IOException {
        writer.write("</html>\n");
    }

    public void print() {
        try (FileWriter writer = new FileWriter(fileName)) {
            printHeader(writer);
            printBody(writer);
            printFoter(writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}