package com.stumpf.travisexample

public class AddNumbersTest{

    @Test
    public void AddThreeNumbersTest() {
        assertThat(new AddNumbers().addThreeNumbers(2,3,5), is(10));

    }
}
