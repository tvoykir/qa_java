package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    private static final int EXPECTED_KITTENS = 3;
    private static final String SEX = "Самец";
    private static final List<String> EXPECTED_FOOD = List.of("Картоха", "Береза");

    private Lion lion;

    @Mock
    private Feline feline;

    @Test(expected = Exception.class)
    public void checkWrongSex() throws Exception {
        lion = new Lion(feline, "Макбук");
    }

    @Test
    public void checkGetKittens() throws Exception {
        lion = new Lion(feline, SEX);
        Mockito.when(feline.getKittens()).thenReturn(EXPECTED_KITTENS);
        assertEquals(EXPECTED_KITTENS, lion.getKittens());
        Mockito.verify(feline).getKittens();
    }

    @Test
    public void checkGetFood() throws Exception {
        lion = new Lion(feline, SEX);
        Mockito.when(feline.getFood(Mockito.anyString())).thenReturn(EXPECTED_FOOD);
        assertEquals(EXPECTED_FOOD, lion.getFood());
        Mockito.verify(feline).getFood(Mockito.anyString());
    }
}