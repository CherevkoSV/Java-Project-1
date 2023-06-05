package com.example.java_hw6;

public class Credit {
    private double loanAmount;
    private double annualInterestRate;
    private int loanTermInMonths;

    public double getMonthlyPayment() {
        double monthlyInterestRate = annualInterestRate / 12.0;
        return (loanAmount * monthlyInterestRate) / (1 - Math.pow(1 + monthlyInterestRate, -loanTermInMonths));
    }

    public Credit(double loanAmount, double annualInterestRate, int loanTermInMonths) {
        this.loanAmount = loanAmount;
        this.annualInterestRate = annualInterestRate;
        this.loanTermInMonths = loanTermInMonths;
    }
}
