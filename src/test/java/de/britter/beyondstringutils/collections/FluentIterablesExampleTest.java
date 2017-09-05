package de.britter.beyondstringutils.collections;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FluentIterablesExampleTest {

    @Test
    public void should_return_even_numbers() {
        assertThat(FluentIterablesExample.getEvenNumbers()).containsExactly("2", "4", "6");
    }
}
