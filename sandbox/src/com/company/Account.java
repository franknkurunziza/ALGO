package com.company;

public interface Account {
        double computerInterest(double amount);

       default void greet(){
            System.out.println("welcome");
        }
}
