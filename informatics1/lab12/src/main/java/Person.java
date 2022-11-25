

public class Person {

    protected String fio;
    protected String birthDate;
    protected String gender;


    public String getFio() {
        return new String(fio);
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public String getGender() {
        return gender;
    }

    public String toString() {
        String str = fio + ", " + birthDate + ", "
                + gender;

        return str;
    }

}