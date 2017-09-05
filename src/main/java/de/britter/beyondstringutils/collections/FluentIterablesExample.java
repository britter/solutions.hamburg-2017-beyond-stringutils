package de.britter.beyondstringutils.collections;

import org.apache.commons.collections4.FluentIterable;

import java.util.List;

import static org.apache.commons.collections4.TransformerUtils.stringValueTransformer;

public class FluentIterablesExample {

    public static List<String> getEvenNumbers() {
        List<String> result =
                FluentIterable
                        .of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
                        .filter(i -> i % 2 == 0)
                        .transform(stringValueTransformer())
                        .limit(3)
                        .toList();

        return result;
    }
}
