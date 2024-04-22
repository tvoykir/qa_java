package com.example;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Collection;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class ParametrizedLionTest {

    private String sex;

    private boolean hasMane;

    private Lion lion;

    public ParametrizedLionTest(String sex, boolean hasMane) {
        this.sex = sex;
        this.hasMane = hasMane;
    }

    @Parameterized.Parameters
    public static Collection animalGenders() {
        return List.of(new Object[][] {
                {"Самец", true},
                {"Самка", false}
        });
    }

    @Before
    public void setup() throws Exception  {
        lion = new Lion(new Feline(), sex);
    }

    @Test
    public void checkDoesHaveMane() {
        assertEquals(hasMane, lion.doesHaveMane());
    }
}