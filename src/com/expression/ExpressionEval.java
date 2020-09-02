package com.expression;

import java.util.*;

/**
 * Created by dineshs on 9/9/2019.
 */
public class ExpressionEval {

    public static void main(String[] args) {
        // A1 / B2 + 2 = A1 B2 / 2 +
        // 39 / B1 * B2 = 39 B1 B2 * /
        // A0 + A1 * A2 = A0 A1 A2 * +

        String exp = "A0+A1*A2";

        String expEval = getExpEvalSeq(exp);
        System.out.println("Exp :  " + expEval);
    }


    public static String getExpEvalSeq(String expression) {
        char[] mathOperators = {'*' , '/', '+' , '-' };
        String[] operandsArr = expression.split("[-+*/]");
        String operandsArrStr = Arrays.toString(operandsArr);
        List<String> operatorList = new ArrayList<String>();
        StringBuilder expressionEval = new StringBuilder();
        /*String[] operatorArr = new String[expression.length() - operandsArrStr.length()];
        int index = 0;*/

        for (int i = 0; i < expression.length(); i++) {
            if( expression.charAt(i)  =='/' || expression.charAt(i)  =='*' || expression.charAt(i)  =='+' || expression.charAt(i)  =='-') {
                operatorList.add(String.valueOf(expression.charAt(i)));
            }
        }

        //String[] operatorArr = operatorList.toArray(new String[operatorList.size()]);
        // int operator
        boolean operatorNeeded = false;

        for (int j=0; j < operandsArr.length; j++) {

            if(!operatorNeeded) {
                expressionEval.append(operandsArr[j]).append(" ");
            }

        }

        return operandsArrStr;
    }
}
