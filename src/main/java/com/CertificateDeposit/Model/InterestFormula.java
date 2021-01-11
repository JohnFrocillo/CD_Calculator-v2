package com.CertificateDeposit.Model;

public class InterestFormula {
    private double A; // Final amount
    private double P; // Initial principal balance
    private double r; // Interest rate
    private double n; // Number of times interest applied per time period
    private double t; // Number of time periods elapsed

    public InterestFormula(double P, double r, double n, double t) {
        this.P = P;
        this.r = r;
        this.n = n;
        this.t = t;

        this.A = calculateResult(P,r,n,t);
    }

    // Use formula A = P(1+r/n)^(nt)
    public double calculateResult(double P, double r, double n, double t) {
        double result;
        result = P * Math.pow(1 + (r/n), n*t);

        return result;
    }

    public double getA() {
        return this.A;
    }

    public void setA(double A) {
        this.A = A;
    }

    public double getP() {
        return this.P;
    }

    public void setP(double P) {
        this.P = P;
    }

    public double getR() {
        return this.r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getN() {
        return this.n;
    }

    public void setN(double n) {
        this.n = n;
    }

    public double getT() {
        return this.t;
    }

    public void setT(double t) {
        this.t = t;
    }


}