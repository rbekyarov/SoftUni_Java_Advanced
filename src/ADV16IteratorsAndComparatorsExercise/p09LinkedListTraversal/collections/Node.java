package ADV16IteratorsAndComparatorsExercise.p09LinkedListTraversal.collections;

public class Node {
    Node prev;
    Node next;
    Integer value;

    public Node(int value) {
        this.next = null;
        this.prev = null;
        this.value = value;
    }
}