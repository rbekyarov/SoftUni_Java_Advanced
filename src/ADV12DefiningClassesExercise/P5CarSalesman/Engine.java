package ADV12DefiningClassesExercise.P5CarSalesman;

public class Engine {

    private String model;
    private int power;
    //optional
    private int displacements;
    private String efficiency;

    public Engine(String model, int power, int displacements, String efficiency) {
        this.model = model;
        this.power = power;
        this.displacements = displacements;
        this.efficiency = efficiency;
    }

    public Engine(String model, int power, int displacements) {
        this.model = model;
        this.power = power;
        this.displacements = displacements;
    }


    public Engine(String model, int power, String efficiency) {
        this.model = model;
        this.power = power;
        this.efficiency = efficiency;
    }

    public Engine(String model, int power) {
        this.model = model;
        this.power = power;
        this.displacements = 0;
        this.efficiency = "n/a";
    }

    @Override
    public String toString() {
        String displacementsPrint;
        if (displacements == 0) {
            displacementsPrint = "n/a";
        } else {
            displacementsPrint = displacements + "";
        }


        StringBuilder output = new StringBuilder();
        output.append(model).append(":").append("\n")
                .append("Power: ").append(power).append("\n")
                .append("Displacements: ").append(displacements).append("\n")
                .append("Efficiency: ").append(efficiency);
        return output.toString();
    }
}
