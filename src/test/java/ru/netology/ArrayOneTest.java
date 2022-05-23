package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.function.BooleanSupplier;


public class ArrayOneTest {

    @Test
    public void userError() {
        String[] s = {"12 три"};

        Assertions.assertThrows(NumberFormatException.class, () -> ArrayOne.main(s));
    }


    @Test
    public void invalidInput() {
        String[] s = {"12 "};

        Assertions.assertThrows(ArrayIndexOutOfBoundsException.class, () -> ArrayOne.main(s));
    }


    @Test
    public void checkValueString() {
        String s = "12 end";

        String expected = "end";
        String result = ArrayOne.forMainScanner(s);


        Assertions.assertEquals(expected, result);

    }

    @Test
    public void checkValueInt() {
        String s  = "-12 3";

        int[] expected = {1, 3};
        int[] result = ArrayOne.calculatingPurchase(s);
        boolean b = Arrays.equals(expected, result);


        Assertions.assertTrue(b);

    }
}
