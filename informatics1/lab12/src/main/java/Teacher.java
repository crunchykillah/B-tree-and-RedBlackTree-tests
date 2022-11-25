import java.util.Arrays;

public class Teacher extends Person {

    private String position;
    private String[] cources;

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String[] getCources() {
        return cources;
    }

    public void setCources(String[] cources) {
        this.cources = cources;
    }
}