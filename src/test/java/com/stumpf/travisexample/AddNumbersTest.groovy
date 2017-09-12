package com.stumpf.travisexample

import org.junit.Test

public class AddNumbersTest{

    @Test
    public void AddThreeNumbersTest() {
        assertThat(new AddNumbers().addThreeNumbers(2,3,5).is(10));

    }
}
