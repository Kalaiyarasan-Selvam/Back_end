package Generic.Class;
class Pair<K,V> {
    private K key;
    private V value;
    public Pair(K key,V value) {
        this.key=key;
        this.value=value;
    }
    public K getKey() {
        return key;
    }
    public V getValue() {
        return value;
    }
    @Override
    public String toString() {
        return "Pair{"+"key="+key+",value="+value+'}';
    }
}
public class KeyValue {
    public static void main(String[] args) {
        Pair<String,Integer> p1=new Pair<>("Age",21);
        Pair<Integer,String> p2=new Pair<>(56,"Roll Number");
        System.out.println(p1);
        System.out.println(p2);
    }
}

