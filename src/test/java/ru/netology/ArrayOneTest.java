package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
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
    public void checkValue() {
        String s = "12 end";

        String expected = "end";
        String result = ArrayOne.forMainScanner(s);


        Assertions.assertEquals(expected, result);

    }
}
