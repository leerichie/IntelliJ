package JavaAdvanced.oop;

import java.util.Collection;
import java.util.Iterator;

class MyCollection implements Collection<String> {
    private final String arr[] = new String[100];
    private int size;

    @Override
    public int size() {
        return 0; // todo
    }

    @Override
    public boolean isEmpty() {
        return false; // todo
    }

    @Override
    public boolean contains(Object o) {
        return false; // todo
    }

    @Override
    public boolean add(String s) {
        return false; // todo
    }

    @Override
    public void clear() {
        // todo
    }

    @Override
    public Object[] toArray() {
        throw new UnsupportedOperationException("dla chętnych");
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        throw new UnsupportedOperationException("dla chętnych");
    }

    @Override
    public boolean addAll(Collection<? extends String> c) {
        throw new UnsupportedOperationException("dla chętnych");
    }

    @Override
    public boolean remove(Object o) {
        throw new UnsupportedOperationException("dla chętnych");
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        throw new UnsupportedOperationException("dla chętnych");
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        throw new UnsupportedOperationException("dla chętnych");
    }

    @Override
    public <T> T[] toArray(T[] a) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Iterator<String> iterator() {
        throw new UnsupportedOperationException();
    }
}

class MyCollectionExercise {


    // piszemy metodę przyjmującą kolekcję i wywołującą kilka metod z niej

    public static void main(String[] args) {
        // tworzymy MyList i przekazujemy do metody zdefiniowanej wyżej

        // dodatkowo: *spróbuj* użyć klasy anonimowej lub lambdy
    }
}