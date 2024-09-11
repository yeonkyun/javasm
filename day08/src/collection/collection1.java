package collection;

import java.util.*;

public class collection1 {
    public static void main(String[] args) {
        // List 인터페이스는 중복을 허용함
        // inital capacity 의미는 처음에 몇개의 공간을 할당할 것인지를 의미
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        System.out.println(list);

        // Set 인터페이스는 중복을 허용하지 않음
        Set<Integer> set = new HashSet<Integer>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(3);
        System.out.println(set);

        // Map 인터페이스는 key-value 쌍으로 이루어짐
        Map<String, Integer> map = new HashMap<>();
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);
        map.put("c", 4);
        System.out.println(map);
        System.out.println(map.get("a") + 19);
    }
}
