package ADV12DefiningClassesExercise.P4RawData;

public class Tires {
    private double pressure;
    private int age;

    public Tires(double pressure, int age) {
        this.pressure = pressure;
        this.age = age;
    }

    public double getPressure() {
        return pressure;
    }

    public void setPressure(double pressure) {
        this.pressure = pressure;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Tires{" +
                "pressure=" + pressure +
                ", age=" + age +
                '}';
    }
}