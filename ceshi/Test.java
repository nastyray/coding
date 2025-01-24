package ceshi;

import java.sql.SQLOutput;
import java.util.*;

/**
 * ClassName: ceshi.Test
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author lilray
 * @Create 2024/3/3 15:50
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
        Iterator iterator = hashMap.keySet().iterator();
        while (iterator.hasNext()){
            Object key = iterator.next();
            System.out.println("Key:" + key + hashMap.get(key));
        }

        ArrayList arrayList = new ArrayList();
        arrayList.forEach(a -> System.out.println(a));

        arrayList.forEach(a -> System.out.println(a));
        arrayList.stream().forEach(a -> System.out.println(a));
        arrayList.stream().forEach(System.out::println);


        int[] ints = new int[5];

        Map<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);

        map.forEach((key, value) -> System.out.println("Key: " + key + ", Value: " + value));
        map.entrySet().stream()
                .forEach(entry -> System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue()));


    }
}
