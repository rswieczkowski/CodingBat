package pl.map_2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class AllSwap {

    public String[] allSwap(String[] strings) {

        Map<String, Integer> map = new HashMap<>();
        String firstChr = "";

        for (int i = 0; i < strings.length; i++) {
            firstChr = strings[i].substring(0, 1);

            if (map.containsKey(firstChr)) {
                int index = map.get(firstChr);
                String temp = strings[i];
                strings[i] = strings[index];
                strings[index] = temp;
                map.remove(firstChr);
            } else {
                     map.put(firstChr, i);
            }

        }
        return strings;
    }


}
