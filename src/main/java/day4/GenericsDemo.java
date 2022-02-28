package day4;

public class GenericsDemo{
    public static void main(String[] args) {
        Node node1 = new Node("Tom", 123);   // key is string, value is int
        // key int, value int
        GenNode<Integer, Integer> node2 = new GenNode<>(123, 123);
        // key Double, value Boolean
        GenNode<Double, Boolean> node3 = new GenNode<>(1.2, true);
        ///\
        Integer[] arr = {1,2,23,4};
        System.out.println(getFirstElements(arr));
    }

    public static <E> E getFirstElements(E[] arr) {
        return arr[0];
    }

    public static <E, U> E getFirstElements(E[] arr1, U[] arr2) {
        return arr1[0];
    }

    // <?>


}

class Node {
    String key;
    int value;

    public Node(String key, int value) {
        this.key = key;
        this.value = value;
    }
}

class Node2 {
    int key;
    int value;

    public Node2(int key, int value) {
        this.key = key;
        this.value = value;
    }
}

// -------------------------
class GenNode<K, V> {
    K key;
    V value;

    public GenNode(K key, V value) {
        this.key = key;
        this.value = value;
    }
}