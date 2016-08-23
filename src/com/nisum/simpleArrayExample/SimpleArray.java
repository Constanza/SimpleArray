package com.nisum.simpleArrayExample;

/**
 * Created by constanza on 23-08-16.
 */
public class SimpleArray {
    public int sumar(int[] num) throws NullPointerException {
        int sum = 0;
        if (num == null) {
            throw new NullPointerException();
        }
        for (int i=0;i<num.length;i++){
            sum += num[i];
        }
        return sum;
    }


}
