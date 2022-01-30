package ADV17ExamPrep.Exam15December2021.aquarium;

import java.util.*;
import java.util.stream.Collectors;

public class Aquarium {
    private Collection<Fish> fishInPool;
    private Map<String, Fish> fishInPoolMap;
    private String name;
    private int capacity;
    private int size;

    public Aquarium(String name, int capacity, int size) {
        this.name = name;
        this.capacity = capacity;
        this.size = size;
        this.fishInPool = new LinkedHashSet<>();
        this.fishInPoolMap = new LinkedHashMap<>();
    }

    public int getFishInPool() {
        return fishInPool.size();
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getSize() {
        return size;
    }

    public void add(Fish fish) {
        if(!fishInPoolMap.containsKey(fish.getName()) && this.getFishInPool()<capacity){
            fishInPool.add(fish);
            fishInPoolMap.put(fish.getName(), fish);
        }
    }

    public boolean remove(String name) {
        if(fishInPoolMap.containsKey(name)){
            Fish fish = fishInPoolMap.get(name);
            fishInPool.remove(fish);
            fishInPoolMap.remove(fish);
            return true;
        }

        return false;
    }

    public Fish findFish(String name){
        return fishInPoolMap.get(name);
    }

    public String report(){
        StringBuilder report = new StringBuilder();
        report.append(String.format("Aquarium: %s ^ Size: %d%n",this.name,this.size));
        report.append(fishInPool.stream().map(Fish::toString)
                .collect(Collectors.joining(System.lineSeparator())));

        return report.toString();
    }
}