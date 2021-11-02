package com.company;

import java.util.Arrays;

public class number {
    public static void main(String[] args) {
        String name="Nkurunzia";
        StringBuilder  str= new StringBuilder(name);
        str.insert(name.length()-1,"z");
        //StringBuilder  str= new StringBuilder("frank");
        //System.out.println(str);
        str.append("Frank");


        System.out.println(str.toString());
        System.out.println(name.hashCode());
        System.out.println(str.hashCode());
       // ------------------------------------------------
        String a="a";
        String b="b";
        System.out.println(a.equals(b));


        int count = 0;
        int [] num={17,501,482,1771};
        // loop through array
        for(int i:num){
            // fing digits made a number
            int nuwNum=(int) (Math.log10(i)+1);
            // check the number of digit in nums that are even
            if(nuwNum%2==0){
                count++;
            }
        }
        System.out.println(count);
        System.out.println("--------------------------------------");
        int [] nums={-4,-1,0,3,10};
        // loop through the array and square each number
        for(int i=0;i<nums.length;i++){
            nums[i]*=nums[i];
        }
        //Using Arrays class to use sort method and sort every element of array from small to big;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            System.out.println(nums[i]);
        }


                System.out.println("Checking total amount");
                Account checking = new Checking();
                checking.greet();
                double tc = checking.computerInterest(8000.0);
                System.out.println(tc);

                System.out.println("saving total amount");
                Account saving = new Saving();
                saving.greet();
                double ts = saving.computerInterest(8000.0);
                System.out.println(ts);
            }
        }
