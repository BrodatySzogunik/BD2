package DbModels;

public class Person {
    public String address;
    public String birthDate;
    public String firstName;
    public String last_name;
    public String pesel;
    public String password;
    public String person_type;

    public Person(String address, String birthDate, String firstName, String last_name, String pesel, String password, String person_type) {
        this.address = address;
        this.birthDate = birthDate;
        this.firstName = firstName;
        this.last_name = last_name;
        this.pesel = pesel;
        this.password = password;
        this.person_type = person_type;
    }
}
