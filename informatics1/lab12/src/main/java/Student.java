public class Student extends Person {

    private int year;
    private String group;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String toString() {
        String str = fio + ", " + birthDate + ", "
                + gender + ", " + group;

        return str;
    }
}