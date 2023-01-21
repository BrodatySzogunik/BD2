package DbModels;

public class Car {
    public int car_id;
    public String drivetrain;
    public int engine_id;
    public int gearbox_id;
    public int additional_color_id;
    public int interior_color_id;
    public int main_color_id;
    public int model_id;
    public int wheel_id;

    public Car(String drivetrain, int engineId, int gearboxId, int additionalColorId, int interiorColorId, int mainColorId, int modelId, int wheelId) {
        this.drivetrain = drivetrain;
        this.engine_id = engineId;
        this.gearbox_id = gearboxId;
        this.additional_color_id = additionalColorId;
        this.interior_color_id = interiorColorId;
        this.main_color_id = mainColorId;
        this.model_id = modelId;
        this.wheel_id = wheelId;
    }
}
