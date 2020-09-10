package com.rakuten;

import java.util.*;

/**
 * Created by dineshs on 9/11/2020.
 */
public class A3 {

    public String solution(int N, String S, String T) {
        int sinkCount = 0;
        int hitCount = 0;
        Set<String> hits = new HashSet<>(Arrays.asList(T.split(" ")));
        String[] ships = S.split(",");
        for (String ship : ships) {
            Set<String> shipContainsCells = new HashSet<>();
            char[] temp = ship.toCharArray();
            char top = temp[0];
            char left = temp[1];
            char bottom = temp[3];
            char right = temp[4];
            for (char i = top; i <= bottom; i++) {
                for (char j = left; j <= right; j++) {
                    shipContainsCells.add(String.valueOf(i) + j);
                }
            }
            if (hits.containsAll(shipContainsCells)) {
                sinkCount++;
            } else if(!Collections.disjoint(hits,shipContainsCells)) {
                hitCount++;
            }
        }
        return  sinkCount + "," + hitCount;
    }
}

