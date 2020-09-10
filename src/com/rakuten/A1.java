package com.rakuten;

/**
 * Created by dineshs on 9/10/2020.
 */
public class A1 {
    public static void main(String[] args) {
        int[] arr = {1, 4, 3, -1, 2};
        int[] arr1 = {1, 4, 7, 3, 8, 6, 9, 6, 5, -1};
        int[] arr2 = {1, 4, 7, 3, 8, 6, 9, 6, 5, 3, 9, 0, 7, 6, -1};
        int[] arr3 = {1, 4, 7, 3, 8, 6, 9, 6, 5, 4, 6, 8, 3, 2, 1, 6, 7, 3, 9, -1};

        System.out.println("ans....: " + solution(arr));
        System.out.println("ans....: " + solution(arr1));
        System.out.println("ans....: " + solution(arr2));
        System.out.println("ans....: " + solution(arr3));

        System.out.println("================================");

        System.out.println("ans....: " + solutionOptimized(arr));
        System.out.println("ans....: " + solutionOptimized(arr1));
        System.out.println("ans....: " + solutionOptimized(arr2));
        System.out.println("ans....: " + solutionOptimized(arr3));

    }

    public static int solution(int[] arr) {
        boolean hasNext = true;
        int listNodeCount = 0;
        int currentIndex = 0;
        int nextIndex = -1;
        int[] utilizedIdx = new int[arr.length];

        if(arr == null || arr.length == 0) {
            return 0;
        }

        while(hasNext) {
            if(utilizedIdx[currentIndex] == 1) { //loop inside the linkedlist
                return listNodeCount;
            }else {
                utilizedIdx[currentIndex] = 1;
            }

            listNodeCount++;
            nextIndex = arr[currentIndex];

            if(nextIndex == -1) {
                hasNext = false;
            }

            currentIndex = nextIndex;
        }

        return listNodeCount;
    }

    public static int solutionOptimized(int[] arr) {
        boolean hasNext = true;
        int listNodeCount = 0;
        int currentIndex = 0;
        int[] utilizedIdx = new int[arr.length];

        if(arr == null || arr.length == 0) {
            return 0;
        }

        while(hasNext) {
            if(utilizedIdx[currentIndex] == 1) { //loop inside the linkedlist
                return listNodeCount;
            }else {
                utilizedIdx[currentIndex] = 1;
            }

            listNodeCount++;
            currentIndex = arr[currentIndex];

            if(currentIndex == -1) {
                hasNext = false;
            }
        }

        return listNodeCount;
    }

    public static int solutionAlternative(int[] arr) {
        int length = 1;
        int first = arr[0];
        int next = 0;
        boolean isFind = false;
        while (!isFind){

            if(length == 1){
                next = arr[first];
            }else{
                next = arr[next];
            }
            length++;
            if(next == -1){
                isFind = true;
            }
        }
        return length;
    }
}
