package com.company;

public class FirstClass {
    public static void main(String[] args){
        //starting point

        String myVar;
        myVar="hello it is a beautiful day";
        int a=100;
        int b=200;
        System.out.println("hello");
        printHello();
        printHello(myVar);
        int result= sumThese(a,b);
        System.out.println(result);
    }
    static void printHello(){
        System.out.println("hello there...");
    }
    static void printHello(String name){ //  this method does not return something
        System.out.println(name);
    }

    static int sumThese(int firstnum,int secondnum){ // this method return value of datatype int;
        return firstnum + secondnum;
    }
}
