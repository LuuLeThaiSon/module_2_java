import java.util.*;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list =new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);


        List<Integer> list1 = new LinkedList<>();
        list1.add(1);
        list1.add(5);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.remove(2);
        Set<Integer> set = new HashSet<>();

//        System.out.println(list1.get(2));

        list.retainAll(list1);
        System.out.println(list1);

        System.out.println("------");
        System.out.println(list);

        list.set(2,5);
        System.out.println(list);

        LinkedList<Integer> list2 = new LinkedList<>();
        ArrayList<Integer> list3;
        list3 = (ArrayList<Integer>) list.clone();

        Map<Integer,Integer> map = new HashMap<>();
        Map<Integer,Integer> map1 = new TreeMap<>();
        Map<Integer,Integer> map2 = new LinkedHashMap<>();
        map2.put(1,11);
        map2.put(2,22);
        map2.put(3,33);
        map2.put(4,44);
        map2.put(5,55);
        Set<Map.Entry<Integer, Integer>> a = map2.entrySet();
        for (Map.Entry<Integer, Integer> m : a) {
            System.out.println(m.getValue());
        }

        System.out.println(map2.entrySet());

        System.out.println(map2.get(4));

        System.out.println(map2.keySet());

        System.out.println(map2.values());

        map2.remove(2);
        System.out.println(map2);

        System.out.println(map2.hashCode());
    }

}

