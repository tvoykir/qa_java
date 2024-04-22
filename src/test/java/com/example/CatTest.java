package com.example;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static junit.framework.TestCase.assertEquals;

@RunWith(MockitoJUnitRunner.class)

public class CatTest {

    private Cat cat;

    @Before
    public void setup() {
        cat = new Cat(new Feline());
    }

    @Test
    public void checkGetSound() {
        String expected = "Мяу";
        assertEquals(expected, cat.getSound());
    }

    @Test
    public void checkGetFood() throws Exception{
        List<String> expection = List.of("Животные", "Птицы", "Рыба");
        assertEquals(expection, cat.getFood());
    }

}
