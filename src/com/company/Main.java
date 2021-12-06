package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Main tester=new Main();
//        List<String> pointList=new ArrayList();
//        pointList.add("1");
//        pointList.add("2");
//
//        pointList.forEach(p -> {
//            System.out.println(p);
//        });
        MathOperation addition = (int a, int b) -> a + b;
        System.out.println("10 + 5 = " + tester.operate(10, 5, addition));
    }
    interface MathOperation {
        int operation(int a, int b);
    }

    private int operate(int a,int b, MathOperation mathOperation) {
        return mathOperation.operation(a,b);
    }

}
