package pl.map_2;

import java.util.HashMap;
import java.util.Map;

public class WordMultiple {

    public Map<String, Boolean> wordMultiple(String[] strings) {

        Map<String, Boolean> map = new HashMap<>();

        for (int i = 0; i < strings.length; i++) {
            if (map.containsKey(strings[i])) {

                map.put(strings[i], true);

            } else {
                map.put(strings[i], false);
            }

        }
        return map;
    }

}
