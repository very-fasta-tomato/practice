package ru.ssau.tk.personclasses;

public class Person {
    private String firstName;
    private String lastName;
    int passportId;

    public Person(){

    }
    public Person(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public Person(int passportId){
        this.passportId = passportId;
    }
    public Person(String firstName, String lastName, int passportId){
        this.firstName = firstName;
        this.lastName = lastName;
        this.passportId = passportId;
    }

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

        Person person3 = new Person("Wasd","Qwerty");
        Person person4 = new Person(1234);
        Person person5 = new Person("Wasd", "Qwerty", 1234);
    }
}
