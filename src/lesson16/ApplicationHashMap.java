package lesson16;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ApplicationHashMap {

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        //.создание мапы
        HashMap<String, Integer> map = new HashMap<>();//<String, List<String>>
        Map<String, List<String>> map1 = new HashMap<>();

        //доб эл-та
        map.put("Dinamo", 5);
        map.put("Shakhter", 3);
        map.put("Spartak", 10);

        //containsKey - вернет сод-ся ли какое то знач-е по ключу
        System.out.println(map.containsKey("Dinamo"));

        //entrySet - возв-т пару ключ-знач-е, getKey(), getValue()
        for (Map.Entry<String, Integer> e : map.entrySet()) {
            System.out.println(e.getKey() + " : " + e.getValue());
        }

        //возвращ-е всех ключей
        for (String key : map.keySet()) {
            System.out.println(key);
        }

        //возвращ-е всех знач-й
        for (String key : map.keySet()) {
            System.out.println(map.get(key));
        }

    }
}
