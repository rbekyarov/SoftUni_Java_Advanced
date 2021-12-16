package ADV12DefiningClassesExercise.P5CarSalesman;

public class Car {
    //model, engine, weight and color.
    private String model;
    private Engine engine;
    //optional
    private int weight;
    private String color;

    public Car(String model, Engine engine, int weight, String color) {
        this.model = model;
        this.engine = engine;
        this.weight = weight;
        this.color = color;
    }

    public Car(String model, Engine engine) {
        this.model = model;
        this.engine = engine;
        this.weight = 0;
        this.color = "n/a";
    }

    public Car(String model, Engine engine, int weight) {
        this.model = model;
        this.engine = engine;
        this.weight = weight;
    }

    public Car(String model, Engine engine, String color) {
        this.model = model;
        this.engine = engine;
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        String weightPrint;
        if (this.weight == 0){
            weightPrint = "n/a";
        }else {
            weightPrint = weight+"";

        }
        StringBuilder output = new StringBuilder();
         output.append(model).append(":").append("\n")
                 .append(engine.toString()).append("\n")
                 .append("Weight: "+weightPrint).append("\n")
                 .append("Color: "+ color);

            return output.toString();
    }
}
