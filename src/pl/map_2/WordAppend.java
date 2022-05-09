package pl.map_2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class WordAppend {

    public static String wordAppend(String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        String result = "";

        for (int i = 0; i < strings.length; i++) {

            String key = strings[i];

            if (map.containsKey(key)) {
                int val = map.get(key);
                val++;
                if (val % 2 == 0) {
                    result += key;
                }
                map.put(key, val);
            } else {
                map.put(key, 1);
            }

        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(wordAppend(new String[]{"a", "b", "a", "c", "a", "d", "a"}));
    }
}
