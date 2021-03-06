package com.casib;

/**
 * Created by dineshs on 7/9/2019.
 */
public class Shuffle {
    public static void main(String[] args) {

        System.out.println(solution(123456));
        System.out.println(solution2(123456));

        System.out.println(solution(130));
        System.out.println(solution2(130));

    }

    public static int solution2(int A) {
        String numberStr = String.valueOf(A);
        int size = numberStr.length();
        char[] characterArr = new char[size];
        int k = 0;

        for(int i = 0, j = size - 1; i <= j; i++, j--) {

            if(i!=j) {
                characterArr[k] = numberStr.charAt(i);
                characterArr[++k] = numberStr.charAt(j);
            }else {
                characterArr[k]= numberStr.charAt(i);
            }

            k++;
        }

        return Integer.parseInt(String.valueOf(characterArr));
    }

    public static int solution(int A) {
        String number = String.valueOf(A);
        int size = number.length();
        char[] characters = new char[size];
        int i = 0, j = size - 1, k = 0;
        while (i <= j) {
            characters[k++] = number.charAt(i);
            if (i != j) {
                characters[k++] = number.charAt(j--);
            }
            i++;
        }
        return Integer.parseInt(String.valueOf(characters));
    }
}
