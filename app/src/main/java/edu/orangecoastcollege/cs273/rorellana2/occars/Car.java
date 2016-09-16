package edu.orangecoastcollege.cs273.rorellana2.occars;

/**
 * Created by rorellana2 on 9/15/2016.
 */

public class Car {

    private double mDownPayment;
    private int mLoanTerm;
    private double mPrice;
    final double TAX_RATE = 0.08;

    public double calculateBorrowedAmount() {
        return calculateTotalCost() - mDownPayment;
    }

    public double calculateInterestAmount() {
        double x;
        if (mLoanTerm == 3)
            x = 0.0462 * calculateBorrowedAmount();
        else if (mLoanTerm == 4)
            x = 0.0416 * calculateBorrowedAmount();
        else
            x = 0.0419 * calculateBorrowedAmount();
        return x;
    }

    public double calculateMonthlyPayment() {
        return (calculateInterestAmount() + calculateBorrowedAmount()) / (mLoanTerm * 12);
    }

    public double calculateTaxAmount() {
        return mPrice * TAX_RATE;
    }

    public double calculateTotalCost() {
        return mPrice + calculateTaxAmount();
    }


    public double getDownPayment() {
        return mDownPayment;
    }

    public void setDownPayment(double mDownPayment) {
        this.mDownPayment = mDownPayment;
    }

    public int getLoanTerm() {
        return mLoanTerm;
    }

    public void setLoanTerm(int mLoanTerm) {
        this.mLoanTerm = mLoanTerm;
    }

    public double getPrice() {
        return mPrice;
    }

    public void setPrice(double mPrice) {
        this.mPrice = mPrice;
    }
}
