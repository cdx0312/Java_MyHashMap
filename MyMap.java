import java.util.Set;

/**
 * Created by cdxu0 on 2017/7/8.
 */
public interface MyMap<K, V> {
    //remove all of the entries from the map
    public void clear();
    //return true if the specific key is in the map
    public boolean containsKey(K key);
    //return true if the specific value is in the map
    public boolean containsValue(V value);
    //return a set contains all the items in the map
    public Set<Entry<K, V>> entrySet();
    //return the value of specific key
    public V get(K key);
    //return true if the map is empty
    public boolean isEmpty();
    //return the set of the key in the map
    public Set<K> keySet();
    //put a map in this map
    public V put(K key, V value);
    //delete the specific item in this map
    public void remove(K key);
    //return the size of this map
    public int size();
    //reutrn a set of all the value in the map
    public Set<V> values();
    //define an inner class for entry
    public static class Entry<K, V> {
        K key;
        V value;

        public Entry(K key, V value){
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }

        @Override
        public String toString(){
            return "[" + key + ", " + value + "]";
        }
    }

}
