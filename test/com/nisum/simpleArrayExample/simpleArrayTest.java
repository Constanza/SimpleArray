package com.nisum.simpleArrayExample;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by constanza on 23-08-16.
 */
public class simpleArrayTest {
    private SimpleArray listado = new SimpleArray();

    @Test
    public void checkInstance() {
        Assert.assertNotNull(listado);
    }

    @Test
    public void checkSumTest(){
        int[] num = {1,2};
        Assert.assertEquals(3, listado.sumar(num));
    }

    @Test(expected = NullPointerException.class)
    public void checkArrayIsEmpty() {
        int[] num = null;
        Assert.assertNotNull(listado.sumar(num));
    }

    @Test
    public void checkPrimeNumbers() {
        int num = 113;
        Assert.assertTrue(listado.esPrimo(num));
    }
}