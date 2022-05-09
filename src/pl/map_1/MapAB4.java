package pl.map_1;

import java.util.Map;

public class MapAB4 {

    public Map<String, String> mapAB4(Map<String, String> map) {

        if (map.containsKey("a") && map.containsKey("b")) {

            int aLength = map.get("a").length();
            int bLength = map.get("b").length();

            if (aLength != bLength) {
                map.put("c", aLength > bLength ? map.get("a") : map.get("b"));
            } else {
                map.put("a", "");
                map.put("b", "");
            }
        }

        return map;

    }

}
