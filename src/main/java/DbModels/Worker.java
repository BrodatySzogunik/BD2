package DbModels;

public class Worker {
    public int worker_id;
    public int person_id;
    public String job_position;

    public Worker(int worker_id, int person_id, String job_position) {
        this.worker_id = worker_id;
        this.person_id = person_id;
        this.job_position = job_position;
    }
}
