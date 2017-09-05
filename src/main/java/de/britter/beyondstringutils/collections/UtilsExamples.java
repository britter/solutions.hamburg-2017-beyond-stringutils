package de.britter.beyondstringutils.collections;

import org.apache.commons.collections4.ListUtils;
import org.apache.commons.collections4.MapUtils;
import org.apache.commons.collections4.SetUtils;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import static java.util.Arrays.asList;

public class UtilsExamples {

    public static Set<String> setUtilsExample() {
        Set<String> someSet = new HashSet<>();
        someSet.add("one");
        someSet.add("two");
        someSet.add("three");

        Set<String> anotherSet = new HashSet<>();
        anotherSet.add("three");
        anotherSet.add("four");
        anotherSet.add("five");

        return SetUtils.intersection(someSet, anotherSet);
    }

    public static List<List<Integer>> listUtilsExample() {
        List<Integer> numbers = asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        return ListUtils.partition(numbers, 2);
    }

    public static String mapUtilsExample(Map<String, String> map) {
        return MapUtils.getString(map, "key", "fallback");
    }
}
