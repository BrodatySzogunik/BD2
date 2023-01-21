package DbModels;

public class Car {
    public String drivetrain;
    public int engine_id;
    public int gearboxId;
    public int additionalColorId;
    public int interiorColorId;
    public int mainColorId;
    public int modelId;
    public int wheelId;

    public Car(String drivetrain, int engineId, int gearboxId, int additionalColorId, int interiorColorId, int mainColorId, int modelId, int wheelId) {
        this.drivetrain = drivetrain;
        this.engine_id = engineId;
        this.gearboxId = gearboxId;
        this.additionalColorId = additionalColorId;
        this.interiorColorId = interiorColorId;
        this.mainColorId = mainColorId;
        this.modelId = modelId;
        this.wheelId = wheelId;
    }
}
