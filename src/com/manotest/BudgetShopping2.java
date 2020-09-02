package com.manotest;

/**
 * Created by dineshs on 9/1/2020.
 */
public class BudgetShopping2 {

    static int budgetShopping(int n, int[] bundleQuantities, int[] bundleCosts) {
        return exploreCombinations(n, 0, 0, bundleQuantities, bundleCosts);
    }

    static int exploreCombinations(int budget, int currentQuantity, int currentCost, int[] bundleQuantities, int[] bundleCosts) {
        int maxQuantity = currentQuantity;
        for (int i = 0; i < bundleQuantities.length; i++) {
            if (currentCost + bundleCosts[i] <= budget) {
                int amount = exploreCombinations(budget, currentQuantity + bundleQuantities[i], currentCost + bundleCosts[i], bundleQuantities, bundleCosts);
                if (maxQuantity < amount) {
                    maxQuantity = amount;
                }
            }
        }
        return maxQuantity;
    }
}
