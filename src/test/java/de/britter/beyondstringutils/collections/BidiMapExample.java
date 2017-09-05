package de.britter.beyondstringutils.collections;

import org.apache.commons.collections4.BidiMap;
import org.apache.commons.collections4.bidimap.DualHashBidiMap;

public class BidiMapExample {

    public static void example() {
        BidiMap<String, Integer> map = new DualHashBidiMap<>();
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);

        Integer twoValue = map.get("two");
        String twoKey = map.getKey(2);
    }
}
