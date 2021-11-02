package com.company;

public class Checking implements Account {
    final  double interestRate = 0.03;
    @Override
    public double computerInterest(double amount) {
        return this.interestRate * amount;
    }
}
