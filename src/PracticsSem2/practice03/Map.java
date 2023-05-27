package PracticsSem2.practice03;

public class Map<K, V> {
    private K key;
    private V value;

    public Map(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public String MapReturn() {
        String str = "'" + this.key.toString() + "'" + " " + this.value.toString() + "\n";
        return str;
    }
}
