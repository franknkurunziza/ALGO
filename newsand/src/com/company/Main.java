package com.company;



import java.util.ArrayList;
import java.util.Collections;
public class Main {
        public static void main(String args[]) {
            int [] arr={1,2,3,5};
            int k=3;
            int sum=0;
            ArrayList<Integer> newArr = new ArrayList<Integer>();
            for(int i=0;i<arr.length;i++){
                for(int j=i+1;j<arr.length;j++){
                    // System.out.println("i ="+i+"j="+j);
                    sum=arr[i]+arr[j];
                    // System.out.println("sum="+sum);
                    newArr.add(sum);
                    newArr.sort(Collections.reverseOrder());
                }
            }

            System.out.print("the k-th sum paired is : "+newArr.get(k-1));
        }
    }

