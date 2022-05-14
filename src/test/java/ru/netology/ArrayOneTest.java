package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.NoSuchElementException;
import java.util.function.BooleanSupplier;


public class ArrayOneTest {

    @Test
    public void userError() {
        InputStreamReader isNull = new InputStreamReader(System.in);
        // тут в значение isNull я планировал передавать с консоли не цифру
        Assertions.assertThrows(NumberFormatException.class, () -> ArrayOne.main(ArrayOne.forMainArgs( )));
    }


    @Test
    public void invalidInput() {
        InputStreamReader isDigital = new InputStreamReader(System.in);
        // тут в значение isDigital я планировал передавать с консоли только одно значение
        Assertions.assertThrows(ArrayIndexOutOfBoundsException.class, () -> ArrayOne.main(ArrayOne.forMainArgs( )));
    }


    @Test
    public void inappropriateValue() {
        InputStreamReader isInvalid = new InputStreamReader(System.in);
        // тут в значение isInvalid я планировал передавать с консоли передать пустую строку
        Assertions.assertThrows(NoSuchElementException.class, () -> ArrayOne.main(ArrayOne.forMainArgs( )));

    }
}
