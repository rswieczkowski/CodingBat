package pl.map_2;

import java.util.HashMap;
import java.util.Map;

public class FirstSwap {

    public String[] firstSwap(String[] strings) {

        Map<String, Integer> map = new HashMap<>();
        String firstChr = "";
        int swapped = -1;

        for (int i = 0; i < strings.length; i++) {
            firstChr = strings[i].substring(0, 1);

            if (map.containsKey(firstChr) && map.get(firstChr) != swapped) {
                int index = map.get(firstChr);
                String temp = strings[i];
                strings[i] = strings[index];
                strings[index] = temp;
                map.put(firstChr, swapped);
            } else if (!map.containsKey(firstChr) ) {
                map.put(firstChr, i);
            }

        }
        return strings;
    }

}
