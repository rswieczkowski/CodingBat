package pl.map_1;

import java.util.Map;

public class Topping {

    public Map<String, String> topping1(Map<String, String> map) {

        if (map.containsKey("ice cream")) {
            map.put("ice cream", "cherry");
        }
        map.put("bread", "butter");

        return map;
    }

}
