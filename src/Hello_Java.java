// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.


import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

public class Hello_Java {
    public static void main(String[] args) {

        //HASHSET, TREESET

        Set<String> a = new HashSet<>();

        a.add("BBB");
        a.add("AAA");
        a.add("AAB");
        a.add("AAA");
        a.add("AAC");

        System.out.println(a);


        Set<String> b = new TreeSet<>();

        b.add("BBB");
        b.add("AAA");
        b.add("AAB");
        b.add("AAA");
        b.add("AAC");

        System.out.println(b);


        Set<Key> c = new TreeSet<>(); //user comparable

        c.add(new Key(0));
        c.add(new Key(6));
        c.add(new Key(2));
        c.add(new Key(1));
        c.add(new Key(2));

        System.out.println(c);


        Set<Key> d = new TreeSet<>(new KeyReverseComparator().reversed()); //use comparator

        d.add(new Key(0));
        d.add(new Key(6));
        d.add(new Key(2));
        d.add(new Key(1));
        d.add(new Key(2));

        System.out.println(d);


        //HASHMAP, TREEMAP

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "cat");
        map.put(2, "dog");
//        map.put(3, "frog");
        map.put(4, "rat");
        map.put(5, "bear");
        map.put(6, "bear");
        map.put(3, "elephant");

        String key = map.get("rat");
        System.out.println("key of map: " + key);

        Set<Integer> integerSet = map.keySet();
        System.out.println("integerSet: " + integerSet);

        Collection<String> values = map.values();
        System.out.println("values: " + values);

        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        System.out.println("entries: " + entries);


        Map<Integer, String> map1 = new TreeMap<>();
        map1.put(5, "cat");
        map1.put(2, "dog");
        map1.put(3, "frog");
        map1.put(4, "rat");
        map1.put(1, "bear");
        map1.put(6, "bear");
        map1.put(3, "elephant");

        System.out.println("map1: " + map1);


        //QUEUE, DEQUEUE

        Queue<String> stringQueue = new LinkedList<>();
        stringQueue.add("a");
        stringQueue.add("k");
        stringQueue.offer("b");
        stringQueue.offer("c");
        stringQueue.offer(String.valueOf('d'));
        stringQueue.add("e");

        System.out.println("stringQueue: " + stringQueue);

        System.out.println("PEEK: " + stringQueue.peek() + "\n" +
                "stringQueue with PEEK: " + stringQueue);

        System.out.println("POOL: " + stringQueue.poll() + "\n" +
                "stringQueue with POOL: " + stringQueue);


        //STACK

        Stack<String> stringStack = new Stack<>();
        stringStack.push("a");
        stringStack.push("k");
        stringStack.push("b");
        stringStack.push("c");
        stringStack.push(String.valueOf('d'));
        stringStack.push("e");

        System.out.println("stringStack: " + stringStack);

        System.out.println("PEEK: " + stringStack.peek() + "\n" +
                "stringStack with PEEK: " + stringStack);

        System.out.println("POP: " + stringStack.pop() + "\n" +
                "stringStack with POP: " + stringStack);


        //ITERATOR

        List<String> arrayList = new ArrayList<>();
        arrayList.add("a");
        arrayList.add("b");
        arrayList.add("c");
        arrayList.add("d");
        arrayList.add("e");

        Iterator<String> stringIterator = arrayList.iterator();

        System.out.println("stringIterator.next(): " + stringIterator.next());
        System.out.println("stringIterator.next(): " + stringIterator.next());
        stringIterator.remove();
        System.out.println("stringIterator: " + arrayList);
        System.out.println("stringIterator.next(): " + stringIterator.next());


        List<String> objects = new CopyOnWriteArrayList<>();


        Set<String> objects1 = new CopyOnWriteArraySet<>();
        Map<String, String> objects2 = new ConcurrentHashMap<>();

    }


    //GENERIC

    Page<String> a = new Page<>();
    List<String> posts = a.getPosts();

    Page<Integer> b = new Page<>();
    List<Integer> posts1 = b.getPosts();


    PageExtendsSmth<Integer> c = new PageExtendsSmth<>();
    PageExtendsSmth<Double> c1 = new PageExtendsSmth<>();
}



