package personclasses;

public class Person {
    private String firstName;
    private String lastName;
    int passportId;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getPassportId() {
        return passportId;
    }

    public void setPassportId(int passportId) {
        this.passportId = passportId;
    }

    public static void main(String[] args){
        Person person1 = new Person();
        person1.setFirstName("Wasd");
        person1.setLastName("Qwerty");
        person1.setPassportId(1234);
        Person person2 = new Person();
        person2.setFirstName("Zxcv");
        person2.setLastName("Tfgh");
        person2.setPassportId(5678);
    }
}
