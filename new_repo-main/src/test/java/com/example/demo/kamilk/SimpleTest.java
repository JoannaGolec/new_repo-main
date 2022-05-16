package com.example.demo.kamilk;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class SimpleTest {
    @Test
    public void shouldAddNumbers() {
        Assertions.assertThat(2+2).isEqualTo(4);
    }
}
