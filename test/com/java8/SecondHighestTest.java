package com.java8;

import org.junit.Test;

import static org.junit.Assert.*;

public class SecondHighestTest {

    @Test
    public void testFindSecondHigh() throws Exception {
        SecondHighest sh = new SecondHighest();
        int[] arr = {14, 46, 47, 45, 92, 52, 48, 36, 66, 85};

        //assertEquals(86, sh.findSecondHigh(arr));
        assertEquals(85, sh.findSecondHigh(arr));
    }
}