package com.company;

public class Saving implements Account {
    final double interestRate = 0.5;
    @Override
    public double computerInterest(double amount) {
        return this.interestRate * amount;
    }
}
