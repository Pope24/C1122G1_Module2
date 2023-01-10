package Ss12_Java_collection_framework.practice.use_HashMap_LinkedListMap_TreeMap_to_save_age_student;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Chinh", 24);
        hashMap.put("Minh", 9);
        hashMap.put("Quoc Anh", 16);
        hashMap.put("Lanh", 1);
        hashMap.put("Hai", 24);
        System.out.println(hashMap);
        Map<String, Integer> treeMap = new TreeMap<>(hashMap);
        System.out.println(treeMap);
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>(16, 0.75f, true);
        linkedHashMap.put("Smith", 30);
        linkedHashMap.put("Anderson", 31);
        linkedHashMap.put("Lewis", 29);
        linkedHashMap.put("Cook", 29);
        System.out.println(linkedHashMap);
        System.out.println("\nThe age for " + "Lewis is " + linkedHashMap.get("Lewis"));
    }
}
