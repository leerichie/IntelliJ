package JavaAdvanced;

import java.util.*;

class ListIsMap<T> implements Map<Integer, T> {
    private final List<T> list = new ArrayList<>();

    @Override
    public int size() {
        return 0; // todo
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public boolean containsKey(Object key) {
        if (!(key instanceof Integer)){
            return false;
        }
        int keyAsInt = (int) key;
        return keyAsInt >= 0 && keyAsInt < list.size();
    }

    @Override
    public boolean containsValue(Object value) {
        return false;
    }

    @Override
    public T get(Object key) {
        int keyAsInt = (int) key;
        if (!(key instanceof Integer)) return null;
        else if (keyAsInt < list.size() && keyAsInt >= 0) return list.get(keyAsInt);
        else return null;
    }

    @Override
    public T put(Integer key, T value) {
        if (key == list.size()) {
            list.add(value);
            return null;
        } else if (key >= 0 && key <= list.size()) {
            return list.set(key, value);
        } else throw new IllegalArgumentException("Not accepted in order in list");
    }

    @Override
    public T remove(Object key) {
        if (!containsKey(key) || (int) key != list.size()-1) {
            throw new IllegalArgumentException("Incorrect key");
        }
        return list.remove((int)key);
    }

    @Override
    public void clear() {
        list.clear();
    }

    @Override
    public Collection<T> values() {
        return Collections.unmodifiableCollection(list);
    }

    @Override
    public void putAll(Map<? extends Integer, ? extends T> m) {
        throw new UnsupportedOperationException("Nie na dzisiaj");
    }

    @Override
    public Set<Integer> keySet() {
        throw new UnsupportedOperationException("Nie na dzisiaj");
    }

    @Override
    public Set<Entry<Integer, T>> entrySet() {
        throw new UnsupportedOperationException("Nie na dzisiaj");
    }

    public static void main(String[] args) {
        ListIsMap<String> list = new ListIsMap<>();
        list.put(1, "put");
        list.put(2, "put 2");
        list.put(3, "put 3");
        list.remove(1, "remove");

        System.out.println(list);

        Collection<String> values = list.values();
        values.remove("remove");

        System.out.println(values);
    }
}