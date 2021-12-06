package com.company;

public class Main {
    static int findMaxConsecutiveOnes(int[] nums) {
        int max=0;
        int largest = 0;
        for (int i=0;i<nums.length;i++){
            if (nums[i] == 1){
                max++;
            }else {
                max = 0;
            }
            if(largest<max) {
                largest = max;
            }
        }
        return largest;
    }
    public static void main(String[] args) {
	// write your code here.
        int [] nums={1,1,0,1,1,1,0,0,1,1,1,1,1};
        System.out.println(findMaxConsecutiveOnes(nums));
//        int[][] array = {
//                {1, 2, 3},
//                {4, 5, 6, 9},
//                {7},
//        };
//        for(int [] firstd:array){
//            for(int index :firstd) {
//                System.out.println(index);
//            }
//        }
//        System.out.println("-----------------------------------------");
//
//        int[][] [] dArray = {
//                {
//                        {1, -2, 3},
//                        {2, 3, 4}
//                },
//                {
//                        {-4, -5, 6, 9},
//                        {1},
//                        {2, 3}
//                }
//        };
//        for(int [] [] secDarray:dArray){
//            for(int [] firstd :secDarray){
//                for(int index:firstd){
//                    System.out.println(index);
//                }
//
//            }
//        }
//        // Copy 2d array into another an 2d array using loop
//        int[][] source = {
//                {1, 2, 3, 4},
//                {5, 6},
//                {0, 2, 42, -4, 5}
//        };
//        int[][] destination = new int[source.length][];
//        for (int i=0;i<destination.length;i++){
//            destination[i] = new int[source[i].length];
//            for (int j=0;j<destination[i].length;j++){
//                destination[i][j]=source[i][j];
//            }
//        }
//
//         System.out.println(Arrays.deepToString(destination));
//        System.out.println("-----------------------------------------");
//        // Copy 2d array into another an 2d array using ArrayToCopy
//
//        for(int i=0;i< source.length;i++){
//            destination[i] = new int[source[i].length];
//            System.arraycopy(source[i] ,0,destination[i],0,destination[i].length);
//        }
//        System.out.println(Arrays.deepToString(destination));

    }
}
