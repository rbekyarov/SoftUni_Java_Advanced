package ADV17ExamPrep.E19August2020.p3;

import java.util.ArrayList;
import java.util.List;

public class Clinic {
    private int capacity;
    private List<Pet> data;

    public Clinic(int capacity) {

        this.capacity = capacity;
        this.data = new ArrayList<>();
    }
    public void add(Pet pet){
        data.add(pet);
    }
    public boolean remove(String pet){
       return data.removeIf(e -> e.getName().equals(pet));
    }
    public Pet getPet(String name, String owner){
        return this.data.stream().filter(e -> e.getName().equals(name) && e.getOwner().equals(owner))
                .findFirst().orElse(null);
    }
    public Pet getOldestPet(){
        return this.data.stream().min((p1, p2) -> Integer.compare(p2.getAge(), p1.getAge())).orElse(null);
    }
    public int getCount(){
        return data.size();
    }
    public String getStatistics(){
        StringBuilder output = new StringBuilder("The clinic has the following patients:");
        output.append(System.lineSeparator());
        this.data.forEach(e -> output.append(e.getName()).append(" ").append(e.getOwner()).append(System.lineSeparator()));
        return output.toString();
    }
}
