package de.britter.beyondstringutils.collections;

import org.jcp.xml.dsig.internal.dom.Utils;
import org.junit.Test;

import java.util.Collections;

import static java.util.Arrays.asList;
import static java.util.Collections.singletonMap;
import static org.assertj.core.api.Assertions.assertThat;

public class UtilsExamplesTest {

    @Test
    public void should_build_intersection() throws Exception {
        assertThat(UtilsExamples.setUtilsExample()).containsOnly("three");
    }

    @Test
    public void should_partition_list() throws Exception {
        assertThat(UtilsExamples.listUtilsExample()).containsExactly(
                asList(1, 2), asList(3, 4), asList(5, 6), asList(7, 8), asList(9, 10));
    }

    @Test
    public void should_safely_get_string_from_map() throws Exception {
        assertThat(UtilsExamples.mapUtilsExample(null)).isEqualTo("fallback");

        assertThat(UtilsExamples.mapUtilsExample(singletonMap("anotherKey", "someValue"))).isEqualTo("fallback");

        assertThat(UtilsExamples.mapUtilsExample(singletonMap("key", "theValue"))).isEqualTo("theValue");
    }
}
