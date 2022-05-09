package pl.map_2;

import java.util.HashMap;
import java.util.Map;

public class WordCount {

    public Map<String, Integer> wordCount(String[] strings) {

        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < strings.length; i++) {
            int count = 0;
            for (int j = i; j < strings.length; j++) {
                if (strings[i] == strings[j]) {
                    count++;
                }
            }
            if (!map.containsKey(strings[i])) {
                map.put(strings[i], count);
            }
        }
        return map;
    }

}
