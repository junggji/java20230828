package ch15collection.book.exercise;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class p09 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("blue", 96);
        map.put("hong", 86);
        map.put("white", 92);

        String name = null;
        int maxScore = 0;
        int totalScore = 0;


        Set<Map.Entry<String, Integer>> sett2 = map.entrySet();
        for(Map.Entry<String, Integer> seth : sett2){
            System.out.println(seth.getValue());
        }
//
//        Set<Map.Entry<String, Integer>> sett = map.entrySet();
//        Set<String> key = map.keySet();
//        for(Map.Entry<String, Integer> seth : map.entrySet()){
//            System.out.println(seth.getValue());
//            int nu = seth.getValue();
//        }
//
//
//        System.out.println(key);

    }
}
