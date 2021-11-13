package ADV16IteratorsAndComparatorsExercise.Exercises.P06StrategyPattern.src;

import ADV16IteratorsAndComparatorsExercise.Exercises.P05ComparingObjects.src.Person;

import java.util.Comparator;

public class NameComparator implements Comparator<ADV16IteratorsAndComparatorsExercise.Exercises.P05ComparingObjects.src.Person> {
    @Override
    public int compare(ADV16IteratorsAndComparatorsExercise.Exercises.P05ComparingObjects.src.Person o1, Person o2) {
        int result = Integer.compare(o1.getName().length(), o2.getName().length());
        if (result == 0) {
            result = Character.compare(o1.getName().toLowerCase().charAt(0), o2.getName().toLowerCase().charAt(0) );
        }
        return result;
    }
}
