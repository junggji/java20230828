package ch15collection.lecture;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;

public class C13map {
    public static void main(String[] args) {
        // map 전체 탐색
        Map<String, String> map = new HashMap<>(); // map도 순서보장 XX
        map.put("학생1", "흥민");
        map.put("학생2", "강인");
        map.put("학생3", "민재");

        // 향상된 for
        Set<Map.Entry<String, String>> entries = map.entrySet();
        for(Map.Entry<String, String> entry : entries) { // Map.Entry에는 getKey와 getValue 메소드있음
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

        // keySet
        System.out.println("keySet사용해서 전체탐색"); // key 와 Set 둘다 중복되지 않는다는 특징있음
        Set<String> keys = map.keySet();
        for(String key : keys) {
            System.out.println(key + ":" + map.get(key));
        }

        // forEach
        System.out.println("forEach 메소드로 전체탐색");
        map.forEach((key, value) -> System.out.println(key + " : " + value));

    }
}
