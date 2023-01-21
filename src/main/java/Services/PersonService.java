package Services;

import DbModels.Person;

public class PersonService {
    public static void addPerson(String personId , String address, String birthDate, String firstName, String last_name, String pesel, String password, String person_type){
        DatabaseConnector db = new DatabaseConnector();
        db.addPerson(new Person(personId,address,birthDate,firstName,last_name,pesel,password,person_type));
    }
}
