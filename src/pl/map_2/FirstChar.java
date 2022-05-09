package pl.map_2;

import java.util.HashMap;
import java.util.Map;

public class FirstChar {

    public Map<String, String> firstChar(String[] strings) {

        Map<String, String> map = new HashMap<>();

        for (int i = 0; i < strings.length; i++) {
            String key = strings[i].substring(0, 1);
            String value = "";

            if (!map.containsKey(key)) {

                for (int j = i; j < strings.length; j++) {
                    if (key.equals(strings[j].substring(0, 1))) {
                        value += strings[j];
                    }
                }
                map.put(key, value);

            }
        }
        return map;
    }

}
