package ADV15IteratorsAndComparators.Library;

import java.util.Iterator;

public class Library<T> implements Iterable<T> {

    private T[] items;

    Library(T... items) {
        this.items = items;
    }


    @Override
    public Iterator iterator() {
        return new LibraryIterator();
    }

    private class LibraryIterator implements Iterator {
        private int currentIndex;
        LibraryIterator(){
            this.currentIndex=0;
        }
        @Override
        public boolean hasNext() {
            return this.currentIndex<items.length;
        }

        @Override
        public T next() {
            return items[this.currentIndex++];
        }
    }
}
