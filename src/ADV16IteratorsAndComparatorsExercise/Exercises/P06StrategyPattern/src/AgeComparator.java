package ADV16IteratorsAndComparatorsExercise.Exercises.P06StrategyPattern.src;

import ADV16IteratorsAndComparatorsExercise.Exercises.P05ComparingObjects.src.Person;

import java.util.Comparator;

public class AgeComparator implements Comparator<ADV16IteratorsAndComparatorsExercise.Exercises.P05ComparingObjects.src.Person> {
    @Override
    public int compare(ADV16IteratorsAndComparatorsExercise.Exercises.P05ComparingObjects.src.Person o1, Person o2) {
        return Integer.compare(o1.getAge(), o2.getAge());
    }
}
