package ADV12DefiningClassesExercise.P4RawData;

public class Engine {
    private int EngineSpeed;
    private int EnginePower;

    public Engine(int engineSpeed, int enginePower) {
        EngineSpeed = engineSpeed;
        EnginePower = enginePower;
    }

    public int getEngineSpeed() {
        return EngineSpeed;
    }

    public void setEngineSpeed(int engineSpeed) {
        EngineSpeed = engineSpeed;
    }

    public int getEnginePower() {
        return EnginePower;
    }

    public void setEnginePower(int enginePower) {
        EnginePower = enginePower;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "EngineSpeed=" + EngineSpeed +
                ", EnginePower=" + EnginePower +
                '}';
    }
}
