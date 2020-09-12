package com.codetest;

import java.util.Arrays;

/**
 * Created by dineshs on 9/12/2020.
 */
public class ConvertObjArrIntArr {

    public static void main(String[] args) {

        Object[] intObjArr = {1,2,3};
        Object[] strObjArr = {"Hello", "Hi", "How"};
        Integer[] destinationIntArr = new Integer[intObjArr.length];
        Integer[] destinationStrArr = new Integer[strObjArr.length];

        System.arraycopy(intObjArr, 0, destinationIntArr, 0, intObjArr.length);
        System.arraycopy(intObjArr, 0, destinationStrArr, 0, strObjArr.length);

        Integer[] intArr = Arrays.copyOf(intObjArr, intObjArr.length, Integer[].class);
        String[] stringArray = Arrays.copyOf(strObjArr, strObjArr.length, String[].class);

    }
}
