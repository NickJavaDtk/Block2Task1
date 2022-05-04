package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.function.BooleanSupplier;


public class ArrayOneTest {

    @Test
    public void countCannotBeNegative() {
        String sTest = "12 -5";
        int[] testArray = ArrayOne.calculatingPurchase(sTest);
        boolean b = (testArray[0] > 0 && testArray[1] > 0) ? true : false;
        Assertions.assertTrue(b);
    }


    @Test
    public void exceededArraySize() {
        String sTest = "3 12";
        Assertions.assertThrows(ArrayIndexOutOfBoundsException.class, () -> ArrayOne.calculatingPurchase(sTest));
    }


    @Test
    public void inappropriateValue() {
        String sTest = "три 12";
        Assertions.assertThrows(NumberFormatException.class, () -> ArrayOne.calculatingPurchase(sTest));

    }
}
