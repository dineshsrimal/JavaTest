package com.company;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by dineshs on 2/27/2019.
 */
public class CountPairs {

    public static void main(String[] args) {

        int[] arr = {1,2,3,6,7,8,9,1};
        System.out.println(CountPairs.countPairsWithDiffK(arr, arr.length, 10));
        System.out.println(CountPairs.countPairsWithDiffK1(arr, arr.length, 10));
    }

    static int countPairsWithDiffK(int arr[], int n, int k)
    {
        int count = 0;
        Map<String, Integer> pairs = new HashMap<String, Integer>();


        // Pick all elements one by one
        for (int i = 0; i < n; i++)
        {
            // See if there is a pair
            // of this picked element
            for (int j = i + 1; j < n; j++) {

                if (!(pairs.containsKey(arr[i] + "," + arr[j]) || pairs.containsKey(arr[j] + "," + arr[i])) && (arr[i] + arr[j] == k)) {
                    //if (arr[i] + arr[j] == k) {
                        count++;
                        pairs.put(arr[i] + "," + arr[j], 1);
                    //}
                }

            }

        }
        return count;
    }



    static int countPairsWithDiffK1(int arr[], int n, int k)
    {
        int count = 0;
        Set<String> pairs = new HashSet<String>();

        for (int i = 0; i < n; i++)
        {
            for (int j = i + 1; j < n; j++) {

                if (!(pairs.contains(arr[i] + "," + arr[j]) || pairs.contains(arr[j] + "," + arr[i])) && (arr[i] + arr[j] == k)) {
                    count++;
                    pairs.add(arr[i] + "," + arr[j]);
                }
            }
        }
        return count;
    }


}
