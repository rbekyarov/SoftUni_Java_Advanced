package ADV17ExamPrep.E19August2020.p3;

import java.util.ArrayList;
import java.util.List;

public class Clinic {
    private int capacity;
    private List<Pet> pets;

    public Clinic(int capacity) {
        this.capacity = capacity;
        this.pets = new ArrayList<>();
    }
    public void add(Pet pet){
        pets.add(pet);
    }
    public boolean remove(String pet){
       return pets.removeIf(e -> e.getName().equals(pet));
    }
    public Pet getPet(String name, String owner){
        return this.pets.stream().filter(e -> e.getName().equals(name) && e.getOwner().equals(owner))
                .findFirst().orElse(null);
    }
    public Pet getOldestPet(){
        return this.pets.stream().min((p1, p2) -> Integer.compare(p2.getAge(), p1.getAge())).orElse(null);
    }
    public int getCount(){
        return pets.size();
    }
    public String getStatistics(){
        StringBuilder output = new StringBuilder("The clinic has the following patients:");
        output.append(System.lineSeparator());
        this.pets.forEach(e -> output.append(e.getName()).append(" ").append(e.getOwner()).append(System.lineSeparator()));
        return output.toString();
    }
}
