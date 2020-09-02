package com.manotest;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

/**
 * Created by dineshs on 9/1/2020.
 */
public class BudgetShopping3 {

    static int budgetShopping(int n, int[] bundleQuantities, int[] bundleCosts) {

        if (n <= 0
                || bundleCosts == null || bundleQuantities == null
                || bundleQuantities.length == 0
                || bundleCosts.length != bundleQuantities.length
                ) {
            return 0;
        }

        AtomicInteger max = new AtomicInteger(0);

        calculateRecursive(n, bundleCosts, bundleQuantities, max, 0, 0);

        return max.get();
    }

    private static void calculateRecursive(int n, int[] cost, int[] quantity, AtomicInteger max, int position, int count) {
        if (n == 0 || position == cost.length) {
            if (count>max.get()) {
                max.set(count);
            }
            return;
        }
        IntStream.rangeClosed(0, n / cost[position]).forEach(i -> calculateRecursive(n - i * cost[position],
                cost, quantity, max, position + 1, count + i * quantity[position]));
        IntStream.rangeClosed(0, n / cost[position]).parallel();
    }

}
