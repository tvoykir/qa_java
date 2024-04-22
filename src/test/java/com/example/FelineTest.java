package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {
    @Mock
    private Feline feline;

    @Test
    public void checkEatMeat() throws Exception{
        feline = new Feline();
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        assertEquals(expected, feline.eatMeat());
    }
    @Test
    public void checkGetFamily(){
        feline = new Feline();
        String expected = "Кошачьи";
        assertEquals(expected, feline.getFamily());
    }
    @Test
    public void checkGetKittensWithCount(){
        feline = new Feline();
        int kittens = 1;
        assertEquals(kittens, feline.getKittens(1));
    }
    @Test
    public void checkGetKittensWithoutCount(){
        feline = new Feline();
        int kittens = 1;
        assertEquals(kittens, feline.getKittens());
    }
    @Test
    public void checkGetKittensWithoutCountWithMock(){
        int kittens = 5;
        Mockito.when(feline.getKittens()).thenReturn(5);
        assertEquals(kittens, feline.getKittens());
    }
}
