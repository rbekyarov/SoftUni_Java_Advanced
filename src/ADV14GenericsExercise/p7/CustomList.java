package ADV14GenericsExercise.p7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CustomList<T extends Comparable<T>> {
    //Custom List -> съвкупност от елементи
    private List<T> elements;

    public CustomList() {
        this.elements = new ArrayList<>();
    }

    public void add(T element) {
        this.elements.add(element);
    }
    public T remove(int index) {
        if (index >= 0 && index <= this.elements.size() - 1) { //валиден индекс (0 до последния)
            return this.elements.remove(index);
        }
        throw new IndexOutOfBoundsException("Invalid index");
    }
    public boolean contains(T element) {
        return this.elements.contains(element);
    }
    public void swap (int firstIndex, int secondIndex) {
        if (firstIndex >= 0 && firstIndex <= this.elements.size() - 1 && secondIndex >= 0 && secondIndex <= this.elements.size() - 1) {
            //1. взема елементите на дадените индекси
            T firstIndexElement = this.elements.get(firstIndex);
            T secondIndexElement = this.elements.get(secondIndex);

            //първия индекс -> втория елемент
            //втория индекс -> първия елемент
            this.elements.set(firstIndex, secondIndexElement);
            this.elements.set(secondIndex, firstIndexElement);
        }
        throw new IndexOutOfBoundsException("Invalid index");
    }

    public int countGreaterThan (T element) {
        int count = 0; //брой на елементите, които са по-големи от дадения
        for (T elementInList : this.elements) {
            //0 -> elementInList ==  element
            //1 -> elementInList > element
            //-1 -> elementInList < element
            if (elementInList.compareTo(element) > 0) {
                count++;
            }
        }
        return count;
    }

    public T getMax() {
        return Collections.max(this.elements);
        //return this.elements.stream().max(Comparator.naturalOrder()).get();
    }
    public T getMin() {
        return Collections.min(this.elements);
        //return this.elements.stream().min((e1, e2) -> e1.compareTo(e2)).get();
    }

    public void print() {
        for (T element : this.elements) {
            System.out.println(element);
        }
    }

    public void sort () {
        this.elements.sort((e1, e2) -> e1.compareTo(e2));
        //[3, 1, 5, 2, 8]
        //3 и 1 -> 3 > 1 -> 1 -> сорт (1) -> разменя
        //0 -> e1 e равен на e2
        //1 -> e1 > e2
        //-1 -> e1 < e2

        //sort
        //получи резултат 0 -> не размества стойнсотите
        //получи резулат 1 -> размества стойностите
        //получи резултат -1 -> не размества
    }
}
