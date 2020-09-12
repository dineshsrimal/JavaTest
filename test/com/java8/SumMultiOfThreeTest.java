package com.java8;

import org.junit.Test;

import static org.junit.Assert.*;

public class SumMultiOfThreeTest {

    @Test
    public void testSumMultiOfThree() throws Exception {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        SumMultiOfThree sumMultiOfThree = new SumMultiOfThree();

        //assertEquals(19, sumMultiOfThree.sumMultiOfThree(arr));
        assertEquals(18, sumMultiOfThree.sumMultiOfThree(arr));

    }
}