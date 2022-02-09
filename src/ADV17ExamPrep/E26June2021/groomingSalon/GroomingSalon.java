package ADV17ExamPrep.E26June2021.groomingSalon;

import java.util.ArrayList;
import java.util.List;

public class GroomingSalon {
    private int capacity;
    private List<Pet> data;

    public GroomingSalon(int capacity) {
        this.capacity = capacity;
        this.data = new ArrayList<>();
    }

    public void add(Pet pet) {
        if (capacity > data.size()) {
            data.add(pet);
        }

    }

    public boolean remove(String name) {
        return data.removeIf(e -> e.getName().equals(name));
    }

    public Pet getPet(String name, String owner) {
        return this.data.stream().filter(e -> e.getName().equals(name) && e.getOwner().equals(owner))
                .findFirst().orElse(null);
    }

    public int getCount() {
        return data.size();
    }

    public String getStatistics() {

        StringBuilder output = new StringBuilder();
        output.append("The grooming salon has the following clients:");
        output.append(System.lineSeparator());
        this.data.forEach(e -> output.append(e.getName()).append(" ").append(e.getOwner()).append(System.lineSeparator()));
        return output.toString();
    }
}