package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int[][] array = {
                {1, 2, 3},
                {4, 5, 6, 9},
                {7},
        };

        for(int [] firstd:array){
            for(int index :firstd) {
                System.out.println(index);
            }
        }
        System.out.println("-----------------------------------------");

        int[][] [] dArray = {
                {
                        {1, -2, 3},
                        {2, 3, 4}
                },
                {
                        {-4, -5, 6, 9},
                        {1},
                        {2, 3}
                }
        };
        for(int [] [] secDarray:dArray){
            for(int [] firstd :secDarray){
                for(int index:firstd){
                    System.out.println(index);
                }

            }
        }
    }
}
