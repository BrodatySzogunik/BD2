package DbModels;

public class Client {
    public int client_id;
    public int person_id;

    public Client(int client_id, int person_id) {
        this.client_id = client_id;
        this.person_id = person_id;
    }
}
