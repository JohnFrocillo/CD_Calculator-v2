package com.CertificateDeposit.Model;

public class Bank {
    private String name;
    private double P; // Initial Principle Amount
    private double r; // Interest Rate
    private double n; // Number of times interest applied per time period
    private double t; // Number of time periods elapsed
    private double A; // result of the CD

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
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

    public double getA() {
        return this.A;
    }

    public void setA(double A) {
        this.A = A;
    }

}
